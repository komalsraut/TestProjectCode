package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.ReadData1;

public class CartPage extends TestBase{
	private static final String Option = null;
	@FindBy(xpath = "//span[text()='Your Cart']") private WebElement YourCartLogo;
	@FindBy(id="remove-sauce-labs-backpack") private WebElement RemoveProduct;
	@FindBy(id="continue-shopping") private WebElement continueBotton;
	@FindBy(id="checkout") private WebElement checkOutButton;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement SwagBotLogo;
	@FindBy(xpath = "//div[text()='DESCRIPTION']") private WebElement Discription;
	@FindBy(xpath = "//div[text()='29.99']") private WebElement PriceOfProduct;
	@FindBy(xpath = "//div[text()='15.99']") private WebElement PriceOfProduct1;
	
	
	public  CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean VerifyYourCartLogo()
	{
		return YourCartLogo.isDisplayed();
		
	}
	public void verifyProductRemove()
	{
		RemoveProduct.click();
	}
	public void verifyContinueBtn()
	{
		continueBotton.click();
	}
	public void verifyCheckoutBtn() throws Exception
	{
		checkOutButton.click();
		//ReadData1.ScreenShot(SwagBotLogo, Option);
	}
	public boolean verifyBotSwagLogo()
	{
		return SwagBotLogo.isDisplayed();
	}
	public String verifyDiscription()
	{
		return Discription.getText();
	}
	public String verifyPriceOfProduct()
	{
		return PriceOfProduct.getText();
	}
	public String verifyPriceOfProduct1()
	{
		return PriceOfProduct1.getText();
	}
	

}
