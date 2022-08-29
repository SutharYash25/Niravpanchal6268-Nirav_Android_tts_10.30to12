import java.util.ArrayList;
import java.util.List;
/*Write a Java program to extract a portion of an array list.*/
public class M54 {
	public static void main(String[] args) {
		 List list = new ArrayList<>();
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
		System.out.println(" list\n"+list);
		List l1= list.subList(4, 9);
		System.out.println("extract list "+l1);
		
		 
		 
	}

}
