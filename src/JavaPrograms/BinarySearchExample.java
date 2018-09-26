package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {
		
		int arr[] = {56,23,12,45,78,90,34,26,10,4,67};
		
		Arrays.sort(arr);
		
		boolean flag=false;
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number to search: ");
		
		int num = scan.nextInt();
		
		int L=0;
		int R=arr.length-1;
		int m=0;
		
		while(L<=R)
		{
			m=((L+R)/2);
			if(arr[m]<num)
			{
				L=m+1;
			}
			else if(arr[m]==num)
			{
				System.out.println("Element found at position "+(m+1));
				break;
			}
			else
			{
				R=m-1;
			}
			
		}
		if(L>R)
		{
			System.out.println(num +" Element not found");
		}

	}

}
