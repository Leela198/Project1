package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.Profile_edit;
import ECommercesrc.Registration;
import ECommercesrc.Signin_page;
import ECommercesrc.Signin_validpage;

public class Testcase3 extends AmazonLaunch
{
	
	
	@Test //(retryAnalyzer=testCases.RetryanalyzerP1.class)
	public void editdemo() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		Profile_edit p1=new Profile_edit(driver);
		p1.accountandlist(driver);
		p1.youraccount();
		p1.address_edit();
	
	}

	
}
