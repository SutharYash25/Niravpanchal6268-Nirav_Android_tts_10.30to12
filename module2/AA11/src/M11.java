/*Create a class with a method that prints "This is a parent class" and its 
subclass with another method that prints "This is child class". Now, create 
an object for each of the class and call 1 - method of parent class by object 
of parent class 2 - method of child class by object of child class 3 - method 
of parent class by object of child class
*/

class parent{
	public void print(){
		System.out.println("This is a parent class");
	}
}
class child extends parent{
	 public void show()
	 {
		 System.out.println("This is a child class");
	 }	 
}
public class M11 {   
	
	public static void main(String[] args) {
		parent p=new parent();
		p.print();
		child c=new child();
		c.show();
		//child class call  parent class
		c.print();	
	}
}
