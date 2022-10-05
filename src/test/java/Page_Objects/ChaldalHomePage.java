package Page_Objects;
import Utils.utils_task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class ChaldalHomePage {
    WebDriver driver;
    public ChaldalHomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    By image_logo=By.xpath("//*[@id='page']/div/div[3]/div/div[1]/div[1]/div[1]/a/img");

    By popular_item=By.xpath("//a[contains(text(),'Popular')]");

    By products_list=By.xpath("//*[@class='productPane']/div");

    By bangla_lang=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[3]");

    By english_lang=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[1]");


    public void image_logo_visibility() throws InterruptedException
    {
        boolean image=driver.findElement(image_logo).isDisplayed();
        Thread.sleep(3000);
        System.out.println("Image is Exist:"+image);
    }
    public void popular_product_name_count() throws InterruptedException
    {
        driver.findElement(popular_item).click();

        utils_task obj=new utils_task(driver);
        obj.scrolling_down();

        List<WebElement> products=driver.findElements(products_list);
        System.out.println("Popular Product size:"+products.size());
        for (int i=0;i<products.size();i++)
        {
            //System.out.println(""+products.get(i).getText());
            System.out.println(""+products.get(i).getText());
            System.out.println("");
        }
        Thread.sleep(3000);
    }
    public void test_language() throws InterruptedException
    {
        driver.findElement(bangla_lang).click();
        Thread.sleep(4000);
        driver.findElement(english_lang).click();
        Thread.sleep(4000);

    }



}
