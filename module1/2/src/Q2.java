/*Write a Java program that takes the user to provide a single character 
from the alphabet. Print Vowel or Consonant, depending on the user 
input. If the user input is not a letter (between a and z or A and Z), or is a 
string of length > 1, print an error message.
*/


import java.util.Scanner;

public class Q2 {

	 public static void main(String[] args)
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter input");	 
		 String a= sc.next();
	      boolean v;
		 if(a.length()>1)
		 {
			 System.out.println("invaild input!!please single charcter ");
		 }
		 else if( a.equals("a")||a.equals("A")||a.equals("e")||a.equals("E")||a.equals("I")||a.equals("i")
				   ||a.equals("o")||a.equals("O")||a.equals("u")||a.equals("U")) {
			System.out.println("this is vowel");
			 
		 }
		 else {
			 System.out.println("this chacter is consonant");
		 }
			 
		 
		 
	}
}
