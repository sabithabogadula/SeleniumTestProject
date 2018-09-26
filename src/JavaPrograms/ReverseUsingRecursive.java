package JavaPrograms;

import java.util.Scanner;

public class ReverseUsingRecursive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String or Number : ");
		int num = Integer.parseInt(scan.nextLine());
		
		reverse(num);
		
		

	}

	private static void reverse(int num) {
		
		if(num<10)
		{
			System.out.println(num);
			return;
		}
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
		
	}

}
