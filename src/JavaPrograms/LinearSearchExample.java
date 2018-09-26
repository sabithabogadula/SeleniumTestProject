package JavaPrograms;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		
		int arr[] = {56,23,12,45,78,90,34,26,10,4,67};
		
		boolean flag=false;
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number to search: ");
		
		int num = scan.nextInt();
				
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		
		if(flag==true)
		{
			System.out.println(num+" found at position "+(i+1));
		}
		else
		{
			System.out.println("Number not found");
		}
		

	}

}
