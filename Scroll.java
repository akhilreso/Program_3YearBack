package package1;

import java.awt.event.KeyAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.selenium.dev/");
      JavascriptExecutor js =(JavascriptExecutor)driver;
      Thread.sleep(3000);
      String css="div[class='button green']";
      String jscode="arguments[0].scrollIntoView(true)";
      js.executeScript(jscode,driver.findElement(By.cssSelector(css)));
      Thread.sleep(3000);
      String jscode2="arguments[0].click()";
      js.executeScript(jscode2,driver.findElement(By.cssSelector(css)));
      String id1 = driver.getWindowHandle();
      driver.switchTo().window(id1);
      Actions act=new Actions(driver);
      WebElement we1a=driver.findElement(By.id("gs_tti52"));
      act.sendKeys(we1a,"java").perform();
      Thread.sleep(2000);
      act.sendKeys(Keys.ARROW_DOWN).perform();
      Thread.sleep(2000);
     act.sendKeys(Keys.ARROW_DOWN).perform();
     act.sendKeys(we1a, Keys.CONTROL+"a").perform();;
     act.sendKeys(we1a, Keys.DELETE).perform();
     act.sendKeys(we1a,"p").perform();
      Thread.sleep(2000);
     act.sendKeys(Keys.ARROW_DOWN).perform();
     act.sendKeys(Keys.ARROW_DOWN).perform();
     act.sendKeys(Keys.ENTER).perform();
      Thread.sleep(1000);
     driver.quit();
     
	}

}
