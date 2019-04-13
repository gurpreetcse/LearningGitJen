package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateToSalesforce {
	
	WebDriver driver;
	//By link1=By.xpath("//*[@id='11th']/div/div/div/ul/li[1]/a/strong");//*[@id="qrgx"]/div/div/div/ul/li[1]/a/strong
	By link=By.linkText("Voya SmartWorks");
	
	//Constructor
	public NavigateToSalesforce(WebDriver driver)
	{
		this.driver=driver;
	}
	//Methods
	public String urlValidation()
	{
		return driver.getCurrentUrl();
	}
	
	public void linkClick()
	{
		System.out.println("Link Click");
		driver.findElement(link).click();
	}
	
	public void SalesforceNavigation(String link)
	{
		this.linkClick();
	}

}
