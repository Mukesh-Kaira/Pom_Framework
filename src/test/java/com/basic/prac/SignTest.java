package com.basic.prac;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.Database;
import pages.AgentSign;

public class SignTest extends BaseClass {

	public SignTest() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	AgentSign as;
	
	@BeforeSuite(alwaysRun = true)
	public void Configuration_check()
	{
		
		Database db=new Database();
		
		db.Db_con_check(prop.getProperty("hostname"),prop.getProperty("username"),prop.getProperty("password"));
		int ass=db.flag;
		assertEquals(ass, 0);
		
		
		
	}
	
	@BeforeTest
	public void setup() throws Exception
	{
		intialization();
		as=new AgentSign(driver);
	}
	@BeforeClass
	public void header() throws InterruptedException
	{
		modifyheader();
	}
	
    @Test(priority=1)
   public void navigate_url()
   {
	   as.get_url();
	   
   }
    @Test(priority=2)
   public void signin()
   {
	   as.sign_in();
   }
    /*
    @AfterSuite
    public void close()
    {
    	driver.quit();
    }*/
}
