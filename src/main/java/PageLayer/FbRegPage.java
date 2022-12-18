package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilesLayer.HandleDropDown;

public class FbRegPage extends BaseClass {

	@FindBy(name = "firstname")
	WebElement fname;

	@FindBy(name = "lastname")
	WebElement lname;

	@FindBy(name = "reg_email__")
	WebElement moboremail;

	@FindBy(name = "reg_passwd__")
	WebElement pass;

	@FindBy(name = "reg_email_confirmation__")
	WebElement conpass;

	@FindBy(id = "day")
	WebElement day;

	@FindBy(id = "month")
	WebElement month;

	@FindBy(id = "year")
	WebElement year;

	public FbRegPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String Fname) {
		fname.sendKeys(Fname);
	}

	public void enterLastName(String Lname) {
		lname.sendKeys(Lname);
	}

	public void enterEmailName(String email) {
		moboremail.sendKeys(email);
	}

	public void enterPassName(String Pass) {
		pass.sendKeys(Pass);
	}

	public void enterConPassName(String Pass) {
		conpass.sendKeys(Pass);
	}
	
	public void enterDayMonthYear(String Day,String Month,String Year)
	{
		HandleDropDown.handleDPByVisibleText(day, Day);
		HandleDropDown.handleDPByVisibleText(month, Month);
		HandleDropDown.handleDPByVisibleText(year, Year);
	}

}
