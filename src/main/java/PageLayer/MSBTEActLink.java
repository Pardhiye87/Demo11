package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilesLayer.ActionClassMethods;

public class MSBTEActLink extends BaseClass {
	
	@FindBy(xpath="//font[contains(text(),'डॉ. अभय ')]")
    WebElement  वाघ;
	
	public MSBTEActLink()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnवाघLink()
	{
		ActionClassMethods.clickOnElement(वाघ);
	}
}
