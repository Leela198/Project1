package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.InvalidCredentials;
import ECommercesrc.Registration;
import ECommercesrc.Signin_validpage;


//login fails with incorrect password
public class Testcase2 extends AmazonLaunch
{
	//(retryAnalyzer=testCases.RetryanalyzerP1.class)
	
	@Test
	public void verify() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DdtDemo dd=new DdtDemo();
		dd.un();
		
		Registration r1=new Registration(driver);
		r1.accountandlist(driver);
		r1.signinbutton();
		Signin_validpage s1=new Signin_validpage(driver);
		s1.signin();
		s1.continue_button();
		s1.password();
		s1.signpwd_btn();
		s1.validateassert(driver);
		Thread.sleep(2000);
		
		r1.accountandlist(driver);
		s1.signout_btn();
		
		
		
		Signin_validpage s2=new Signin_validpage(driver);
		
		s2.signininvalid();
		s2.continue_button();
		s2.passwordinvalid();
		s2.signpwd_btn();
		s2.validateassertinvalid(driver);
	}
}
