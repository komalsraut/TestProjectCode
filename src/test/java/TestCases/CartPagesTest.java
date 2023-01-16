package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPages;

public class CartPagesTest extends TestBase{
	
	LoginPages login;
	InventoryPage invent;
	CartPage cart;
	@BeforeMethod
	
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPages();
		 invent=new InventoryPage();
		 cart=new CartPage();
		login.loginToApp();
		invent.addProduct();
			
	}
	@Test(enabled=false)
	public void verifyYourCartLogoTest()
	{
		boolean result = cart.VerifyYourCartLogo();
		Assert.assertEquals(result, true);
		Reporter.log("YourCartLogo test Verify = "+result);
	}
	@Test(enabled=false)
	public void verifyRemoveCartTest()
	{
		cart.verifyProductRemove();
		Reporter.log("Remove Product test Verify = " +cart);
		
	}
	@Test(enabled=true)
	public void verifyContinueBtnTest()
	{
		cart.verifyContinueBtn();
		Reporter.log(" contionue button test Verify = " +cart);
		
	}
	@Test(enabled=false)
	public void verifyCheckoutBtnTest() throws Exception
	{
		cart.verifyCheckoutBtn();
		Reporter.log(" checkOut button test Verify = " +cart);
	}
	@Test(enabled=false)
	public void verifyBotSwgLogoTest()
	{
		boolean result = cart.verifyBotSwagLogo();
		Assert.assertEquals(result, true);
		Reporter.log(" BotLogo test Verify = " +result);
	}
	@Test(enabled=false)
	public void verifyDescriptionTest()
	{
		String expRes="DESCRIPTION";
		String ActRes=cart.verifyDiscription();	
		Assert.assertEquals(expRes,ActRes );
		Reporter.log(" Discription test Verify = " +ActRes);
	}
	@Test(enabled=false)
	public void verifyPriceOfProduct()
	{
		String expRes="$29.99";
		String ActRes=cart.verifyPriceOfProduct();	
	Assert.assertEquals(expRes,ActRes );
	Reporter.log(" Price of Product test Verify = " +ActRes);
		
	}
	@Test(enabled=false)
	public void verifyPriceOfProduct1()
	{
		String expRes="$15.99";
		String ActRes=cart.verifyPriceOfProduct1();	
	Assert.assertEquals(expRes,ActRes );
	Reporter.log(" Price of Product test Verify = " +ActRes);
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
