package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Base.BaseClass;

import org.apache.commons.io.FileUtils;


public class TakeScreenshot extends BaseClass{
	
	
	public TakeScreenshot() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public  static void Take_Screenshot(WebDriver driver,String filename) throws IOException
	{
	   	

       File scrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       FileUtils.copyFile(scrShot, new File(System.getProperty("user.dir")+"\\src\\ScreenShot\\"+filename+".jpg"));
	}

}
