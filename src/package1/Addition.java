package package1;

public class Addition {

	public static void main(String[] args) {
		
		
		Addition obj1 = new Addition();
		int sum = obj1.add(10,20);
		System.out.println("Sum= "+sum);

	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
