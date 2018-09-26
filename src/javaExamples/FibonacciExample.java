package javaExamples;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		
		int i,j,Prevnum, Nextnum, sum;
		Prevnum = 0;
		Nextnum = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		
		String num = scan.nextLine();
		
		System.out.println("Fibonacci Series : ");
		
		for(i=0;i<Integer.parseInt(num);i++)
		{
			System.out.println(Prevnum);
			sum=Prevnum+Nextnum;
			Prevnum=Nextnum;
			Nextnum=sum;
			if(Prevnum>Integer.parseInt(num))
			{
				break;
			}
		}
		
		

	}

}
