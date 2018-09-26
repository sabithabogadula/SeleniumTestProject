package JavaPrograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		
		int num = Integer.parseInt(scan.nextLine());
		
		boolean flag=false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Is not a Prime Number");
		}
		else
		{
			System.out.println("Is a Prime Number");
		}
		
	}

}
