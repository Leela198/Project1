package ECommercesrc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booksearch_page 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_textfield;
	@FindBy(xpath="//span[@class='a-size-base a-color-base'][normalize-space()='Paperback']")
	WebElement paperbook;
	@FindBy(xpath="//span[contains(text(),'25% Off or more')]")
	WebElement discount;
	@FindBy(xpath="//input[@id='p_36/range-slider_slider-item_lower-bound-slider']")
	WebElement scrollright;
	@FindBy(xpath="//input[@id='p_36/range-slider_slider-item_upper-bound-slider']")
	WebElement scrollleft;
	//span[@class='a-size-base a-color-base'][normalize-space()='Paperback']
	
	public void search_textfield()
	{
		search_textfield.sendKeys("books"+Keys.ENTER);
	}
	 public void fileter1()
	 {
		 paperbook.click();
	 }
	
	 public void fileter2()
	 {
		 discount.click();
	 }
	 public void pricerange(WebDriver driver) throws InterruptedException, AWTException
	 {
		 Thread.sleep(2000);
		 Actions a1=new Actions(driver);
		
		 
		 a1.doubleClick(scrollright).perform();
		
		Robot r1=new Robot();
		
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_SHIFT);
		
	 }
	 
	public Booksearch_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//r1.keyPress(KeyEvent.VK_3);
			//a1.dragAndDropBy(scrollright, 200, 0).perform();
			 //a1.dragAndDropBy(scrollleft,-100,0).perform();
			 
}
