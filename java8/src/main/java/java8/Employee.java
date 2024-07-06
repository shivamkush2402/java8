package java8;

public class Employee {

	public String name;
	public String designation;
	public double salary;
	public String city;

	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
	}

//	public boolean equals(Object obj) {
//		Employee e = (Employee) obj;
//		if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city.equals(e.city)) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
