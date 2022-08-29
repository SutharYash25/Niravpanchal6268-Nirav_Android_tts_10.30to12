import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*Write a Java program to associate the specified value with the specified 
key in a HashMap. */
public class M51 {
	public static void main(String[] args) {
             
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"Hindi");
		map.put(2, "English ");
		map.put(3, "Tamil");
		map.put(4, "Gujarati");
		map.put(5,"Arbic");
		map.put(6, "Sanskrit");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator  it =set.iterator();
		while(it.hasNext())
		{	
			Map.Entry<Integer, String> entry = (Entry<Integer, String>)it.next();
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		 
		
	}
}
