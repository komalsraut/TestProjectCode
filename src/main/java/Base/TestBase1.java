package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
	public	static	WebDriver	driver;		//Global	and	Public
	public	void	initalization() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver	=	new	ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}
}
