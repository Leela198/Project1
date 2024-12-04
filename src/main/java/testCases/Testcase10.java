package testCases;
//updating quantities and remove from cart

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

public class Testcase10 extends AmazonLaunch
{
@Test
public void updatecart() throws InterruptedException, EncryptedDocumentException, IOException
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
	//s1.validateassert();
	
	Search_page search=new Search_page(driver);
	
	
	search.search_textfield();
	search.brand_filter();
	search.item1();
	search.childwindowchange(driver);
	search.add_to_cart();
	search.view_cart();
	search.update_cart();
	search.adding_qty();
	Thread.sleep(2000);
	
}
	
}
