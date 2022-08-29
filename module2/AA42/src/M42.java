import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Write a Java program to update specific array element by given element.
*/
public class M42 {
		 public static void main(String[] args) {
			 List list = new ArrayList<>();
				list.add("C");
				list.add("C++");
				list.add("Python");
				list.add("HTML");
				list.add("CSS");
				list.add("JS");
				System.out.println(list);
				list.set(0, "Java");
				System.out.println(list);
				
				Iterator it = list.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
		}
}
