package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 
{
	//POM-2
	
		//1. Data members/Global Variables should be declared globally with access level private by using @findby
		                       
		    @FindBy(xpath="//input[@id='pin']") private	WebElement PIN;
		    @FindBy(xpath="//button[text()='Continue ']") private WebElement Ctnbtn;
		//2. Initialize within a constructor with access level public using pagefactory 
                     
               public kitelogin2(WebDriver driver)
               {
            	   PageFactory.initElements(driver, this);
               }
             //3. Utilize within a method with access level public

               public void pin()
               {
            	   PIN.sendKeys("111000");
               }
               public void ctnbtn()
               {
            	   Ctnbtn.click();
               }
               
               
               
               
               
}
     