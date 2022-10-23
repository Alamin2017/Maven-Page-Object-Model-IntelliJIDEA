package Test_Script;

import Utils.utils_task;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseEnv {
    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @AfterMethod
    public void screenShot(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                utils_task utils=new utils_task(driver);
                utils.takeScreenshotForFailure(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        else{
            try{
                utils_task utils=new utils_task(driver);
                utils.takeScreenshotForSuccess(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        driver.close();
    }
}
