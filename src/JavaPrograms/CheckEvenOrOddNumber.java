package JavaPrograms;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = Integer.parseInt(scan.nextLine());
		
		if(num%2==0)
		{
			System.out.println(num + " is a even number");
		}
		else
		{
			System.out.println(num + " is a odd number");
		}	
		

	}

}
