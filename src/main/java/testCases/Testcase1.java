package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECommercesrc.Registration;
import ECommercesrc.Signin_page;
import ECommercesrc.Signin_validpage;

//verify login in successfull with correct username and pwd 

public class Testcase1 extends AmazonLaunch
{
	
@Test
public void verify() throws EncryptedDocumentException, IOException, InterruptedException
{
	Registration r1=new Registration(driver);
	r1.accountandlist(driver);
	r1.signinbutton();
	Signin_validpage s1=new Signin_validpage(driver);
	s1.signin();
	s1.continue_button();
	s1.password();
	s1.signpwd_btn();
	s1.validateassert(driver);

}
@AfterMethod
public void quit()
{
	driver.quit();
}
}
