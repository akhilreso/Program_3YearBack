package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class AssignmentGoogle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement input = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(3000);
		
		Actions at=new Actions(driver);
		at.sendKeys(input, "CDE Asia Ltd.").perform();
			
		at.sendKeys(input, Keys.ENTER).perform();
		driver.navigate().refresh();		//code scroll 
		Thread.sleep(3000);
		List<WebElement> next = driver.findElements(By.xpath("//a[@id='pnnext']"));
		//boolean flag = next.isEmpty();
		while(next!=null) {
			
			try {
				WebElement next1 = driver.findElement(By.xpath("//a[@id='pnnext']"));
				JavascriptExecutor scrol=(JavascriptExecutor)driver;
				Thread.sleep(2000);
			    String jscode="arguments[0].scrollIntoView(true)";
                scrol.executeScript(jscode, driver.findElement(By.xpath("//a[@id='pnnext']")));
                at.moveToElement(next1).click().perform();
				next = driver.findElements(By.xpath("//a[@id='pnnext']"));
			    }
			catch (NoSuchElementException e) {
				next=null;
			}
		  }
		     System.out.println("******google page end********* ");
		}
		
	}


