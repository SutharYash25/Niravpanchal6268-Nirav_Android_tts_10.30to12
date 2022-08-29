import java.util.Scanner;

/*We have to calculate the area of a rectangle, a square and a circle. Create 
an abstract class 'Shape' with three abstract methods namely 
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its 
length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
is its radius. Now create another class 'Area' containing all the three 
methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 
'Area' and call all the three methods. */
abstract class Shape{
	abstract void RectangleArea(int length,int breadth);
	abstract void SquareAre(int side);
	abstract void CircleAre(double radius);
}
    class Area extends Shape{
	   @Override
		void RectangleArea(int length,int breadth)
		{
			System.out.println("Area ofRectangle:"+2*(length+breadth));
		}
		
		@Override
		void SquareAre(int side) {
			System.out.println("Area of Sqare:"+4*(side));
			
		}
		@Override
		void CircleAre(double radius) {
			System.out.println("Circle:"+3.14*radius*radius);
			
		}

		
	
}

public class M20 {
	public static void main(String[] args) {
		Area a=new Area();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  leangth and Breadth for Rectangle:");
		int l =sc.nextInt();
		int b =sc.nextInt();
		System.out.println("Enter side for Sqare:");
		int s=sc.nextInt();
		System.out.println("Enter Radius for Circle");
		double r=sc.nextDouble();
		a.RectangleArea(l,b);
		a.SquareAre(s);
		
		a.CircleAre(r);
		
	}

}
