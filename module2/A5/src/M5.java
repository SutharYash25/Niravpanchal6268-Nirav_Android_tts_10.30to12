/*W.A.J.P to check whether a given string starts with the contents of
*/


public class M5 {
	public static void main(String[] args) {
		String name="Red is favourite color";
		System.out.println("String1:"+name);
		System.out.println("starts with ::red");
	   boolean last = name.startsWith("Red");
	   System.out.println("result::"+last);
	   String name3 ="Orange is also my favoirite color";
	   
	   System.out.println("String ::"+name3);
	   System.out.println("red");
	   boolean last2 =name.startsWith("red");
	   System.out.println("Result ::"+last2);
	}

}
