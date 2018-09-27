package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.WebAction;

public class Createprofile extends BaseClass{

	@FindBy(xpath="//a[contains(text(),'Create Customer Profile')]")
	WebElement Create_cust_profile;
	
	@FindBy(id="userProfile.firstName")
	WebElement first_name;
	
	@FindBy(id="userProfile.lastName")
	WebElement last_name;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(id="userProfile.contactInfo.primaryAddress.streetAddress1")
	WebElement Street_Address;
	
	@FindBy(id="userProfile.contactInfo.primaryAddress.city")
	WebElement city;
	
	@FindBy(id="userProfile.contactInfo.primaryAddress.zip")
	WebElement zipcode;
	
	@FindBy(id="userProfile.contactInfo.primaryAddress.county")
	WebElement county;
	
	@FindBy(id="mailing_same_as_resident")
	WebElement maling_address;
	
	
	@FindBy(id="userProfile.contactInfo.primaryPhoneNumber_0")
	WebElement ph_no;
	
	
	@FindBy(id="check_terms_services")
	WebElement term_service;
	
	@FindBy(id="phoneApp")
	WebElement Application_source;
	
	@FindBy(xpath="//input[@id='registerSubmit']")
	WebElement create_profile_button;
	
	@FindBy(id="enteredHomeAddress")
	WebElement usps_selection;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement usps_submit;
	
	@FindBy(id="enteredMailingAddress")
	WebElement usps_selection_mail;
	
	
	
	
	public Createprofile(WebDriver driver) throws Exception {
		//super();
	  BaseClass.driver=driver;
	  
	  PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	public void create_customer_profile()
	{
		WebAction.click(Create_cust_profile);
	}
	
	
	public void create_profile() throws InterruptedException
	{
		WebAction.sendkeys(first_name,"test");
		WebAction.sendkeys(last_name,"test");
		WebAction.click(dob);
		WebAction.sendkeys(dob,"01/01/1989");
		WebAction.sendkeys(Street_Address,"test");
		WebAction.sendkeys(city,"test");
		WebAction.click(zipcode);
		WebAction.sendkeys(zipcode,"01001");
		WebAction.dropdown(county,"visibletext","HAMPDEN");
		Thread.sleep(90);
		WebAction.click(maling_address);
		WebAction.sendkeys(ph_no,"2343243424");
		WebAction.click(term_service);
		WebAction.click(Application_source);
		WebAction.click(create_profile_button);
		
		
	}
	
	public void usps() throws InterruptedException
	{ 
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(usps_selection));
		WebAction.click(usps_selection);
		wait.until(ExpectedConditions.elementToBeClickable(usps_selection_mail));
		WebAction.click(usps_selection_mail);
		WebAction.click(usps_submit);
		
	}
	
	

}
