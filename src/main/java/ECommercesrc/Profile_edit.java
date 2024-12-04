package ECommercesrc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//check if user can edit profile 
public class Profile_edit
{
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement accountandlist;
	
@FindBy(xpath="//span[.=\"Your Account\"]")
WebElement youraccount;
@FindBy(xpath="(//div[@class=\"a-box ya-card--rich\"])[4]")
WebElement address_edit;
@FindBy(xpath="//button[.=\"Manage Profiles\"]")
WebElement manage_profiles;
@FindBy(xpath="(//span[@class=\"nav-line-2\"])[3]")
WebElement viewcart_addresspage;

public void accountandlist(WebDriver driver)
{
	Actions a1=new Actions(driver);
	a1.moveToElement(accountandlist).perform();
}
public void youraccount()
{
	youraccount.click();
	
}
public void address_edit()
{
	address_edit.click();
}
public void viewcart_addresspage()
{
	viewcart_addresspage.click();
}
/*public void manage_profiles()
{
	manage_profiles.click();
}*/
public Profile_edit(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

}
