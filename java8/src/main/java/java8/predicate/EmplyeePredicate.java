package java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java8.Employee;

public class EmplyeePredicate {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		populate(empList);

		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
		System.out.println();

		// All the Managers Information

		Predicate<Employee> managers = emp -> emp.getDesignation().equals("Manager");
		System.out.println("All the Managers Information : ");
		display(managers, empList);

		// All employees who belong to Indore city
		Predicate<Employee> indoreEmp = emp -> emp.getCity().equalsIgnoreCase("Indore");
		System.out.println("All employees who belong to Indore city :");
		display(indoreEmp, empList);

		// All employees whose salary is less than 40000
		Predicate<Employee> salaryLessThen = e -> e.getSalary() < 40000.0;
		System.out.println("All employees whose salary is less than 40000 :");
		display(salaryLessThen, empList);

		// All managers who are from Indore.
		Predicate<Employee> indoreManager = emp -> emp.getDesignation().equalsIgnoreCase("Manager")
				&& emp.getCity().equalsIgnoreCase("Indore");
		System.out.println("All managers who are from Indore :");
		display(indoreManager, empList);

		// All Developer
		Predicate<Employee> developer = emp -> emp.getDesignation().equalsIgnoreCase("Developer");
		System.out.println("All Developer : ");
		display(developer, empList);

		// All QA
		Predicate<Employee> qa = emp -> emp.getDesignation().equalsIgnoreCase("QA");
		System.out.println("All QA : ");
		display(qa, empList);

		// to check Employee Developer or Not
		Predicate<Employee> isDeveloper = emp -> emp.getDesignation().equalsIgnoreCase("Developer");
		System.out.println("All Developer : ");
		for (Employee emp : empList) {
			if (isDeveloper.test(emp)) {
				System.out.println(emp.getName() + " is a Developer");
			} else {
				System.out.println(emp.getName() + " is not a Developer");
			}
		}

	}

	public static void display(Predicate<Employee> predicate, List<Employee> empList) {
		for (Employee emp : empList) {
			if (predicate.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println();
	}

	private static void populate(List<Employee> empList) {

		empList.add(new Employee("A", "Developer", 40000.0, "Indore"));
		empList.add(new Employee("B", "Developer", 45000.0, "Indore"));
		empList.add(new Employee("C", "QA", 30000.0, "Indore"));
		empList.add(new Employee("D", "Manager", 90000.0, "Indore"));
		empList.add(new Employee("E", "lead", 65000.0, "Banglore"));
		empList.add(new Employee("F", "lead", 60000.0, "Indore"));
		empList.add(new Employee("G", "Developer", 43000.0, "Banglore"));
		empList.add(new Employee("H", "QA", 33000.0, "Banglore"));
		empList.add(new Employee("I", "Manager", 100000.0, "Banglore"));
		empList.add(new Employee("J", "Developer", 50000.0, "Mumbai"));

	}
}
