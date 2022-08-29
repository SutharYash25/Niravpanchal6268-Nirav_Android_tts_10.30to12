/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by 
zero exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/
public class M24 {
	public static void main(String[] args) {
		try {
			int a[] =new int[5];
			a[5]=30/3;
		
			
		} catch (ArithmeticException e) {
			System.out.println("this is Arithmetic Exceeotion ");
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("error ::This is Arry Indexout of Bounds Exception");
		}
	}

}
