/*Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the 
rectangle respectively. Its constructor having parameters for length and 
breadth is used to initialize the length and breadth of the rectangle. Let 
class 'Square' inherit the 'Rectangle' class with its constructor having a 
parameter for its side (suppose s) calling the constructor of its parent class 
as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
*/
class Rectangle {
	int length,breadth;

	public Rectangle(int l,int b)
	{
		this.length = l;
		this.breadth =b; 
	}
	 void print_area()
	{
		System.out.println(length* breadth);
	}
	 void print_perimeter()
	 {
		 System.out.println(2*(length+breadth));
	 }
}
 class Square extends Rectangle{
	 public Square(int s)
	 {
		 super(s, s);
		 
	 }
	 
 }
public class M13 {
	 	public static void main(String[] args) {
			Rectangle r = new Rectangle(40, 58);
			Square s =new Square(5);
			System.out.print("The area of Ranctangle is::");
			r.print_area();
			System.out.print("the perimeter of Ractangle is::");
			r.print_perimeter();
			System.out.print("The area of Square::");
			s.print_area();
			System.out.print("The perimeter of Square::");
			s.print_perimeter();
		}
}
