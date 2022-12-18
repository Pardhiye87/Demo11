package UtilesLayer;

import BaseLayer.BaseClass;

public class AlertPopUpMethods extends BaseClass{
	
	public static void clickOnOkButton()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void clickOnCancelButton()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void enterDataInAlertTextBox(String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static String captureAlertText()
	{
		return driver.switchTo().alert().getText();
	}

}
