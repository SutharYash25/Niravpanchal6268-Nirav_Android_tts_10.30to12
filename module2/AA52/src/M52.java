import java.util.HashMap;

/* Write a Java program to count the number of key-value (size) mappings 
in a map.*/
public class M52 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"Hindi");
		map.put(2, "English ");
		map.put(3, "Tamil");
		map.put(4, "Gujarati");
		map.put(5,"Arbic");
		map.put(6, "Sanskrit");
		System.out.println(map);
		System.out.println("size of elements::"+map.size());
		
	}
}
