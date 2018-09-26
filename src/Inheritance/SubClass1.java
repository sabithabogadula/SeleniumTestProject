package Inheritance;

public class SubClass1 extends BaseClass {

	public static void main(String[] args) {
		
			//SubClass1 sa=new SubClass1();
		
			//BaseClass sa=new BaseClass();
			
			BaseClass sa = new SubClass1();
			
			sa.Deposit(1100);
			
			sa.withdraw(100);
		
			System.out.println("Balance="+sa.balance);
		

	}
	
	public int withdraw(int amount) {
		
		balance=balance+amount;
		return balance;
	}

}
