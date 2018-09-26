package javaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongExample {

	public static void main(String[] args) {
		
		int i,j,k;
		int flag=1;
		int value, actualvalue=0;
		List<String> checknumber = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		String expvalue = scan.nextLine();
	
		for(i=0;i<expvalue.length();i++)
		{
			System.out.println("Number: "+expvalue.charAt(i));
			checknumber.add(Character.toString(expvalue.charAt(i)));
		}	
		for(String sp:checknumber) 
		{
			value = Integer.parseInt(sp);
			for(String sl:checknumber) 
			{
				flag =  value * flag;
			}
			actualvalue=actualvalue+flag;
			flag = 1;
		}
		System.out.println("Result:"+actualvalue);
		if(Integer.parseInt(expvalue)==actualvalue)
		{
			System.out.println(expvalue+" is a Armstrong Number");
		}
		else
		{
			System.out.println(expvalue+" is not a Armstrong Number");
		}
	}

}
