package package1;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[7];
		
		for(int count=0;count<a.length;count++) {
			
			a[count]=count+1;
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Value: "+a[i]);
		}
	}

}
