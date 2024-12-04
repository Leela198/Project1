package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import ECommercesrc.Listener_implimentation;
import ECommercesrc.Listenerforcoupon;
import ECommercesrc.Registration;
@Listeners(ECommercesrc.Listener_implimentation.class)
//@Listeners(ECommercesrc.Listenerforcoupon.class)
public class  AmazonLaunch extends Listener_implimentation
{
//static WebDriver driver;
@BeforeMethod
public void login()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
}


 /*@AfterMethod
public void quit()

{
	driver.quit();
}
*/

}
