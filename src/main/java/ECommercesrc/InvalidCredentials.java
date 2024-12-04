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

public class InvalidCredentials

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
		@FindBy(id="twotabsearchtextbox")
		WebElement validateassert;
		
		//step-2
		
		public void signin() throws EncryptedDocumentException, IOException
		{
			FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/project1/testdata/leela.xlsx");
			Workbook w1=WorkbookFactory.create(f1);
			String un=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
			signin.sendKeys(un);
		}
		public void continue_button()
		{
			continue_button.click();
		}
		public void password() throws EncryptedDocumentException, IOException
		{
			FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/project1/testdata/leela.xlsx");
			Workbook w1=WorkbookFactory.create(f1);
			String pwd=w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
			password.sendKeys(pwd);
			
		}
		public void signpwd_btn()
		{
			signpwd_btn.click();
			
		}
		public void validateassert() throws InterruptedException
		{
			Thread.sleep(2000);
			
			boolean b1=validateassert.isDisplayed();
		
		Assert.assertEquals(b1, false,"failed login");
		
		}
		//step-3
		public InvalidCredentials(WebDriver driver)
		{
		PageFactory.initElements(driver,this);	
		}
		
	
	
	
}
