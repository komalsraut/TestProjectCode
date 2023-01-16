package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage1;
import Pages.InventoryPage;
import Pages.LoginPages;

public class CheckOutPage1Test  extends TestBase{
	LoginPages login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage1 checkout1;
	@BeforeMethod
	
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPages();
		 invent=new InventoryPage();
		 cart=new CartPage();

		login.loginToApp();
		invent.addProduct();
		cart.verifyCheckoutBtn();
		checkout1=new CheckOutPage1();
			
	}
	@Test(enabled =false)
	public void verifyCheckOutTest()
	{
		String expRes="CHECKOUT: YOUR INFORMATION";
		String ActRes=checkout1.verifyCheckOutText();
		Assert.assertEquals(expRes,ActRes );
	}
	@Test (enabled=true)
	public void verifyChechoutInfo() throws Exception
	{
		checkout1.verifyFirstName();
		
	}
	@Test(enabled =false)
	public void VerifyCancelBtn()
	{
		checkout1.veirfycancel();
		
	}

	

	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
