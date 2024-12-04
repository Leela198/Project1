package ECommercesrc;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Signin_validpage extends DdtDemo

{
	
		WebDriver driver;
	//step-1
		@FindBy(id="ap_email")
		WebElement signin;
		
		@FindBy(id="continue")
		WebElement continue_button;
		
		@FindBy(id="ap_password")
		WebElement password;
		
		@FindBy(id="auth-signin-button")
		WebElement signpwd_btn;
		
		@FindBy(xpath="//span[.=\"Sign Out\"]")
		WebElement signout_btn;
		
		
		@FindBy(id="twotabsearchtextbox")
		WebElement validateassert;
		
		@FindBy(xpath="//div[@class=\"a-section a-spacing-double-large\"]")
		WebElement passwd_reset_btn;
		
		//div[@class="a-section a-spacing-double-large"]
		
		//step-2
		
		public void signin() throws EncryptedDocumentException, IOException
		{
			
			signin.sendKeys(un1);
		}
		public void continue_button()
		{
			continue_button.click();
		}
		public void password() throws EncryptedDocumentException, IOException
		{
			
			password.sendKeys(pwd1);
			
			
		}
		public void validateassert(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(2000);
			String s1=driver.getTitle();
			System.out.println(s1);
			
				Assert.assertEquals(s1,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","SUCCESSFULLY login");
		
		
		}
		public void signininvalid() throws EncryptedDocumentException, IOException
		{
			signin.sendKeys(un2);
		}
		
		public void passwordinvalid() throws EncryptedDocumentException, IOException
		{
			password.sendKeys(pwd2);
		}
		public void signpwd_btn() throws InterruptedException
		{
			signpwd_btn.click();
			
			
			
			
		}
		
		public void signout_btn() throws InterruptedException
		{
			signout_btn.click();

			}
		
		public void validateassertinvalid(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(2000);
			String s1=driver.getTitle();
			System.out.println(s1);
			
				Assert.assertEquals(s1,"Authentication required","failed login");
		
			
		
		
		}
		//step-3
		public Signin_validpage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);	
		}
		
		
	}


