import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Write a Java program to iterate through all elements in an array lis*/
public class m39 {
 public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 list.add(5);
	 list.add(6);
	 list.add(7);
	 list.add(8);
	 list.add(9);
	 list.add(10);
	 System.out.println(list);
	 Iterator<Integer> it = list.iterator();
	 while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	  
	 
}
}
