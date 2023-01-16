package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutCompletepage extends TestBase {
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement ThankYou;
	@FindBy(xpath="//img[@alt='Pony Express']")private WebElement ponyExpress;
	public  CheckOutCompletepage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifythankYouText()
	{
		return ThankYou.getText();
	}
	public boolean ponyExpressLogo()
	{
		return ponyExpress.isDisplayed();
	}
	

}
