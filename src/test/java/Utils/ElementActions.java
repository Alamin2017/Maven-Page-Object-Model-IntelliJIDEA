package Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ElementActions {
    public WebDriver driver;
    public ElementActions(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement getElement(By locator)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public void click_Element(By locator) throws InterruptedException {
        getElement(locator).click();
        Thread.sleep(3000);
    }
    public String get_text_Element(By locator) throws InterruptedException {
        return getElement(locator).getText();
    }
}
