/* W.A.J. P to implement the above program (pro.no-B27) using nesting of 
try-catch block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}*/
public class M25 {
 public static void main(String[] args) { 
	  try {
		
		  int a[] = new int[5]; 
		  a[5]= 30/0;
		try {
			
			a[5]=30/3;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ind ");
		}  
	} catch (ArithmeticException e) {
		System.out.println("arithmetic");
		
	}
}
}
