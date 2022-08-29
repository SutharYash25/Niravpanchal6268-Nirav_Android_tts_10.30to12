import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program of swap two elements in an array list. */
public class M56 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		System.out.println(li);
		
		Collections.swap(li, 0,2);
		System.out.println(li);
		
		
		
 	}

}
