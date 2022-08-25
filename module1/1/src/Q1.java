/*Write a Java program to Take three numbers from the user and print the 
greatest number.*/

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A::");
		int a= sc.nextInt();
		System.out.println("Enter B::");
		 int b = sc.nextInt();
		System.out.println("Enter C::");
		int c =sc.nextInt();
		 
		if (a>b && a>c) {
			System.out.println("The Grater number is A="+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("The Grater number is B="+b);
			
		}
		else {
			System.out.println("The Greater number is C="+c);
			
		}
		
	}

}
