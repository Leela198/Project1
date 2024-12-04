package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.Orderpageraring;
import ECommercesrc.Registration;

import ECommercesrc.Signin_validpage;

public class Testcase14 extends AmazonLaunch
{

	@Test
	public void lastorderraring() throws EncryptedDocumentException, IOException, InterruptedException
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
		Orderpageraring ood=new Orderpageraring(driver);
		ood.orders();
		ood.orders_dropdown();
		ood.choose_year();
		ood.review_product();
		ood.fivestar_rating();
		
	}
}
