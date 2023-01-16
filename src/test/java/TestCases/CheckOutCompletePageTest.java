package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutCompletepage;
import Pages.CheckOutPage1;
import Pages.CheckOutPage2;
import Pages.InventoryPage;
import Pages.LoginPages;

public class CheckOutCompletePageTest extends TestBase {
	LoginPages login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage1 checkout1;
	CheckOutPage2 checkout2;
	CheckOutCompletepage checkOutComp;
	
	@BeforeMethod
	
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPages();
		 invent=new InventoryPage();
		 cart=new CartPage();
		 checkout1=new CheckOutPage1();
		 checkout2=new CheckOutPage2();

		login.loginToApp();
		invent.addProduct();
		cart.verifyCheckoutBtn();
		checkout1.verifyFirstName();
		checkout2.verifyFinishBtn();
		
		 checkOutComp=new CheckOutCompletepage();
			
	}
	@Test
	public void verifyThankYouText()
	{
		String expRes="THANK YOU FOR YOUR ORDER";
		String actRes=checkOutComp.verifythankYouText();
		Assert.assertEquals(expRes, actRes);
	}
	@Test
	public void verifyPonyLogo()
	{
		boolean result = checkOutComp.ponyExpressLogo();
		Assert.assertEquals(result, true);
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	

}

