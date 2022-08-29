import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Write a Java program to sort a given array list.
*/
public class M45 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("HTML");
		list.add("CSS");
		list.add("JS");
	 System.out.println("orignal list::"+list);
	 Collections.sort(list);
	 System.out.println(list);
	}
}
