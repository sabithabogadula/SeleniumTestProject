package javaExamples;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		
		int j;
		String actual="",expected_modified;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String or Number: ");
		
		String expected = scan.nextLine();
		
		expected_modified=expected.replaceAll("[^a-z A-Z 0-9]","");
		expected_modified=expected_modified.replaceAll("\\s","");
		System.out.println("Expected: "+expected_modified);
		
		for(j=expected_modified.length()-1;j>=0;j--)
		{
			actual = actual+expected_modified.charAt(j);
		}
		System.out.println("Actual: "+actual);
		if(expected_modified.equalsIgnoreCase(actual))
		{
			System.out.println(expected+" is a Palindrome");
		}
		else
		{
			System.out.println(expected+" is not a Palindrome");
		}	

	}


}
