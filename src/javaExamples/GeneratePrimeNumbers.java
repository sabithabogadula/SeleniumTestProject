package javaExamples;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		
		String num="100";
		int i;
		int j;
		boolean flag=true;
		
		String primenumber="";
		
		for(i=2;i<=Integer.parseInt(num);i++)
		{
			for(j=2;j<=i/2;j++)
			{
				int rem = i%j;
				if(rem==0)
				{
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
			}
			
			if(flag==true)
			{
				primenumber=primenumber + i +" ";
			}
			
		}
		
		System.out.println("Prime numbers are :"+primenumber);

	}

}
