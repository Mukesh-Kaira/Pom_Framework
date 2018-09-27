package com.basic.prac;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.Createprofile;

public class CreateProfileTest extends BaseClass {

	Createprofile cp;
	public CreateProfileTest() throws Exception {
		super();
		//
		
	}
	@Test(priority=1)
	public void setup() throws Exception
	{
		cp=new Createprofile(driver);
	}
	@Test(priority=2)
	public void click_create_customer()
	{
		cp.create_customer_profile();
	}
	@Test(priority=3)
	public void fill_create_profilepage() throws InterruptedException
	{
		cp.create_profile();
	}
	
	@Test(priority=4)
	public void usps_fill() throws InterruptedException
	{
		cp.usps();
	}

}
