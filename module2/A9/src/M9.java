/*Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters. For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n)*/

class print{
	 public void show(int n,char c)
		{
			System.out.println("int data::"+n);
			System.out.println("char  date::"+c);
		}
	 public void show(char c,int n)
	 {
		 System.out.println("char data::"+c);
		 System.out.println("int data::"+n);
	 }
	 
}
   public class M9 {
	public static void main(String[] args) {
		print obj =new print();
		obj.show(5, 'J');
		obj.show('c', 5);
	}
				
	}

