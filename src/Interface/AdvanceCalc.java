package Interface;

public class AdvanceCalc implements Calc {
	
	
	public static void main(String []args) {
		
		AdvanceCalc obj = new AdvanceCalc();
		
		obj.add(10, 20);
		
	}	

	@Override
	public void add(int a, int b) {
	 int c = a+b;
	 
	 System.out.println(("Sum:"+c));
		
	}

	@Override
	public void sub(int a, int b) {
		int c = a-b;
		
	}

	@Override
	public void mul(int a, int b) {
		int c = a*b;
		
	}
}
