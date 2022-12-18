package TestLayer;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import junit.framework.Assert;

 @Test(groups= {"HomePage"})
public class HomePageTest extends BaseClass {
	public HomePage homepage;
	
	
	@BeforeTest
	public static void setup()
	{
		BaseClass.initialition();
    }
	
	@Test(priority=1)
	public  void validateHomePageTitle()
	{
		homepage = new HomePage();
		Assert.assertEquals(homepage.getHomePageTitle(), "Maharashtra State Board of Technical Education, Mumbai , India");
	}
	
	@Test(priority=2)
	public void validateHpmePageUrl()
	{
		Assert.assertEquals(homepage.getHomePageUrl().contains("msbte"), true);
	}
	
	@Test(priority=3)
	public  void ValidateHomePageLogo()
	{
		
		Assert.assertTrue(homepage.checkDisplayStatusOfHomeLogo());	
	}
	
	@Test(priority=4)
	public void moveToOnAboutAsLinkAndClickOnMSBTELink()
	{
		homepage.moveOverAboutUsLinkAndClickOnMsbteActLink();
	}	
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
		
		
	}
	
	
