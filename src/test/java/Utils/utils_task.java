package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class utils_task {
	
	WebDriver driver;
	
	public utils_task(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void scrolling_down() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for(int i=1;i<=5;i++)
		{
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
			Thread.sleep(3000);
		}
		
	}

}
