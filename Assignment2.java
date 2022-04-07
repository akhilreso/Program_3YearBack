package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		WebElement input = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
	      input.sendKeys("Eminem");
		Actions act=new Actions(driver);
		//act.sendKeys(input, "Eminem");
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		/*Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);*/
		act.sendKeys(Keys.ENTER).perform();
		
		List<WebElement> songlist = driver.findElements(By.cssSelector("a[class='rl_item rl_item_base']"));
	    int count = songlist.size(); 
	    System.out.println("Best song of eminem bhaiya is :- ");
	    for(int i=0;i<count;i++){
	    WebElement w = songlist.get(i);
	    String text = w.getText();
	    File fl = new File("./exelFiles/google.xlsx");
	    Workbook wb = new XSSFWorkbook();
	    Sheet sh = wb.createSheet("Eminem Songs");
	    Row rw = sh.createRow(1);
	    Cell cl1 = rw.createCell(0);
	    cl1.setCellValue(text);
	    FileOutputStream fo = new FileOutputStream(fl);
	    wb.write(fo);
	    System.out.println(text);
	    	}
	    System.out.println("I am going to play Mockingbird");
	    WebElement mokingbird = driver.findElement(By.xpath("//a[contains(@href,'/search?q=eminem+mockingbird&stick=H4sIAAAAAAAAAONgFuLSz9')]"));
	    act.sendKeys(mokingbird, Keys.ENTER).perform();
	    WebElement play = driver.findElement(By.xpath("//span[@class='j0joJb']"));
	    act.sendKeys(play,Keys.ENTER).perform();
	   
		Thread.sleep(10000);
	    try {
	    	WebElement addbtn = driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']"));
//	             boolean flag = a
	             if(addbtn.isDisplayed())act.click(addbtn).perform();
//	             }
			
			
		} catch (NoSuchElementException e) {
			
			System.out.println("***There are no add in this vedio***** ");
		    }
	    
	
	    }
    }
