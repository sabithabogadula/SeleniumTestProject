package JavaPrograms;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Year : ");
		
		int year = Integer.parseInt(scan.nextLine());
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+ " is a leap year has 366 days");
				}
				else
				{
					System.out.println(year+ " is a not leap year has 365 days");
				}
			}
			else
			{
				System.out.println(year+ " is a leap year has 366 days");
			}
		}
		else
		{
			System.out.println(year+ " is a not leap year has 365 days");
		}
		

	}

}
