package javaExamples;

public class InsertionSort {

	public static void main(String[] args) {
		
		int i;
		int[] arr = {860,8,200,9};
		
		System.out.println("Length: "+arr.length);
		
		int[] sortarr = insertionsort(arr);
		
		for(i=0;i<sortarr.length;i++)
		{
			System.out.print(sortarr[i]+", ");
		}


	}

	
	public static int[] insertionsort(int[] data)
	{
		
		int i,j,temp,k;
		
		for(i=0;i<data.length-1;i++)
		{
			for(j=i;j>=0;j--)
			{
				if(data[j+1]<data[j])
				{
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]= temp;
				}
				
			}
			System.out.println("Afer"+(i+1));
			for(k=0;k<data.length;k++)
			{
				System.out.print(data[k]+", ");
			}
			System.out.println("");
		}
		
		return data;
		
	}	
}
