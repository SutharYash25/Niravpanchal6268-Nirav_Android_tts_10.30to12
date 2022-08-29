/*Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
method named 'getBalance'. Call this method by creating an object of 
each of the three classes.
*/
abstract class Bank{
	public abstract void getBalance();
	
}
class BankA extends Bank{
	
	public void getBalance()
	{
	System.out.println("BankA Deposite::$100");	
	}
	
}
class BankB extends Bank{
	public void getBalance()
	{
		System.out.println("BankB Deposite::$100");
	}
	
}
class BankC extends Bank{
	public void getBalance()
	{
		System.out.println("BankC Deposite::$200");
	}
	
}
public class M17 {
	public static void main(String[] args) {
	BankA bA = new BankA();
	bA.getBalance();
	BankB bB =new BankB();
	bB.getBalance();
	BankC bC = new BankC();
	bC.getBalance();
	
	}

	
}
