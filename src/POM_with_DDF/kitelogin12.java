package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin12
{
	//POM-1

		//1. Data members/Global Variables should be declared globally with access level private by using @findby.
		
		        @FindBy(xpath="//input[@id='userid']")  private   WebElement UN;
		        @FindBy(xpath="//input[@id='password']")  private   WebElement PSW;
		        @FindBy(xpath="//button[text()='Login ']")  private   WebElement Loginbtn;
		
		//2. Initialize within a constructor with access level public using pagefactory 

		       public kitelogin12(WebDriver driver)
		       {
		    	   PageFactory.initElements(driver , this);
		       }
		
		//3. Utilize within a method with access level public

		     public void userid(String userid)
		     {
		    	UN.sendKeys(userid);            //"GP8097"
		     }
		     public void password( String Password)
		     {
		    	PSW.sendKeys(Password);      //"gms@0110"
		     }
		     public void loginbtn()
		     {
		    	Loginbtn.click();
		     }
		
		
		

}
