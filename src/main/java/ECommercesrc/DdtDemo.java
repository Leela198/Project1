package ECommercesrc;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DdtDemo 
{
	public static String un1,pwd1;
	public static  String un2,pwd2;
public  void un() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/project1/testdata/leela.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	
	 un1=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	 pwd1=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	
	 un2=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
	 pwd2=w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
}
	
	
}
