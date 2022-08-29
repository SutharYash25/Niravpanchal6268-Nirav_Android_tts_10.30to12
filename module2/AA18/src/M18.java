/*We have to calculate the percentage of marks obtained in three subjects 
(each out of 100) by student A and in four subjects (each out of 100) by 
student B. Create an abstract class 'Marks' with an abstract method 
'getPercentage'. It is inherited by two other classes 'A' and 'B' each having 
a method with the same name which returns the percentage of the 
students. The constructor of student A takes the marks in three subjects 
as its parameters and the marks in four subjects as its parameters for 
student B. Create an object for each of the two classes and print the 
percentage of marks for both the students.
*
*/
abstract class Marks {
	public abstract float getPercentage();
}

class A {
	float marks1, marks2, marks3;

	A(float m1, float m2, float m3) {
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		
	}
	public float getPercentage() {
		float ans = (float)(((marks1 + marks2 + marks3) / 300) * 100);
		return ans;

	}

}

class B {
	float marks1, marks2, marks3, marks4;

	B(float m1, float m2, float m3, float m4) {
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.marks4 = m4;

	}

	public float getPercentage() {
		float ans = ((marks1 + marks2 + marks3 + marks4) / 400 * 100);
		return ans;

	}
}

public class M18 {
	public static void main(String[] args) {
		A a = new A(85, 96, 59);
		System.out.println("Student A::" + a.getPercentage());
		B b = new B(50, 60, 78, 59);
		System.out.println("Student B::" + b.getPercentage());

	}

}
