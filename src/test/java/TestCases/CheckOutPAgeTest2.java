package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage1;
import Pages.CheckOutPage2;
import Pages.InventoryPage;
import Pages.LoginPages;

public class CheckOutPAgeTest2 extends TestBase {
	
		LoginPages login;
		InventoryPage invent;
		CartPage cart;
		CheckOutPage1 checkout1;
		CheckOutPage2 checkout2;
		
		@BeforeMethod
		
		public void setup() throws Exception
		{
			initalization();
			 login=new LoginPages();
			 invent=new InventoryPage();
			 cart=new CartPage();
			 checkout1=new CheckOutPage1();

			login.loginToApp();
			invent.addProduct();
			cart.verifyCheckoutBtn();
			checkout1.verifyFirstName();
			checkout2=new CheckOutPage2();
				
		}
		@Test
		public void verifyText()
		{
			String expes="CHECKOUT: OVERVIEW";
			String actRes=checkout2.verrifyCheckoutOverviewText();
			Assert.assertEquals(expes, actRes);
		}
		@Test
		public void verifyDelivaryText()
		{
			String expes="FREE PONY EXPRESS DELIVERY!";
			String actRes=checkout2.verifyDiliveryageText();
			Assert.assertEquals(expes, actRes);
		}
		@Test
		public void verifyFinishBtn()
		{
			checkout2.verifyFinishBtn();
		}
		@Test
		public void verifyCancelBtn()
		{
			checkout2.verifyCancelBtn();
		}
		
		@AfterMethod
		public void CloseBrowser()
		{
			driver.close();
		}

}
