import java.util.ArrayList;
import java.util.List;

/*Write a Java program to retrieve an element (at a specified index) from a 
given array list*/
public class M41 {
	 public static void main(String[] args) {
		
		 List list = new ArrayList<>();
			list.add("C");
			list.add("C++");
			list.add("Python");
			list.add("HTML");
			list.add("CSS");
			list.add("JS");
		
			System.out.println(list);
		//retrieve first data
			
			System.out.println(list.get(1));
		
			
	}
	
}
