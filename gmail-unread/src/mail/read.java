package mail;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.grid.web.servlet.handler.WebDriverRequestFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class read {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\n691643\\Documents\\RequiredJars\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\n691643\\Documents\\RequiredJars\\chromedriver.exe");
		//driver.get("https://google.com");jjjj
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
		//Implicit Wait//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com/");
        //driver.findElement(By.linkText("Use another account")).click();
        
        //Thread.sleep(5000);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId"))).sendKeys("testautomation75");
       Thread.sleep(5000);
       driver.findElement(By.id("identifierNext")).click();
       Thread.sleep(5000);
        /*Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
        	.withTimeout(40, TimeUnit.SECONDS)
        	.pollingEvery(5, TimeUnit.SECONDS)
        	.ignoring(NoSuchElementException.class)
        	.withMessage("Fluent Working");
        	
        
       WebElement button= wait1.until(new Function<WebDriver, WebElement>() {
    	   public WebElement apply(WebDriver driver1)
    	   {
    		  return driver1.findElement(By.id("dsfsdfsdf"));
    		   
    	   }
    	   
	});*/
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("Spring@32");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(5000);
        Thread.sleep(5000);
       //List <WebElement> listemails=driver.findElement(By.xpath("//span[@class='xf']"));
        java.util.List<WebElement> links = driver.findElements(By.xpath("*//span[@class='zF']"));////*[@id=":7t"]/span
        
        System.out.println("Number of Unread eMails "+links.size()/2);
        
        java.util.List<WebElement> links2 = driver.findElements(By.xpath("*//span[@class='yP']"));////*[@id=":7t"]/span
        
        System.out.println("Number of Read eMails "+ links2.size()/2);
	}

}
