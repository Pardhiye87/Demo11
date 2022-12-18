package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.MSBTEActLink;


@Test(groups= {"MSBTEPage"},dependsOnGroups= {"HomePage"})
public class MSBTEActTest extends BaseClass{

	@Test(priority=1)
	public void clickOnवाघLink1()
	{
		MSBTEActLink msbteactlink=new MSBTEActLink();
		msbteactlink.clickOnवाघLink();
	}
	
	
	
	
	
	
	
	
	
	
}
