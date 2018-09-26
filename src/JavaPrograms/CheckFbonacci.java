package JavaPrograms;

import java.util.Scanner;

public class CheckFbonacci {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = Integer.parseInt(scan.nextLine());
		
		int prevnum=0;
		int currnum=1;
		int flag=0;
		int sum=0;
		
		for(int i=0;i<num;i++)
		{
			
			if(num==prevnum)
			{
				flag=1;
				break;
			}
			else
			{
				sum=prevnum+currnum;
				prevnum=currnum;
				currnum=sum;
				flag=0;
			}
			
		 }
		
		if (flag==1)
		{
			System.out.println(num + " is a Fibonacci number");	
		}
		else
		{
			System.out.println(num + " is not a Fibonacci number");
		}
		
		
	}

}
