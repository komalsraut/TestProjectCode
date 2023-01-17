package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class TestBase {
	
	public	static	WebDriver	driver;		//Global	and	Public
	public	void	initalization() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver	=	new	ChromeDriver();
	driver.manage().window().maximize();
	driver.get(ReadData.readPropertyFile("url"));
	//driver.get("https://www.saucedemo.com/");
	//khushabhu
	
	}

}
