package packge2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeTest
{
	WebDriver driver;
	
	@BeforeMethod 
	public void preCondation() {
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://127.0.0.1/login.do;jsessionid=5nncmj1jripl8");
        System.out.println("BeforeMethod :Browser launched and url  navigated");
        }
	
	@AfterMethod
	public void postCondation()
	{
	driver.close();
    System.out.println("AfterMethod: browser closed");
	}
	@Test(priority=1)
	public void validLogin() 
	{
	LoginPage lp=new LoginPage(driver);	
	lp.getuntextbox().sendKeys("admin");
	lp.getpwtextbox().sendKeys("manager");
	lp.getloginbtn().click();	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Test(priority=2)
	public void invalidLogin() 
	{
		LoginPage lp=new LoginPage(driver);
		lp.getuntextbox().sendKeys("admin");
		lp.getpwtextbox().sendKeys("123456");
		lp.getloginbtn().click();	
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
