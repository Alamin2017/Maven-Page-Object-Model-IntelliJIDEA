package Test_Script;

//import Page_Objects.ChaldalHomePage;
import Page_Objects.ChaldalHomePage;
import org.testng.annotations.Test;
public class Test_ChaldalHomePage extends BaseEnv {
    @Test(priority=1)
    public void test_logo_image() throws InterruptedException
    {
        driver.get("https://www.chaldal.com/");
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.image_logo_visibility();
    }
    @Test(priority=2)
    public void test_popular_product_count_shows_products_name() throws InterruptedException
    {
        driver.get("https://www.chaldal.com/");
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.popular_product_name_count();
    }
    @Test(priority=3)
    public void test_exchange_language() throws InterruptedException
    {
        driver.get("https://www.chaldal.com/");
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.test_language();
    }
}
