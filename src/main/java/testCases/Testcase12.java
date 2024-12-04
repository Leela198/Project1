package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.Payment_Checkout;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

//check user able to select each payment method
public class Testcase12 extends AmazonLaunch
{
@Test
public void payment_mode_checking() throws EncryptedDocumentException, IOException, InterruptedException
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
	search.childwindowchange(driver);
	//search.price();
	//search.ratings();
	//search.description();
	search.add_to_cart();
	search.view_cart();
	search.update_cart();
	//search.adding_qty();
	Thread.sleep(2000);
	
	Payment_Checkout pco=new Payment_Checkout(driver);
	pco.proceed_to_checkout();

	pco.card_payments();
	pco.netbanking();
	pco.payments();
	pco.emi();
	pco.cash_on_delivery();
	
	
	
}
}
