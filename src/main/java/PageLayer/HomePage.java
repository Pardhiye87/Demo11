package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilesLayer.ActionClassMethods;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//img[contains(@alt,'Maharashtra')]")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='About Us']")
	WebElement aboutUsLink;
	
	
	@FindBy(xpath="//a[text()='MSBTE Act']")
	WebElement msbteActLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveOverAboutUsLinkAndClickOnMsbteActLink()
	{
		ActionClassMethods.mouseOverClickOnElement(aboutUsLink, msbteActLink);
	}
	
	public boolean checkDisplayStatusOfHomeLogo()
	{
		return logo.isDisplayed();
	}
	
	
	public String getHomePageTitle()
	{
	   return	driver.getTitle();
	}
	
	
	
	public String getHomePageUrl()
	{
	 return driver.getCurrentUrl();
	}
	
}
