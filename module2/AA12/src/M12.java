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
class Member {
	private String name;
	private int age;
	private double phone;
	private String add;
	private double salary;

	public Member(String name, int age, double phone, String add, double salary) {// parent class
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.add = add;
		this.salary = salary;

	}

	public void printsalary() {
		System.out.println("salary ::" + salary);

	}
}

class Employee extends Member {
	private String specialization;

	public Employee(String name, int age, double phone, String add, double salary, String specialization) {
		super(name, age, phone, add, salary);
		this.specialization = specialization;
		System.out.println("This info Employee");
		System.out.println("Name:" + name);
		System.out.println("Age :" + age);
		System.out.println("phone NO:" +phone);
		System.out.println("Address:" + add);
		
		System.out.println("Spexialization:"+specialization);
	}

}

class Manager extends Member{
	private String department;
	public Manager(String name,int age,double phone ,String add,double salary,String department)
	{
		super(name, age, phone, add, salary);
		this.department=department;
		System.out.println();
		System.out.println("This info is Manager");
		System.out.println("name:" + name);
		System.out.println("Age :" + age);
		System.out.println("phone NO:" +phone);
		System.out.println("Address:" + add);
		
		System.out.println("Spexialization:"+department);
	}
	

}

public class M12 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Nirav", 20, 9998806855d, "ahmedabad", 25000d, "AD");
		e1.printsalary();
		Manager m1 =new Manager("raj",20 , 95898569563d, "amd",256325d,"IT");
		m1.printsalary();
		
	}
}
