package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.Booksearch_page;
import ECommercesrc.DdtDemo;
import ECommercesrc.Registration;
import ECommercesrc.Signin_validpage;

public class Testcaseprice extends AmazonLaunch
{
	@Test
	public void pricebarhadle() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
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
		Booksearch_page bsp=new Booksearch_page(driver);
		bsp.search_textfield();
		bsp.fileter1();
		bsp.fileter2();
		bsp.pricerange(driver);
		
	}

}
