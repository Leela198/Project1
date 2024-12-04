package ECommercesrc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchproduct_without_login 
{
	public static String input;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchitem;
	
	@FindBy(xpath="//span[@class=\"a-size-base a-color-base\" and .=\"Dangle & Drop\"]")
	WebElement filter2;
	
	@FindBy(xpath="(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[1]")
	WebElement item_selection;
	
	@FindBy(xpath="//span[@id=\"submit.add-to-cart\"]")
	WebElement add_to_cart;
	
	@FindBy(xpath="//form[@id=\"sw-ptc-form\"]")
	WebElement buy1;
	

	
	public void searchitem(WebDriver driver)
	{
		searchitem.sendKeys("ear tops"+Keys.ENTER);
	}
	public void item_selection()
	{
		item_selection.click();
	}
	public void filter2()
	{
		filter2.click();
	}
	public void windowchange2(WebDriver driver)
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> ii=s1.iterator();
		String parentid=ii.next();
		String childid=ii.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		
	}
	public void add_to_cart()
	{
		add_to_cart.click();
	}
	public void buy1(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		buy1.click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon Sign In","Testcase 15 passed");
		
	}
	
	public Searchproduct_without_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
