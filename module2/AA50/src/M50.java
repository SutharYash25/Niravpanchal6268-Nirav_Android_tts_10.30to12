import java.util.HashSet;

/*Write a Java program to get the number of elements in a hash set.
*/
public class M50 {
	public static void main(String[] args) {
		HashSet<String > hash = new HashSet<String>();
		hash.add("C");
		hash.add("C++");
		hash.add("Java");
		hash.add("Python");
		hash.add("JS");
		hash.add("HTML");
		System.out.println(hash);
		System.out.println("Number of elements is "+hash.size());
	}

}
