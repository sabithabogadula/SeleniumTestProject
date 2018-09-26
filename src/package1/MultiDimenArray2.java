package package1;

public class MultiDimenArray2 {

	public static void main(String[] args) {
		
		int [][][]student_data = new int[2][2][2];
		
		student_data[0][0][0]=12;
		student_data[0][0][1]=24;
		student_data[0][1][0]=36;
		student_data[0][1][1]=48;
		student_data[1][0][0]=60;
		student_data[1][0][1]=72;
		student_data[1][1][0]=84;
		student_data[1][1][1]=96;
		
		for (int i=0;i<student_data.length;i++)
		{
			for(int j=0;j<student_data[0].length;j++)
			{
				for(int k=0;k<student_data[0][1].length;k++)
				{
				System.out.println(student_data[i][j][k]);
				}
			}
		}
	}

}
