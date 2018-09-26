package javaExamples;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		String series ="";
		String num ="20";
		int i,j,Prevnum, Nextnum, sum;
		Prevnum = 0;
		Nextnum = 1;
		
		for(i=0;i<=Integer.parseInt(num);i++)
		{	
			series = series + Prevnum + " ";
			sum = Prevnum + Nextnum;
			Prevnum =Nextnum;
			Nextnum = sum;	
		}
		System.out.println(series);
	}
}
