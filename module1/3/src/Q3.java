/*Write a Java program that takes a year from user and print whether that 
year is a leap year or not.*/


import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Year::");
		int y= sc.nextInt();
	
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println(" year is leap");
				}
				else {
				System.out.println("year is not leap");
			}
			}
			else {
			System.out.println(" Year is Leap");
		}
		}	
		else {
			System.out.println("year is not leap");
		}
		
	}

}
