package package1;

public class polymorphismDemo {
	
	
	public static void main(String []args)
	{
		
		polymorphismDemo obj1 = new polymorphismDemo();
		int sum = obj1.add(10,30);
		int sum2 = obj1.add(20,20,20);
		double sum3=obj1.add(10, 10);
	}

	public int add(int p, int q) //Method Overloading
	{
		int c= p+q;
		return c;
	}
	
	public int add(int p, int q, int r)
	{
		int c= p+q+r;
		return c;
	}
	
	public double add(double p, double q)
	{
		double c= p+q;
		return c;
	}

}
