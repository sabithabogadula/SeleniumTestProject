package JavaPrograms;

import java.util.Scanner;

public class FindLargestUsingTernaryOperator {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the second number: ");
		
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the third number: ");
		
		int num3 = Integer.parseInt(scan.nextLine());

		int temp = num1>num2 ? num1:num2;
		
		int result = num3>temp ? num3:temp;
		
		System.out.println("Highest number : "+result);
		
	}

}
