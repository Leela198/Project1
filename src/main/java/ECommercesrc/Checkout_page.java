package ECommercesrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//testcase 15
public class Checkout_page
{
	@FindBy(xpath="//input[@name=\"submit.delete.8494a3a0-65f8-4e65-a001-489ed62b6e19\"]")
	WebElement remove_qty;
	@FindBy(xpath="//span[@id=\"auth-create-account-link\"]")
	WebElement create_account_ele;
	//span[@id="auth-create-account-link"]
	
	
	public void remove_qty()
	{
		//for(int i=3;i>=1;i--)
	
		remove_qty.click();
	
	}
	
	//WebDriver driver;
	
	
	
	
	
	public void create_account_ele()
	{
	boolean ele=	create_account_ele.isDisplayed();
	Assert.assertEquals(true, ele,"elemnts dispalyed u r on  correct page");
	}
	
	public Checkout_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
