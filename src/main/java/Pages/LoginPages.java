package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.ReadData;
import utility.ReadData1;

public class LoginPages extends TestBase{
	
	
	
	//private static final String Option = null;
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath ="//input[@id='user-name']") private WebElement userName;
	@FindBy(xpath ="//input[@id='password']") private WebElement password;
	@FindBy(xpath ="//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath ="//span[text()='Products']") private WebElement ProductLogo;
	
//COnstructor to initialize the elements of page
	public String verifyTitle() throws Exception
	{
		Thread.sleep(3000);
		return driver.getTitle();
		
	}
	
	public LoginPages() throws Exception
	{
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLoginLogo() throws Exception
	{
		Thread.sleep(3000);
		return loginLogo.isDisplayed();
	}
	public boolean verifyBotLogo() throws Exception
	{
		Thread.sleep(3000);
		return botLogo.isDisplayed();
	}

	public String loginToApp() throws Exception
	{
		userName.sendKeys(ReadData.readPropertyFile("userName"));
		
		password.sendKeys(ReadData.readPropertyFile("password"));
		//ReadData1.GetAllLink(userName, Option);
		loginBtn.click();
		
		//ReadData1.GetAllLink(userName, Option);
		return driver.getCurrentUrl();
	}
	public String VerifyProductLogo() throws Exception
	{
		loginToApp();
		return ProductLogo.getText();
		
	}


	public String getCurrentUrl() throws Exception
	{
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
	

}
