package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ToPrintDate {

	public static void main(String[] args) {
		
		SimpleDateFormat sdfDate = new SimpleDateFormat("dMHHss");//dd/MM/yyyy
	    Date now = new Date();
	    System.out.println(now);
	    String strDate = sdfDate.format(now);
	    System.out.println(strDate);
	    

	}

}
