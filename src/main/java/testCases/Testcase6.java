package testCases;
//verify searching with filters(category ,price range)yields accurate results

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.Checkout_page;
import ECommercesrc.DdtDemo;
import ECommercesrc.Payment_Checkout;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

public class Testcase6 extends AmazonLaunch
{
@Test
public void payments() throws InterruptedException, EncryptedDocumentException, IOException
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
	
	Search_page search=new Search_page(driver);
	
	
	search.search_textfield();
	search.brand_filter();
	search.item1();
	
	/*search.windowchange(driver);
	search.price();
	search.ratings();
	search.description();
	search.add_to_cart();
	search.view_cart();
	//search.update_cart();
	search.adding_qty();
	Thread.sleep(2000);
	
	/*Checkout_page cop=new Checkout_page(driver);
	cop.remove_qty();
	Thread.sleep(2000);*/
	
	/*Payment_Checkout pco=new Payment_Checkout(driver);
	pco.proceed_to_checkout();

	pco.coupon_code();
	pco.coupon_code_apply();
	pco.payments();*/
	
}
}
