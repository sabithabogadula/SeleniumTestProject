package almLoginverification;	
	
	import org.testng.annotations.Test;

import com.jacob.com.LibraryLoader;

import atu.alm.wrapper.ALMServiceWrapper;

	import atu.alm.wrapper.exceptions.ALMServiceException;

	public class ALMLoginVerification {
		
		
		@Test
		public void connect_to_alm() throws ALMServiceException
		{
			
			System.setProperty("jacob.dll.path", "C:\\Users\\sabithab\\eclipse-workspace\\Sample Project\\jacob-1.19-x86.dll");

			LibraryLoader.loadJacobLibrary();
			
			ALMServiceWrapper wrapper = new ALMServiceWrapper("https://10.7.238.75:7449/qcbin");
			
			boolean status = wrapper.connect("ncssabitha", "sabitha", "LTA_NEXT_GEN_ERP","ERP2_UAT");
			
			System.out.println("ALM Status : "+status);
		
		}
		

	}

