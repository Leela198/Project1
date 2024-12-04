package ECommercesrc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search_page
{
	WebDriver driver;
	//public static String input;
	public Search_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_textfield;
	@FindBy(xpath="//span[.=\"Maybelline\"]")
	WebElement brand_filter;
	
	@FindBy(xpath="(//div[@class=\"a-section a-spacing-none a-spacing-top-small s-title-instructions-style\"])[3]")
	WebElement item1;
	@FindBy(xpath="(//div[@id=\"corePriceDisplay_desktop_feature_div\" and @class=\"celwidget\"])[1]")
	WebElement price;
	@FindBy(xpath="(//span[@id=\"acrCustomerReviewText\"])[1]")
	WebElement ratings;
	@FindBy(xpath="//div[@id=\"featurebullets_feature_div\"]")
	WebElement description;
	@FindBy(xpath="(//span[@id=\"submit.add-to-cart\"])[1]")
	WebElement add_to_cart;
	@FindBy(xpath="//span[@id=\"sw-gtc\"]")
	WebElement view_cart;
	@FindBy(xpath="(//span[@class=\"a-size-small sc-action-delete\"])[2]")
	WebElement update_cart;
	@FindBy(xpath="(//span[@class=\"a-icon a-icon-small-add\"])[1]")
	WebElement adding_qty;
	
	
	@FindBy(xpath="//span[@class=\"a-button a-button-primary a-button-icon\" and @id=\"a-autoid-1\"]")
	WebElement addcrtfronsearchpage;
	//span[@class="a-button a-button-primary a-button-icon" and @id="a-autoid-1"]
	public void addcrtfronsearchpage()
	{
		addcrtfronsearchpage.click();
	}
	
	public void search_textfield()
	{
		search_textfield.sendKeys("beauty"+Keys.ENTER);
		
		
	}
	
	public void brand_filter()
	{
		brand_filter.click();
	}
	public void item1()
	{
		item1.click();
	}
	
	public void childwindowchange(WebDriver driver)
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> ii=s1.iterator();
		String parentid=ii.next();
		String childid=ii.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		
		
	}
	public void ratings()
	{
		boolean b2=ratings.isDisplayed();
		System.out.println(b2+"******rating  is idsplayed******");
		Assert.assertEquals(b2, true,"ratings are visibel ");
	}
	
	
	public void price()
	{
		boolean b1=price.isDisplayed();
		System.out.println(b1+"price is idsplayed");
	}
	public void description()
	{
		boolean b3=description.isDisplayed();
		System.out.println(b3+"description is availabel");
	}
	public void add_to_cart() throws InterruptedException
	{
		Thread.sleep(2000);
		add_to_cart.click();
	}
	public void view_cart()
	{
		view_cart.click();
	}
	public void update_cart() throws InterruptedException
	{
		Thread.sleep(2000);
		update_cart.click();
	}
	public void adding_qty() throws InterruptedException
	{
		for(int i=0;i<2;i++) 
	{
		adding_qty.click();
		Thread.sleep(2000);
	}
	
	}
	
}
