package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPages;
import utility.ReadData1;

public class LoginPageTest extends TestBase{
	LoginPages login;
	@BeforeMethod(alwaysRun=true)
	
	public void setup() throws Exception
	{
		
		initalization();
		login=new LoginPages();
		
	}
	
	
	@Test(invocationCount=2,priority=1,enabled=false)
	
	public void verifyTitleTest() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
	}
		
	@Test(dependsOnMethods= {"verifycurrentrl","verifyLoginLogoTest"},priority=1,enabled=false,groups="sanity",invocationCount=2)
	public void verifyLoginToAll() throws Exception
	{
		
		Thread.sleep(5000);
		String expUrl="https://www.saucedemo.com/inventory.html";
		String actUrl = login.loginToApp();
		Assert.assertEquals(expUrl,actUrl);
	}
	
	
	@Test (groups="sanity",enabled=true)
	public void verifycurrentrl() throws Exception
	{
		
		String expUrl="https://www.saucedemo.com/";
		String actUrl = login.getCurrentUrl();
		Assert.assertEquals(expUrl,actUrl);
	}
	@Test (groups="sanity",enabled=true)
	public void verifyLoginLogoTest () throws Exception 
	{
		boolean result=login.verifyLoginLogo();
		System.out.println("Execution started");
		//Assert.assertEquals(result, true);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(result, true);
		System.out.println("execution End");
		soft.assertAll();
	}
	@Test(groups="sanity",enabled=false)
	public void verifyBotLogoTest() throws Exception 
	{
		boolean result =login.verifyBotLogo();
		Assert.assertEquals(result, true);
	}
	@Test(groups="sanity",enabled=false)
	public void verifyInventoryTest() throws Exception
	{ 
		String expRes="PRODUCTS";
		String actRes=login.VerifyProductLogo();
		Assert.assertEquals(expRes,actRes);
		
	}
	
	
	
 
	@AfterMethod(alwaysRun=true)
	
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE==a.getStatus())
		{
			//System.out.println(ITestResult.FAILURE);
			ReadData1.ScreenShot(a.getName());
		}
		
		driver.close();
	}
	
		
	

}
