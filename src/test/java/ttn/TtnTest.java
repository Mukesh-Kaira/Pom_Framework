package ttn;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.TakeScreenshot;

public class TtnTest extends BaseClass {
	
	public TtnTest() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=0)
	public void openbrowser() throws InterruptedException, IOException
	{
		BaseClass.intialization();
		
		
	}
	
	@Test(priority=1)
	public void gotourl() throws InterruptedException, IOException
	{
		driver.get(prop.getProperty("url"));
		Thread.sleep(500);
		TakeScreenshot.Take_Screenshot(driver,"google");
		driver.close();
	}

}
