package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count = 10;

		int prevnum=0;
		int currnum=1;
		int sum=0;
		String series="";
		
		for(int i=0;i<count;i++)
		{
			series=series+prevnum+" ";
			sum=prevnum+currnum;
			prevnum=currnum;
			currnum=sum;
				
		}
		
		System.out.println("Series:"+series);

	}

}
