package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TablePrint {

	public static void main(String[] args) 
	{
	  
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement wb = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Actions at=new Actions(driver);
		at.sendKeys(wb,"Searh").perform();
     
	}

}