package package1;

public class StringDemowithArray {

	public static void main(String[] args) {
		
		String tool="Selenium-hp-tour";
		
		String []tool_split=tool.split("-");
		
		for(int i=0;i<tool_split.length;i++)
		{
			System.out.println(tool_split[i]);
			if(tool_split[i].equalsIgnoreCase("selenium"))
			{
				System.out.println("String Found");
				break;
			}
		}
		

	}

}
