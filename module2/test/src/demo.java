/*Create a class named 'Member' having the following members:
Data members 
Name
Age
Phone number
Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the 
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 
'department' respectively. Now, assign name, age, phone number, 
address and salary to an employee and a manager by making an object of 
both of these classes and print the same*/
class Memberd {
	private String name;
	private int age;
	private double phone_no;
	private String add;
	private double salary;

	public Memberd(String name, int age, double phone_no, String add, double salary) {
		
		this.name = name;
		this.age = age;
		this.phone_no = phone_no;
		this.add = add;
		this.salary = salary;
	}

	void printSalary() {
		System.out.println("Salary is " + salary);
	}

}

class Employee extends Memberd {
	private String Specialization;

	public Employee(String name, int age, double phone_no, String add, double salary, String Specialization) {
		super(name, age, phone_no, add, salary);
		this.Specialization = Specialization;
		System.out.print("name:" + name);
		System.out.print("Age :" + age);
		System.out.print("phone NO:" +phone_no);
		System.out.print("Address:" + add);
		System.out.print("Salary:" + salary);
		System.out.println("Spexialization:"+Specialization);
	}

}

class Manager extends Memberd {
	String Department;

	public Manager(String name, int age, double phone_no, String add, double salary) {
		super(name, age, phone_no, add, salary);

	}
}

 public class demo {
	public static void main(String[] args) {
		Employee e1 = new Employee("nirav", 20, 999880, "amd", 25000, "it");
		e1.printSalary();
			
	}
}