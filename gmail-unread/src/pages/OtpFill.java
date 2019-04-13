package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

public class OtpFill {
	WebDriver driver;
	By option =By.id("2");
	By button=By.id("14");
	By onetime=By.id("20");
	By verify=By.xpath("//*[@id='app-main']/div/div/div/div/form/div[4]/button");
	
	//Constructor
	public OtpFill(WebDriver driver)
	{
		this.driver=driver;	
	}
	//Methods
	public void optionSelect()
	{
		driver.findElement(option).click();
	}

	public void sendClick()
	{
		driver.findElement(button).click();
	}
	
	public void code(String otpCode)
	{
		driver.findElement(onetime).sendKeys(otpCode);
	}
	public void verifyClick()
	{
		driver.findElement(verify).click();
	}
	
	public void OtpSubmit(String code) throws InterruptedException
	{
		this.optionSelect();
		this.sendClick();
		Thread.sleep(5000);
		this.code(code);
		this.verifyClick();
		Thread.sleep(5000);
	}
}
