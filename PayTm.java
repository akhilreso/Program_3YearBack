package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTm {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ump-staging3.paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//input[@placeholder='Enter your Paytm mobile number or email']")).sendKeys("9910455554");
		
		WebElement psw = driver.findElement(By.className("login-note ng-scope"));
		psw.sendKeys("paytm@123");
		WebElement btn = driver.findElement(By.className("btn btn-primary ng-binding"));
		btn.click();
		Thread.sleep(3000);
		WebElement pmnt = driver.findElement(By.xpath("//label[text()='Bill Payments']"));
		pmnt.click();
		
		

	}

}
