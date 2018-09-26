package package1;

public class CalcDemo {

	public static void main(String[] args) {
		
		
		Calculator obj1=new Calculator();
		int sum = obj1.sum(20, 30); //Calling non static method
		System.out.println("Addition="+sum);
		
		double sub=Calculator.sub(20.5, 10.5); //calling Static method
		
		System.out.println("Subtraction="+sub);
	}

}
