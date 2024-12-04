package ECommercesrc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Checkout

{
	
	@FindBy(xpath="(//span[@id=\"sc-buy-box-ptc-button\"])")
WebElement proceed_to_checkout;



@FindBy(xpath="//span[.=\"Other UPI Apps\"]")
WebElement upi_pay;

@FindBy(xpath="//input[@name=\"ppw-claimCode\"]")
WebElement coupon_code;

@FindBy(xpath="//input[@name=\"ppw-claimCodeApplyPressed\"]")
WebElement coupon_code_apply;

@FindBy(xpath="//span[@id=\"shipToThisAddressButton\"]")
WebElement change;
@FindBy(xpath="//input[@id=\"pp-S6qoMc-166\"]")
WebElement card_payments;
@FindBy(linkText="Enter card details")
WebElement entercard_details;

@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[3]")
WebElement netbanking;
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[5]")
WebElement emi;
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[6]")
WebElement cash_on_delivery;
//name="ppw-claimCodeApplyPressed"
//span[@id="shipToThisAddressButton"]
public void shipping_address()
{
	change.click();
}

public void payments() throws InterruptedException
{
	Thread.sleep(2000);
	upi_pay.click();
}
public void proceed_to_checkout()
{
	proceed_to_checkout.click();
}

public void coupon_code()
{
	coupon_code.sendKeys("WINTER30");
}
public void coupon_code_apply()
{
	coupon_code_apply.click();
}
public void card_payments()
{
	card_payments.click();
}

public void entercard_details()
{
	entercard_details.click();
}
public void netbanking() throws InterruptedException
{ 
	Thread.sleep(2000);
	netbanking.click();
}

public void emi() throws InterruptedException
{
	Thread.sleep(2000);
	emi.click();
}
public void cash_on_delivery()
{
	cash_on_delivery.click();
}
public Payment_Checkout(WebDriver driver)
		{
				PageFactory.initElements(driver, this);
		}
}
