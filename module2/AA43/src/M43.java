import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Write a Java program to remove the third element from an array list.*/
public class M43 {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("HTML");
		list.add("CSS");
		list.add("JS");	
		int i=1;
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(i+":"+it.next());
			i++;
		}
		list.remove(2);
		System.out.println(list);
		
	}
}
