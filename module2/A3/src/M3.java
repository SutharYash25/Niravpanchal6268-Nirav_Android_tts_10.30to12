/*W.A.J.P to compare a given string to the specified character sequence.
Comparing topsint.com and topsint.com: true Comparing Topsint.com 
and topsint.com: false*/

public class M3 {
public static void main(String[] args) {
	String name ="topsint.com";
	String name2 ="topsint.com";
	System.out.println("String1 "+name);
	System.out.println("String2 "+ name2);
	System.out.println("String 1&2 result::"+name.equals(name2));
	
	String name3 ="Topsint.com";
	String name4 ="topsint.com";
	
	System.out.println("String 3::"+name3);
	System.out.println("String 4::"+name4);
	
	System.out.println("String 3&4 result::"+name3.equals(name4));
}

}
