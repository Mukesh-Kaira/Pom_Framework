package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.WebAction;

public class AgentSign extends BaseClass {
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signin_button;
	
	
	public AgentSign(WebDriver driver) throws Exception {
		super();

        BaseClass.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
		
	
	}
    
	//WebElement  signin_button=driver.findElement(By.xpath(prop.getProperty("sign_in")));
	
	public  void get_url()
	{
		System.out.println("hi i am in get_url");
		driver.get(prop.getProperty("url"));
	}
	
	public  void sign_in()
	{
		WebAction.click(signin_button);
	}
	

}
