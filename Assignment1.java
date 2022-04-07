package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://istqb.in/");
		
		Actions actions=new Actions(driver);
		String xp="//nav//div//ul//li//a[text()='ABOUT US']";
		WebElement about = driver.findElement(By.xpath(xp));
	    actions.moveToElement(about).perform();
	    WebElement ac = driver.findElement(By.xpath("//li//div//a[text()='AFFILIATED COMPANIES']"));
	    actions.moveToElement(ac).perform();
        actions.sendKeys(ac, Keys.ENTER).perform();
        
        char c;
        for(c = 'A'; c <= 'Z'; ++c) {
        String s=Character.toString(c);
        String s1="']";
        String s2="//a[text()='";    // //a[text()='A']
        String xp2=s2+s+s1;
        
        List<WebElement> flink=driver.findElements(By.xpath(xp2));
        int count=flink.size();
        for(int i=0;i<count;i++) {
        WebElement atoz = driver.findElement(By.xpath(xp2));
        actions.moveToElement(atoz).click().perform();
        List<WebElement> finalist = driver.findElements(By.tagName("article"));
        int count2 = finalist.size();
        
        for(int j=0;j<count2;j++) {
        	 WebElement wb = finalist.get(j);
        	 String likText=wb.getText();
        	 System.out.println(likText);
        	
			
        	 
        	
            }
        
        
         }
        }
        
		
	}
}
