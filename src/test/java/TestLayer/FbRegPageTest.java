package TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.FbRegPage;

public class FbRegPageTest extends BaseClass{
	public static FbRegPage fbregpage;
	
	@BeforeClass
	public void setUp()
	{
		BaseClass.initialition();
	}
	
	@Parameters({"fname","lname","email","pass","conpass"})
	@Test(priority=1)
	public void fristName(String fname,String lname,String email,String pass,String conpass)
	{
	    fbregpage=new FbRegPage();
		fbregpage.enterFirstName(fname);
		fbregpage.enterLastName(lname);
		fbregpage.enterEmailName(email);
		fbregpage.enterPassName(pass);
		fbregpage.enterConPassName(conpass);
	}
	
	@Parameters({"day","month","year"})
	@Test(priority=2)
	public void enterBod(String day,String month,String year)
	{
		fbregpage.enterDayMonthYear(day, month, year);
	}

}
