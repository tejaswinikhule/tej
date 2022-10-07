package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\VELOCITY CLASS\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(10000);
		//2. To perform action on component we need to call a methods.
         
		//create object of pom1 class
          kitelogin1 login1=new kitelogin1(driver);
          login1. userid();
          login1.password();
          login1.loginbtn();
          
          Thread.sleep(10000);
          
          //create object of pom2 class
		  kitelogin2 login2=new kitelogin2(driver);
		  login2.pin();
		  login2.ctnbtn();
		  
		  Thread.sleep(5000);
		  
		  //crete object of pom3 class
		  kitehomepage homepage =new kitehomepage( driver);
		   homepage.VerifyuserId();
		   
		
		   
		
		
		
		
		
		
		
	}

}
