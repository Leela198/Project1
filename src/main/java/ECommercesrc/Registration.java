package ECommercesrc;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration
{
	
	//step 1 locate the elements
		WebDriver driver;
		@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
		WebElement accountandlist;
		@FindBy(xpath="//span[@class=\"nav-action-inner\"]")
		WebElement signinbutton;
		
		public void accountandlist(WebDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountandlist).perform();
		}
		
		
		public void signinbutton()
		{
			signinbutton.click();
		}
		
		/*FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/project1/testdata/leela.xlsx");
//step-2 open the excel sheet
		Workbook w1=WorkbookFactory.create(f1);
		//step 3 go to actual sheet
		
		String un=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		
		
		String pwd=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);*/
public Registration(WebDriver driver)
{
	PageFactory.initElements(driver,this );
}



}
