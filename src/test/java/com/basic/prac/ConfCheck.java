package com.basic.prac;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.Database;

public class ConfCheck extends BaseClass {

	public ConfCheck() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeSuite
	public void Configuration_check()
	{
		
		Database db=new Database();
		
		db.Db_con_check(prop.getProperty("hostname"),prop.getProperty("username"),prop.getProperty("password"));
		int ass=db.flag;
		assertEquals(ass, 0);
		
		
		
	}

}
