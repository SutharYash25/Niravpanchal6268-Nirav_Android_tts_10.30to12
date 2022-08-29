import java.util.Scanner;

/* Write a program which will ask 
the user to enter his/her marks (out of 100). Define a method that will 
display grades according to the marks entered as below:
MarksGrade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail*/
class school {

	void display()
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter marks");
	      int a= sc.nextInt();
	      if(a<=100 && a>=91 )
	      {
	    	  System.out.println("Grade::AA");
	      }
	      else if(a<=90 && a>=81) 
	      {
	    	  System.out.println("grade :AB");
	      }
	      else if(a<=80 && a>=71) {
	    	  System.out.println("Grade:BB");
	      }
	      else if(a<=70 && a>=61)
	      {
	    	  System.out.println("Grade::BC");
	      }
	      else if(a<=60 && a>=51)
	      {
	    	  System.out.println("Grade::CD");
	      }
	      else if(a<=50 && a>=40) {
	    	  System.out.println("Grade::DD");
	      }
	      else {
	    	  System.out.println("grand::fail");
	      }
	 
	}
}

public class M21 {
	public static void main(String[] args) {
		school s = new school();
		s.display();
	}

}
