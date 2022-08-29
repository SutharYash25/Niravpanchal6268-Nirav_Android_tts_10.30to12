/*Create a class named 'PrintNumber' to print various numbers of different 
data types by creating different methods with the same name 'printn' 
having a parameter for each data type.
*/

class printnumber{
	  
	public void Println(int a)
	  {
		  System.out.println("int type::"+a);
	  }
	public void Println(double b)
	{
		System.out.println("double type::"+b);
	}
	public void Println(String c) {
		
		System.out.println("String type::"+c);
	}
	  
}
public class M8 {
	public static void main(String[] args) {
		printnumber obj =new printnumber();
		
		obj.Println(5);
		obj.Println(5.4);
		obj.Println("Java");
	}

}
