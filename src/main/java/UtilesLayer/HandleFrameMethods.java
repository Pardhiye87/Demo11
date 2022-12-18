package UtilesLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrameMethods extends BaseClass {
	
	
	public static void frameByIdOrName(String value)
	{
		driver.switchTo().frame(value);
	}
//------------------------------------------------------------------------
	public static void frameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
//---------------------------------------------------------------------------
	public static void frameByWebElement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}
//-----------------------------------------------------------------------------
	public static void switchToParentFrame()
	{
		driver.switchTo().parentFrame();
	}
//--------------------------------------------------------------------------------
	public static void switchToTopReame()
	{
		driver.switchTo().defaultContent();
	}
//------------------------------------------------------------------------------------
}
