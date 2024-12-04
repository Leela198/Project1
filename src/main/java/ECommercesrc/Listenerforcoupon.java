package ECommercesrc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerforcoupon implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("coupon code Invalid");
		TakesScreenshot tss1=(TakesScreenshot)driver;
		File f1=tss1.getScreenshotAs(OutputType.FILE); //source file
		File des=new File("/Users/LeelaRaniK/Desktop/Assignments/Testcasestart"+Math.random()+".png"); //destination file
		try {
			FileHandler.copy(f1, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("coupon code Invalid");
		TakesScreenshot tss1=(TakesScreenshot)driver;
		File f1=tss1.getScreenshotAs(OutputType.FILE); //source file
		File des=new File("/Users/LeelaRaniK/Desktop/Assignments/Testcasefailcoupon"+Math.random()+".png"); //destination file
		try {
			FileHandler.copy(f1, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("coupon code Invalid");
		TakesScreenshot tss1=(TakesScreenshot)driver;
		File f1=tss1.getScreenshotAs(OutputType.FILE); //source file
		File des=new File("/Users/LeelaRaniK/Desktop/Assignments/Testcasefailcoupon"+Math.random()+".png"); //destination file
		try {
			FileHandler.copy(f1, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("coupon code Invalid");
		TakesScreenshot tss1=(TakesScreenshot)driver;
		File f1=tss1.getScreenshotAs(OutputType.FILE); //source file
		File des=new File("/Users/LeelaRaniK/Desktop/Assignments/Testcasefinish"+Math.random()+".png"); //destination file
		try {
			FileHandler.copy(f1, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
	
}
