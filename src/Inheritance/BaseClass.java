package Inheritance;

public class BaseClass {
	
	int balance=0;
	
	public static void main(String []args)
	{
		
		
		BaseClass obj = new BaseClass();
		
		obj.Deposit(100);
		obj.withdraw(50);
		
		System.out.println("Balance="+obj.balance);
		
	}
	
	public int Deposit(int amount)
	{
		balance=balance+amount;
		return balance;
		
	}
	
	public int withdraw(int amount)
	{
		balance= balance-amount;
		return balance;
		
	}
	

}
