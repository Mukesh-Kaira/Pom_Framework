package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static  WebDriver driver;
	public static Properties prop;
	
	public  BaseClass() throws InterruptedException
	{

	try{
		  prop = new Properties();
		  FileInputStream conf = new FileInputStream(System.getProperty("user.dir")+"/src/configurations/conf.properties");
		  //FileInputStream xpath = new FileInputStream(System.getProperty("user.dir")+"/src/configurations/xpath.properties");
		  prop.load(conf);
		 // prop.load(xpath);
	  }
	  catch(FileNotFoundException e)
	  {
	  e.printStackTrace();
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }

	}
	
	public static void intialization()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mukesh.kaira\\workspace\\prac\\src\\drivers\\chromedriver.exe");
	
	File addonpath = new File(
			"C:/Users/mukesh.kaira/workspace/prac/src/header/extension_2_0_7.crx");
	ChromeOptions options = new ChromeOptions();
	options.addExtensions(addonpath);
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	driver =new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	
	public static void modifyheader() throws InterruptedException
	{
		//System.out.println(driver);
		driver.get("chrome-extension://innpjfdalfhpcoinfnehdnbkglpmogdi/options.html");
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@tooltip='Add New']")).click();
		
		WebElement actionElem = driver.findElement(By.name("action"));
		Select select = new Select(actionElem);
		select.selectByVisibleText("Add");
		
		WebElement nameElem = driver.findElement(By.name("name"));
		nameElem.sendKeys("username");

		WebElement valueElem = driver.findElement(By.name("value"));
		valueElem.sendKeys("csr2@hcentive.com");

		WebElement descElem = driver.findElement(By.name("description"));
		descElem.sendKeys("backoffice");

		driver.findElement(By.xpath("//button[@tooltip='Save']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@tooltip='Start Modifying Headers']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@tooltip='Enable']")).click();
		Thread.sleep(2000);
		
        
	}
	
	
	
	

}
