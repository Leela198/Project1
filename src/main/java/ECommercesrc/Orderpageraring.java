package ECommercesrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderpageraring 
{
	@FindBy(xpath="//span[.=\"& Orders\"]")
WebElement orders;
	@FindBy(xpath="//span[@class=\"a-button a-button-dropdown\"]")
	WebElement orders_dropdown;
	@FindBy(xpath="//a[@id=\"time-filter_3\"]")
	WebElement choose_year;
	@FindBy(xpath="(//span[@class=\"a-button-inner\"])[7]")
	WebElement review_product;
	@FindBy(xpath="(//div[@class=\"a-section a-spacing-top-micro\"]/button)[5]")
	WebElement fivestar_rating;
	
	//span[.="& Orders"]
	public void orders()
	{
		orders.click();
	}
	public void orders_dropdown()
	{
		orders_dropdown.click();
	}
	public void choose_year()
	{
		choose_year.click();
	}
	public void review_product() throws InterruptedException
	{Thread.sleep(2000);
		review_product.click();
	}
	
	public void fivestar_rating() throws InterruptedException
	{
		Thread.sleep(2000);
		fivestar_rating.click();
	}
	public Orderpageraring(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
