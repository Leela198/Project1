package testCases;
// ensure the product details displays all necessary info(price,reviews,description)
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.DdtDemo;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

public class Testcase7 extends AmazonLaunch
{

	@Test
	public void filters() throws EncryptedDocumentException, IOException, InterruptedException
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
		search.price();
		search.ratings();
		search.description();
	}
}
