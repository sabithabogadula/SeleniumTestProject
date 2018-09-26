package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String or Number : ");
		String num = scan.nextLine();
		
		int len = num.length();
		String reverse ="";
		
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+num.charAt(i);
		}

		System.out.println("Reverse string/Number is " + reverse);
		scan.close();
	}

}

