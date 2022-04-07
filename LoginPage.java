package packge2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   @FindBy(name="username")
    private WebElement untextbox;
   
   @FindBy(name="pwd")
    private WebElement pwtextbox;
   
   @FindBy(id="loginbutton")
    private WebElement loginbtn;
   
   public  LoginPage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
   }
   public WebElement getuntextbox() 
   {
	 return untextbox;  
   }
   
   public WebElement getpwtextbox() 
   {
	 return pwtextbox;  
	   
   }
   public WebElement getloginbtn() {
	   
	   return loginbtn;
   } 
   
}
