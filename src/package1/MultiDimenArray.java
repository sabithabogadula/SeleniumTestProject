package package1;

public class MultiDimenArray {

	public static void main(String[] args) {
		
		int [][]student_data = new int[2][3];
		
		student_data[0][0]=12;
		student_data[0][1]=24;
		student_data[0][2]=240;
		student_data[1][0]=36;
		student_data[1][1]=48;
		student_data[1][2]=480;
		
		for (int i=0;i<student_data.length;i++)
		{
			for(int j=0;j<student_data[0].length;j++)
			{
				System.out.println(student_data[i][j]);
			}
		}
	}

}
