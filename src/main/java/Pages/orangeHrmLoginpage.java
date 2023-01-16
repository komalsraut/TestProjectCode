package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class orangeHrmLoginpage extends TestBase1{
	
	@FindBy(xpath = "//input[@name='username']") private WebElement username;
	//img[@src='/web/images/ohrm_branding.png?1666596668857']
	@FindBy(xpath = "//img[@src='/web/images/ohrm_branding.png?1666596668857']") private WebElement Logo;
	//input[@name='password']
	@FindBy(xpath = "//input[@name='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	//button[@type='submit']
	public orangeHrmLoginpage()  throws Exception
	{
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}
	public void username() throws Exception
	{
		username.sendKeys("khushbu");
		Thread.sleep(2000);
		password.sendKeys("1234k");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
	}
	public boolean varifyLogo() throws InterruptedException
	{
		Thread.sleep(5000);
		return Logo.isDisplayed();
		
	}

}
