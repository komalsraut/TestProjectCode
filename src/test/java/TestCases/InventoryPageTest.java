package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPages;

public class InventoryPageTest extends TestBase{
	
	
	
	LoginPages login;
	InventoryPage invent;
	@BeforeMethod(alwaysRun=true)
	
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPages();
		 invent=new InventoryPage();
		login.loginToApp();
			
	}
	@Test(priority=1,groups="smoke")
	public void verifyPeekLogoTest()
	{
		boolean result=invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
		Reporter.log("PeekLogo test Verify = "+result);
	}
	@Test(enabled=false)
	public void verifyTwitterLogoTest()
	{
		boolean result=invent.verifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("twitterLogo test Verify = "+result);
	}
	@Test(priority=2)
	public void verifyFacebookLogoTest()
	{
		boolean result=invent.verifyFacebookLogo();
		Assert.assertEquals(result, true);
		Reporter.log("facebookLogo test Verify = "+result);
	}
	@Test(enabled=true,groups="smoke")
	public void verifyLinkdlinLogoTest()
	{
		boolean result=invent.verifyLinkdinLogo();
		Assert.assertEquals(result, true);
		Reporter.log("LinkdlinLogo test Verify = "+result);
	}
	@Test(priority=3,groups="regression")
	public void verifyAddToProductTest() throws Exception
	{
		String result=invent.addProduct();
		Assert.assertEquals(result, "3");
		Reporter.log("Add to Product test = "+result);
		
	}
	

	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}