package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class WebAction extends BaseClass {
	
	public WebAction() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void sendkeys(WebElement el,String text)
	{
		el.sendKeys(text);
	}
	
	public static void dropdown(WebElement el,String selectby,String value)
	{
		Select drop= new Select(el);
		if(selectby.equals("index"))
		{ 
			int index=Integer.parseInt(value);
					drop.selectByIndex(index);
		}
		else if (selectby.equals("value"))
		{
			String value_tofill=selectby;
			drop.selectByValue(value_tofill);
		}
		
		else if(selectby.equals("visibletext"))
		{
			String text=value;
			drop.selectByVisibleText(text);
		}
	}
	
	
	

}
