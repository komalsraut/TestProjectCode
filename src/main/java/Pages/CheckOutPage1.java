package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutPage1 extends TestBase{
	@FindBy(xpath = "//span[text()='Checkout: Your Information']") private WebElement CheckOutInfo;	
	@FindBy(id="first-name")private WebElement FirstName;
	@FindBy(id="last-name")private WebElement LastName;
	@FindBy(id="postal-code")private WebElement postalcode;
	@FindBy(id="continue")private WebElement contnbtn;
	@FindBy(id="cancel")private WebElement cancelBtn;
	public  CheckOutPage1()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCheckOutText()
	{
		return CheckOutInfo.getText();
	}
	public void verifyFirstName() throws Exception
	{
		FirstName.sendKeys("aaa");
		Thread.sleep(2000);
		LastName.sendKeys("bbb");
		Thread.sleep(2000);
		postalcode.sendKeys("223344");
		Thread.sleep(2000);
		contnbtn.click();
		Thread.sleep(2000);
	}
	public void veirfycancel()
	{
		cancelBtn.click();
	}
	
	

}
