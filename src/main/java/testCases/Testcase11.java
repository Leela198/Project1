package testCases;
//validating checkout including address selection,payment,order review

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.Checkout_page;
import ECommercesrc.DdtDemo;
import ECommercesrc.Payment_Checkout;
import ECommercesrc.Profile_edit;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

public class Testcase11 extends AmazonLaunch

{
	@Test
	public void checkoutprocess() throws InterruptedException, EncryptedDocumentException, IOException
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
		//search.brand_filter();
		search.item1();
		
		Thread.sleep(2000);
		
		search.childwindowchange(driver);
		//search.price();
		//search.ratings();
		//search.description();
		search.add_to_cart();
		search.view_cart();
		//search.update_cart();
		//search.adding_qty();
		Thread.sleep(2000);
		
		Profile_edit ped=new Profile_edit(driver);
		ped.accountandlist(driver);
		ped.youraccount();
		ped.address_edit();
		ped.viewcart_addresspage();
		Payment_Checkout pco=new Payment_Checkout(driver);
		pco.proceed_to_checkout();

		pco.card_payments();
		Thread.sleep(2000);
		pco.entercard_details();
		/*Checkout_page cop=new Checkout_page(driver);
		cop.remove_qty();
		Thread.sleep(2000);*/
		
		
}
}
