/*Write a program in Java to display the pattern like right angle triangle 
with a number. */


public class Q6 {
	public static void main(String[] args)
	{		
		int i,j;
		 for(i=1;i<=5;i++)
		 {
			  int num=1;
			 for(j=1;j<=i;j++) 
			 {
				
				 System.out.print(num);
				 num++;
			 }
			 
			 System.out.print("\n");
		 }
	}

}
