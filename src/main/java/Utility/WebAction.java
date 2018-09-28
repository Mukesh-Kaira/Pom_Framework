package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class WebAction extends BaseClass {
	
	public WebAction() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void click(WebElement element)
	{
		try {
		if(element!=null)
		{
		element.click();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void sendkeys(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public static void dropdown(WebElement element,String selectby,String value)
	{
		Select drop= new Select(element);
		if(selectby.equals("index"))
		{ 
			int index=Integer.parseInt(value);
					drop.selectByIndex(index);
		}
		else if (selectby.equals("value"))
		{
			String value_to_fill=selectby;
			drop.selectByValue(value_to_fill);
		}
		
		else if(selectby.equals("visibletext"))
		{
			String text=value;
			drop.selectByVisibleText(text);
		}
	}
	
	
	

}
