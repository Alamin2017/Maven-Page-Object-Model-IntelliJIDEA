package Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	public void takeScreenshotForFailure(WebDriver driver) throws IOException {
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String time=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
		String fileWithPath="./src/test/resources/screenshots/failures/fail"+time+".png";
		File DestFile= new File(fileWithPath);
		FileUtils.copyFile(screenshotFile,DestFile);
	}
	public void takeScreenshotForSuccess(WebDriver driver) throws IOException {
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String time=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
		String fileWithPath="./src/test/resources/screenshots/success/testSuccess"+time+".png";
		File DestFile= new File(fileWithPath);
		FileUtils.copyFile(screenshotFile,DestFile);
	}



}
