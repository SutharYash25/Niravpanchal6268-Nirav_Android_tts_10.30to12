
/*Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. 
The method for printing area of a rectangle has two parameters which are 
length and breadth respectively while the other method for printing area 
of square has one parameter which is side of square.*/
import java.util.Scanner;

class maths{
	
	public void math(int s)
	{
		
		int a=4*s;
		
		System.out.println("Area of Square::"+a);
	}
	public void math(int l,int b)
	{
		
		int r = l*b;
		System.out.println("Area of Recatangle::"+r);
		
	}
	
	
}
public class M10 {
	public static void main(String[] args) {
		maths obj =new maths();
		System.out.println("Square ");
		Scanner sc = new Scanner(System.in);
		int sq,lh,bd;
		System.out.println("Enter Square side::");
		sq = sc.nextInt();
		obj.math(sq);
		System.out.println("________________________________");
		System.out.println(" Rectangle");
		System.out.println("Enter  Rectangle leangth::");
		lh= sc.nextInt();
		System.out.println("Enter Rectangle width");
		bd =sc.nextInt();
		obj.math(lh, bd);
		
		
		
	}

}


