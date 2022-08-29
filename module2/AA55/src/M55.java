import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to compare two array lists.
*/
public class M55 {
	public static void main(String[] args) {
		List<String> myList1 = new ArrayList<String>();

		myList1.add("nirav");
		myList1.add("raj");
		myList1.add("krunal");
		myList1.add("jainik");

		List<String> myList2 = new ArrayList<String>();
		
		myList2.add("nirav");
		myList2.add("raj");
		myList2.add("krunal");
		myList2.add("jainik");
		System.out.println("Values from list 1: " + myList1);

		System.out.println("Values from list 2: " + myList2);
		
		
		if (myList1.equals(myList2) != false) {
			System.out.println("Both Lists are same");
		} else {
			System.out.println("Both  Lists are not same");
		}

	}
}
