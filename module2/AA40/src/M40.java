import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Write a Java program to insert an element into the array list at the first 
position*/
public class M40 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("HTML");
		list.add("CSS");
		list.add("JS");
		
		System.out.println(list);
	     list.add(0, "JAVA");
	     System.out.println(list);
	     Iterator<String> it = list.iterator();
	     while (it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
		
	}
}
