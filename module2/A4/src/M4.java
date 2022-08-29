/*W.A.J.P to check whether a given string ends with the contents of another
string. "Java Exercises" ends with "se"? False "Java Exercise" ends with
"se"? True*/



public class M4 {
	public static void main(String[] args) {
		String name ="Java Exercises";
		String name1 ="se";
		
		System.out.println(name);
		
		System.out.println(name1);
		boolean last = name.endsWith("se");
		System.out.println("first result::"+last);
		String name3="Java Ecercise";
		
		String name4 ="se";
		System.out.println(name3);
		System.out.println(name4);
		boolean last2 = name3.endsWith("se");
		System.out.println("second result ::"+last2);
	}

}
