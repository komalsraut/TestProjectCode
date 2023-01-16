package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import utility.ReadData1;

public class InventoryPage extends TestBase{
	
    
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
     @FindBy(id="add-to-cart-sauce-labs-backpack") private WebElement Backpack;
     @FindBy(id="add-to-cart-sauce-labs-bike-light") private WebElement BikeLight;
     @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTshirt;
     @FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement ProductCount;
     @FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortProductDropDown;
     @FindBy(xpath = "//a[text()='Twitter']") private WebElement TwitterLogo;
     @FindBy(xpath = "//a[text()='Facebook']") private WebElement facebookLogo;
     @FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkdinLogo;
     
     
	
	public InventoryPage() 
	{
				PageFactory.initElements(driver, this);
	}
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifyTwitterLogo()
	{
		return TwitterLogo.isDisplayed();
	}
	
	public boolean verifyFacebookLogo()
	{
		return facebookLogo.isDisplayed();
	}
	public boolean verifyLinkdinLogo()
	{
		return linkdinLogo.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		
		ReadData1.selectClass(sortProductDropDown, "Name (Z to A)");
//		ReadData1.ScreenShot(facebookLogo, Option);
//		ReadData1.GetAllLink(sortProductDropDown, Option);
//		ReadData1.GetAllLink(ProductCount, Option);
		
		Thread.sleep(3000);
		Backpack.click();
		BikeLight.click();
		boltTshirt.click();
		Thread.sleep(5000);
		ProductCount.click();
		Thread.sleep(2000);
		return ProductCount.getText();
		
		
		
	}
	
	
		
	
	
	
}
