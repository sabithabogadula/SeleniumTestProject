package javaExamples;

public class SplitString {

	public static void main(String[] args) {
		
		int i;
		String data = "How are you";
		
		//to split by space
		String[] datasplit = data.split("\\s");
		
		for (i=0;i<datasplit.length;i++)
		{
				System.out.println("Split data : "+datasplit[i]);
		}
		
		//Split by comma
		String data1 = "Alpha, Beta, Delta, Gamma, Sigma";
		String[] datasplit1 = data1.split(",");
		
		for (i=0;i<datasplit1.length;i++)
		{
				System.out.println("Split data : "+datasplit1[i]);
		}
	}

}
