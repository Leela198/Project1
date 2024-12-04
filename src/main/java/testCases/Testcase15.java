package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ECommercesrc.Checkout_page;
import ECommercesrc.Searchproduct_without_login;

public class Testcase15 extends AmazonLaunch
{
	
	
@Test

public void searchproduct_nologin() throws InterruptedException
{
	
	
	Searchproduct_without_login swl=new Searchproduct_without_login(driver);
	swl.searchitem(driver);
	swl.filter2();
	swl.item_selection();
	swl.windowchange2(driver);
	swl.add_to_cart();
	
	swl.buy1(driver);
	Checkout_page cpo=new Checkout_page(driver);
	cpo.create_account_ele();
	
}

}
