package utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class ReadData1 extends TestBase {
	public static void selectClass(WebElement ele,String option)
	{
		
		Select s=new Select(ele);
		s.selectByVisibleText(option);
		
	}
	public static String ScreenShot(String Option) throws Exception
	{
		File Scource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\MEGHAVI COMPUTERS\\eclipse-workspace\\TestProject2\\ScreenShot/"+Option+".jpeg");
		FileHandler.copy(Scource, dest);
		return  null;
	}
	public static void GetAllLink(WebElement ele,String Option)
	{
		List<WebElement> link = ele.findElements(By.xpath("//a"));
		 System.out.println(link.size());
		 for(int i=0;i<link.size();i++)
			 
		 {
			System.out.println(link.get(i).getText());
			
		 }
	}

}
