package Test_Script;

import Page_Objects.ProductPage_UK;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_Product_UK extends BaseEnv{

    @Test(priority=1)
    public void test_product() throws InterruptedException
    {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(3000);
        ProductPage_UK obj=new ProductPage_UK(driver);
        obj.product_one().click();
        Thread.sleep(3000);
        Select option= new Select(obj.product_size());
        option.selectByVisibleText("XL");
        Thread.sleep(3000);
        obj.quantity_increase().click();
        Thread.sleep(3000);
        obj.add_cart_button().click();
        Thread.sleep(5000);
        obj.proceed_to_checkout_button().click();
        Thread.sleep(5000);
        obj.promo_code().click();
        Thread.sleep(5000);
        obj.promo_text_box().sendKeys("20OFF");
        Thread.sleep(5000);
        obj.promo_add_button().click();
        Thread.sleep(5000);
        obj.proceed_to_checkout_button().click();
        Thread.sleep(5000);
        obj.Mr_checkbox().click();
        Thread.sleep(5000);
        obj.first_name().sendKeys("John");
        Thread.sleep(5000);
        obj.last_name().sendKeys("smith");
        Thread.sleep(5000);
        obj.email().sendKeys("johnsmith@gmail.com");
        Thread.sleep(5000);
        obj.terms_conditions().click();
        Thread.sleep(5000);
        obj.continue_button().click();
        Thread.sleep(5000);
        obj.address_field().sendKeys("123 Main Street");
        Thread.sleep(5000);
        obj.city_field().sendKeys("Houston");
        Thread.sleep(5000);
        Select state=new Select(obj.state_field());
        state.selectByVisibleText("Texas");
        Thread.sleep(5000);
        obj.postal_code().sendKeys("77021");
        Thread.sleep(5000);
        obj.continue_2().click();
        Thread.sleep(5000);
        obj.shipping_field().sendKeys("If i am not in,Please leave my delivery on my porch");
        Thread.sleep(5000);
        obj.continue_3().click();
        Thread.sleep(5000);
        obj.pay_by_check().click();
        Thread.sleep(5000);
        obj.condition_to_approve().click();
        Thread.sleep(5000);
        obj.order_button().click();
        Thread.sleep(5000);
        String text=obj.confirm_msg().getText();
        //Assert.assertEquals("",text);
        Assert.assertEquals("Test is Passed","\uE876YOUR ORDER IS CONFIRMED",text);
        Thread.sleep(5000);



    }


}
