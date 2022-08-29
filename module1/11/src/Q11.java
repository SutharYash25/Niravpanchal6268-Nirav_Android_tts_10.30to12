/*Write a Java program that accepts an integer (n) and computes the value 

of n+nn+nnn.
Input number: 5
5 + 55 + 555
*/
import java.util.Scanner;

public class Q11 

{
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number::");
		num =sc.nextInt();
		System.out.printf("%d + %d%d + %d%d%d ",num,num,num,num,num,num);
		
		
	}

}
