package java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import java8.Employee;

public class EmployeeFunction {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		populate(empList);

		// To calculate Total Monthly Salary of all Employees
		Function<Employee, Double> f = emp -> emp.getSalary();

		double totalSalary = 0.0;
		for (Employee emp : empList) {
			totalSalary += f.apply(emp);
		}
		System.out.println("Total Monthly Salary of all Employees : " + totalSalary);

		Function<List<Employee>, Double> f1 = emp -> {
			double salary = 0.0;
			for (Employee e : emp) {
				salary += e.getSalary();
			}
			return salary;
		};
		System.out.println("Total Monthly Salary of all Employees : " + f1.apply(empList));

		// Find the Employee whose salary less than 50000 and then increment there
		// salary with 4000

		// check salary less then 50000 or not
		Predicate<Employee> emplessSalary = emp -> emp.getSalary() < 50000;

		// salary increment with 4000
		Function<Employee, Employee> incrementedSalary = emp -> {
			if (emp.getSalary() < 50000)
				emp.salary = emp.getSalary() + 4000;
			return emp;
		};

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		for (Employee emp : empList) {
//			if (emplessSalary.test(emp)) {
				employeeList.add(incrementedSalary.apply(emp));
//			}
		}

		System.out.println("Employee with Incremented Salary : " + employeeList);
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
