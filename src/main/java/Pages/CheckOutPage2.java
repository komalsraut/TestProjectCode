package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutPage2 extends TestBase{
	@FindBy(xpath = "//span[text()='Checkout: Overview']") private WebElement CheckOutoverview;
	@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement DiverlypageText;
	@FindBy(id="finish")private WebElement FinishBtn;
	@FindBy(id="cancel")private WebElement cancelBtn;
	
	public  CheckOutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	public String  verrifyCheckoutOverviewText()
	{
		return CheckOutoverview.getText();
	}
	public String verifyDiliveryageText()
	{
		return DiverlypageText.getText();
	}
	public void verifyFinishBtn()
	{
		FinishBtn.click();
	}
	public void verifyCancelBtn()
	{
		cancelBtn.click();
	}
	

}
