package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NavigateToSalesforce;

public class TestSmartWorkClick extends DriverStart {
	
	
  @Test(priority=0)
	public void linkClick()
	{
	  navigatetosalesforce=new NavigateToSalesforce(driver);
		String cUrl=navigatetosalesforce.urlValidation();
		System.out.println(cUrl);
		String aUrl="https://professionals.accp.voya.com/portal/secure/";
		System.out.println("Hello world");
		if(cUrl.equalsIgnoreCase(aUrl))
		{
			navigatetosalesforce.linkClick();
		}
	}
}





