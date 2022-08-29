import java.util.ArrayList;

/*Write a Java program to join two array lists.*/
public class M57 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList<>();
		
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
		ArrayList list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		list2.add(17);
		list2.add(18);
		list2.add(19);
		list2.add(20);
		
	ArrayList A= new ArrayList<>();
	A.addAll(list);
	A.addAll(list2);
	System.out.println(A);
	
		
	}
}
