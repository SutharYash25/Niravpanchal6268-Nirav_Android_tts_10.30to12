import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to copy one array list into another. */
public class M46 {
	public static void main(String[] args) {
		List list1= new ArrayList<>();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 list1.add(4);
		 list1.add(5);
		 list1.add(6);
		 list1.add(7);
		System.out.println("first list:"+list1);
		List list2 = new ArrayList<>();
		
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list2.add(11);
		System.out.println("second list"+list2);
		Collections.copy(list1, list2);
		System.out.println("first list after copy::"+list1);
		
		
	}
	

}
