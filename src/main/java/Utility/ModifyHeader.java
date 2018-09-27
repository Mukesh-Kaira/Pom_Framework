package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class ModifyHeader extends BaseClass{
	
	public ModifyHeader() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void  Modify_Header() throws Exception
	{
		//System.out.println(driver);
		try{
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
		
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
				
		        
	}

}
