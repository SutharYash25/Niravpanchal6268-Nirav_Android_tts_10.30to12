import java.util.Scanner;

/*W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. lang. ArithmeticException: not valid
*/
public class M28 {
	public static void main(String[] args) {
		try {
			Scanner sc =  new Scanner(System.in);
			System.out.println("enter Age");
			int a=sc.nextInt();
			if (a<18)
			{
				throw new ArithmeticException("Artithmetic Exception");
			}
			else {
				System.out.println("welcome to vote");
			}
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
