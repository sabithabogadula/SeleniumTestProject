package testNGRunFailedTC;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RunFailedCasesExample {

	@Test
	public void failedruns()
	{
		
		TestNG runner = new TestNG();
		
		List<String> tests = new ArrayList<String>();
		
		tests.add("C:\\Users\\sabithab\\eclipse-workspace\\Sample Project\\test-output\\testng-failed.xml");
		
		runner.setTestSuites(tests);
		
		System.out.println("Execution Started for failed TC");
		
		runner.run();

	}

}
