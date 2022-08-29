import java.util.HashSet;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in a hash list.*/
public class M49 {
	public static void main(String[] args) {
		HashSet<String > hash = new HashSet<String>();
		hash.add("C");
		hash.add("C++");
		hash.add("Java");
		hash.add("Python");
		hash.add("JS");
		hash.add("HTML");
		System.out.println(hash);
		
		Iterator<String> it = hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
