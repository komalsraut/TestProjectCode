package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollMethodTest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		WebElement movies=driver.findElement(By.xpath("//a[text()=\"More Movies\"]"));
		JavascriptExecutor ja=((JavascriptExecutor)driver);
	//	ja.executeScript("window.scrollBy(0,1000)");
	//	ja.executeScript("arguments[0].scrollIntoView();", movies);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.close();
		
	}

}
