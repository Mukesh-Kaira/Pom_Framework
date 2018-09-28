package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class TakeScreenshot {
	
	//static String filepath=System.getProperty("user.dir")+"\\src\\ScreenShot\\test.jpg";
	
	public  static void Take_Screenshot(WebDriver driver,String filename) throws IOException
	{
		//Convert web driver object to TakeScreenshot

       File scrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

       FileUtils.copyFile(scrShot, new File(System.getProperty("user.dir")+"\\src\\ScreenShot\\"+filename+".jpg"));
	}

}
