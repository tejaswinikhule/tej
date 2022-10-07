package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage 
{
	//POM-3
	
		//1. Data members/Global Variables should be declared globally with access level 
	//  private by using @findby
	                   
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	//2. Initialize within a constructor with access level public using pagefactory 
    
    public kitehomepage(WebDriver driver)
    {
 	   PageFactory.initElements(driver, this);
    }
  //3. Utilize within a method with access level public
   
	public void VerifyuserId()
	{      String ExpectedUserID="GP8097";
		 String  ActualUserID=userid.getText(); //GP8097
		
		System.out.println(ActualUserID);	
			
		  if(ExpectedUserID.equals(ActualUserID))  //GP8097  GP8097
		  {
			  System.out.println("Pass");
		  }
		  else 
		  {
			  System.out.println("Fail");
		  }
		  

	}
	
	
	
	
	
	
	

}
