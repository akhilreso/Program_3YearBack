package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm2 
{
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ump-staging3.paytm.com/");
		WebElement iframeElement = driver.findElement(By.className("hld-trans-iframe"));
		driver.switchTo().frame(iframeElement); // //input[@placeholder='Enter your Paytm mobile number or email']
		driver.findElement(By.xpath("//input[@placeholder='Enter your Paytm mobile number or email']")).sendKeys("9910455554");
		WebElement psw = driver.findElement(By.xpath("//input[@placeholder='Paytm Password']"));
		psw.sendKeys("paytm@123");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary ng-binding']"));
		btn.click();
		Thread.sleep(3000);
		String sID=driver.getWindowHandle();
		driver.switchTo().window(sID);
		System.out.println(sID);
		Thread.sleep(2000);
		//driver.switchTo().frame("pgLoginFrame");
		
		Thread.sleep(2000);
		WebElement pmnt = driver.findElement(By.xpath("//a[@href='/next/fund-transfers']"));
		pmnt.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		String id2 = driver.getWindowHandle();
		driver.switchTo().window(id2);
		System.out.println(id2);
		driver.findElement(By.xpath("//a[@href='/next/approvals']"));
		

	}
}