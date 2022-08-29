/*Create a class named 'Shape' with a method to print "This is this is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the 
Shape class, both having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 'Square' of 
'Rectangle' having a method to print "Square is a rectangle". Now call the 
method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
class Shape {
	public void shp() {
		System.out.println("this is Shape");
	}
}
class Rectangle extends Shape{
	 public void rec()
	{
		System.out.println("This is rectangluar shape");
	}
}
class circle extends Shape{
	public void cir() {
		System.out.println("this is circle shape");
	}
}
class Square extends Rectangle{
	public void sq()
	{
		System.out.println("this is square is rectangle");
	}
}

public class M22 {
	 public static void main(String[] args) {
		Square s= new Square();
		s.rec();
		s.sq();
	}
}
