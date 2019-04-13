package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.ExtLogin;
import pages.NavigateToSalesforce;
import pages.OtpFill;

public class DriverStart {
	public static WebDriver driver;
	public ExtLogin extlogin;
	public NavigateToSalesforce navigatetosalesforce;
	public OtpFill otpfill;
	
	@BeforeTest
	public void setup(){
	
	driver=new ChromeDriver();
	
	driver.get("https://professionals.accp.voya.com/portal/public/login?TARGET=https%3A%2F%2Fprofessionals.accp.voya.com%2Fesamloutbound%2Fsaml%3Ftarget%3DSFDotCom_SWACCP");
	}
	/*@AfterTest
	public void TearDown()
	{
		if (driver != null) {
	        driver.quit();
	    }
	}*/
}
