package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExtLogin {

	WebDriver driver;
	
	By userName=By.name("USER");
	By uPassword=By.name("PASSWORD");
	By login=By.id("submit_sign_on");
	
	//Constructor
	public ExtLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	//Methods
	public void setUserName(String uName)
	{
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(uPassword).sendKeys(password);
	}
	
	public void btnLogin()
	{
		driver.findElement(login).click();
	}
	
	public void loginExternal(String strName,String strPassword) throws InterruptedException
	{
		this.setUserName(strName);
		this.setPassword(strPassword);
		this.btnLogin();
		Thread.sleep(10000);
	}
}
