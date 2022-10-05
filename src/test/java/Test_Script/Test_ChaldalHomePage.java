package Test_Script;

import Page_Objects.ChaldalHomePage;
import org.testng.annotations.Test;
public class Test_ChaldalHomePage extends BasePage {


    @Test(priority=1)
    public void test_logo_image() throws InterruptedException
    {
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.image_logo_visibility();
    }
    @Test(priority=2)
    public void test_popular_product_count_shows_products_name() throws InterruptedException
    {
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.popular_product_name_count();
    }
    @Test(priority=3)
    public void test_exchange_language() throws InterruptedException
    {
        ChaldalHomePage obj=new ChaldalHomePage(driver);
        obj.test_language();
    }


}
