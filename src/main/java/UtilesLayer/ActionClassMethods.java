package UtilesLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClassMethods extends BaseClass {
	
	public static void clickOnElement(WebElement wb)
	{
       new Actions(driver).click(wb).build().perform();
	}
	//-------------------------------------------------------------1
	public static void rightClickOnElement(WebElement wb)
	{
	   new Actions(driver).contextClick(wb).build().perform();
	}
	//--------------------------------------------------------------2
	public static void doubleClickOnElement(WebElement wb)
	{
	   new Actions(driver).doubleClick().build().perform();
	}
	//--------------------------------------------------------------3
	public static void mouseOverElement(WebElement wb)
	{
		new Actions(driver).moveToElement(wb).build().perform();
	}
	//---------------------------------------------------------------4
	public static void mouseOverClickOnElement(WebElement mousover,WebElement click)
	{
		 new Actions (driver).moveToElement(mousover).click(click).build().perform();
	}
	//---------------------------------------------------------------5
	public static void sendDataInTextBox(WebElement wb,String value)
	{
		new Actions(driver).sendKeys(wb,value).build().perform();
	}
	//----------------------------------------------------------------6
	public static void dragAndDropElement(WebElement src,WebElement trg)
	{
		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}
	//----------------------------------------------------------------7
	public static void clickOnHoldElement(WebElement wb)
	{
		new Actions(driver).clickAndHold(wb).build().perform();
	}
	//----------------------------------------------------------------8
	public static void releaseElement(WebElement wb)
	{
		new Actions (driver).release(wb).build().perform();
	}
	//-----------------------------------------------------------------9
	public static void enterDataInUpperCase(WebElement wb,String value)
	{
		new Actions (driver).keyDown(Keys.SHIFT).sendKeys(wb,value).keyUp(Keys.SHIFT).build().perform();
	
	}
//----------------------------------------------------------------------10
	public static void moveToEndPage()
	{
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	//-------------------------------------------------------------------11
	public static void moveToHomePage()
	{
		new Actions (driver).keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	//------------------------------------------------------------------12
	public static void copyTextFromTextBox(WebElement wb)
	{
		new Actions (driver).keyDown(Keys.CONTROL).sendKeys(wb, "a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}
	//-------------------------------------------------------------------13
	public static void pastTextInTextBox(WebElement wb)
	{
		new Actions (driver).keyDown(Keys.CONTROL).sendKeys(wb,"v").keyUp(Keys.CONTROL).build().perform();
		
	}
//----------------------------------------------------------------------14
}
