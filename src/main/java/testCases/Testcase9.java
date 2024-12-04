package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ECommercesrc.Booksearch_page;
import ECommercesrc.DdtDemo;
import ECommercesrc.Registration;
import ECommercesrc.Search_page;
import ECommercesrc.Signin_validpage;

//verify that items can be added to the shopping cart from product pages
public class Testcase9 extends AmazonLaunch
{
	@Test
	public void shoppingcart() throws EncryptedDocumentException, IOException, InterruptedException
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
		/*Booksearch_page bsp=new Booksearch_page(driver);
		bsp.search_textfield();
		bsp.pricerange(driver);*/
		
		
		Search_page search=new Search_page(driver);
		
		
		search.search_textfield();
		search.addcrtfronsearchpage();
		
		//search.item1();*/
	}

}
