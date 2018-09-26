package javaExamples;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i,j;
		String input = "0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20";
		boolean primeflag=true;
		
		String[] splitdata= input.split(",");
		
		for(i=0;i<splitdata.length;i++)
		{
			if(Integer.parseInt(splitdata[i])==2)
			{
				System.out.println("Number "+splitdata[i] +" is Prime");
			}
			else
			{
				for(j=2;j<Integer.parseInt(splitdata[i]);j++)
				{
						int rem = Integer.parseInt(splitdata[i])%j;
						if(rem==0)
						{
							primeflag=true;
							break;
						}
						else
						{
							primeflag=false;
						}
				}
				
				if(primeflag==true)
				{
					//System.out.println("Number "+splitdata[i] +" is not Prime");
				}
				else
				{
					System.out.println("Number "+splitdata[i] +" is Prime");
				}
			}
		}
		
	}

}

