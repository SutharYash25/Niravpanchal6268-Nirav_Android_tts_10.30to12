/*Write a program in Java to input 5 numbers from keyboard and find their 
sum and average using for loop*/


import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		int i,sum=0,n=0;
		double avg;
		System.out.println("Enter 5 no.::");
		for(i=0;i<5;i++)
		{
			Scanner sc= new Scanner(System.in);
			 n =sc.nextInt();
			 sum =sum+n;
		}
		System.out.println(sum);
		avg = sum/5;
		System.out.println("The sum of five no.is::"+sum +"\nThe average is ::"+avg);
		
				
	}

}
