/*Write a Java program that reads a positive integer and count the number 
of digits the number.
Input an integer number less than ten billion: 125463 Number of digits in 
the number: 6*/
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int cont=0;
	System.out.println("Enter Number::");
	long a=sc.nextLong();
	if(a<0&&a>=1000000000) {
		System.out.println("Invaild input");
	}
	else {
		while(a!=0)
		{
			a=a/10;
			cont++;
		}
		System.out.println("number of digit is ::"+cont);
			
	}
	
	}
}
	