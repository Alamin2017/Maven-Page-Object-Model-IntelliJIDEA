package Page_Objects;

import Utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {
    WebDriver driver;

    public TestPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By image_logo=By.xpath("//*[@id='page']/div/div[3]/div/div[1]/div[1]/div[1]/a/img");
    By popular_item=By.xpath("//a[normalize-space()='Popular']");
    By products_list=By.xpath("//*[@class='productPane']/div");
    By bangla_lang=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[3]");
    By english_lang=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[4]/p[1]");
    By mini_title_text=By.xpath("//span[@itemprop='name']");

    public void click_popular_item() throws InterruptedException {
        ElementActions elementActions=new ElementActions(driver);
        elementActions.click_Element(popular_item);
       // driver.findElement(popular_item).click();
    }
    public void get_mini_title_text() throws InterruptedException {
        ElementActions elementActions=new ElementActions(driver);
        String text=elementActions.get_text_Element(mini_title_text);
        System.out.println("Title:"+text);

    }


}
