import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to shuffle elements in an array list.*/
public class M47 {

	public static void main(String[] args) {
		List list1 = new ArrayList<>();
		list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 list1.add(4);
		 list1.add(5);
		 list1.add(6);
		 list1.add(7);
		 list1.add(8);
		 list1.add(9);
		 System.out.println("original list  "+list1);
		Collections.shuffle(list1);
		System.out.println("shuffle list "+list1);
	}
}
