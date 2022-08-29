import java.util.ArrayList;
import java.util.List;

/*Write a Java program to search an element in an array list. */
public class M44 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("HTML");
		list.add("CSS");
		list.add("JS");
		System.out.println(list);
		if (list.contains("JAVA"))
		{
			System.out.println("elements in list");
		}
		else {
		 System.out.println("elemt is not in list");
		}
		   
	}

}
