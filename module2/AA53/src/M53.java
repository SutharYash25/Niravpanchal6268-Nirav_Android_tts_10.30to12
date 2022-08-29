import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/*Write a Java program to reverse elements in an array list. */
public class M53 {
	public static void main(String[] args) 
	{
		List< String> list = new ArrayList<>();
		list.add("apple");
		list.add("google");
		list.add("dell");
		list.add("asus");
		list.add("hp");
		list.add("msi");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
