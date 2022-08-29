import java.util.Scanner;

/*W.A.J. P to demonstrate try catch block,
 Take two numbers from the user and perform the division operation and 
handle Arithmetic Exception. O/PEnter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/
public class M23 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try {
		int ans=a/b;
		System.out.println(ans);
		
	} catch (ArithmeticException e) {
		System.out.println("not divied by zero");
	}
}
}
