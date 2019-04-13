package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ExtLogin;
import pages.NavigateToSalesforce;

public class TestExtLogin extends DriverStart{

	
	
	
	@Test(priority=0)
	public void testLogin() throws InterruptedException
	{
		extlogin=new ExtLogin(driver);
		extlogin.loginExternal("dolqa29", "Password1");
	}
	
}
