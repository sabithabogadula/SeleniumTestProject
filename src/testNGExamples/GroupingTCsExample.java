package testNGExamples;

import org.testng.annotations.Test;

public class GroupingTCsExample {
	 
		  @Test (groups = {"sanity","regression"} , priority = 1)
		  public void Login() {
			  System.out.println("Login Successful");
		  }
		  
		  @Test (groups = {"sanity","regression"} , priority = 10)
		  public void Logout() {
			  System.out.println("Logout Successful");
		  }
		  
		  @Test (groups = {"sanity","regression"} , priority = 3)
		  public void FundTransfer() {
			  System.out.println("FundTransfer Successful");
		  }
		  
		  @Test (groups = {"sanity"} , priority = 2)
		  public void Search() {
			  System.out.println("Search Successful");
		  }
		  
		  @Test (groups = {"regression"} , priority = 2)
		  public void AdvancedSearch() {
			  System.out.println("Advanced Search Successful");
		  }
		  
		  @Test (groups = {"sanity","regression"} , priority = 4)
		  public void PrepaidRecharge() {
			  System.out.println("Prepaid Recharge Successful");
		  }
		  
		  @Test (groups = {"regression"} , priority = 3)
		  public void BillPayments() {
			  System.out.println("Bill Payments Successful");
		  }
		  
	}
