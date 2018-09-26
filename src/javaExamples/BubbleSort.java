package javaExamples;

public class BubbleSort {

	public static void main(String[] args) {
		
		int i;
		int arr[] = {860,8,200,9};
		
		System.out.println("Length:"+arr.length);
		
		int[] sortarr = bubblesort(arr);
		
		for(i=0;i<sortarr.length;i++)
		{
			System.out.print(sortarr[i]+", ");
		}

		
	}
	
	public static int[] bubblesort(int[] data)
	{	
		int temp,i,j,k;
		for(i=0;i<data.length;i++)
		{
			for(j=0;j<data.length-1;j++)
			{
				if(data[j]>data[j+1])
				{
					temp = data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
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
