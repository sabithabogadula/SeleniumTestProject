package javaExamples;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		int i;
		Random obj1 = new Random();
		
		//need to generate 10 random numbers between 0 to 100.
		for(i=0;i<10;i++)
		{
			System.out.println("Random Number: "+obj1.nextInt(1000));
		}
		
		//if we want 10 random numbers generated java but in the range of 0.0 to 1.0, then we should make use of math.random()
		for(i=0;i<10;i++)
		{
			System.out.println("Random Number by Math class: "+Math.random());
		}
		

	}

}
