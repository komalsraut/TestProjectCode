package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;

import Pages.orangeHrmLoginpage;

public class OrangeHrmLoginPageTest extends TestBase1{
	orangeHrmLoginpage login1;
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initalization();
		login1=new orangeHrmLoginpage();
		
	}
	@Test
	public void VerifyUsernameTest() throws Exception
	{
		login1.username();
	}
	@Test(enabled=false)
	public void VerifyLogoTest() throws InterruptedException
	{
		
		boolean Result=login1.varifyLogo();
		Assert.assertEquals(Result, true);
	}
//	@Test 
//	public void Verify
//	{
//		
//	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
