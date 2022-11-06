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
        //click product
        obj.product_one().click();
        Thread.sleep(3000);
        //select size
        Select option= new Select(obj.product_size());
        option.selectByVisibleText("XL");
        Thread.sleep(3000);
        //increase the quantity
        obj.quantity_increase().click();
        Thread.sleep(3000);
        //click on add to cart button
        obj.add_cart_button().click();
        Thread.sleep(5000);
        //click on checkout button
        obj.proceed_to_checkout_button().click();
        Thread.sleep(5000);
        //click on promo code
        obj.promo_code().click();
        Thread.sleep(5000);
        //sends text in promo box
        obj.promo_text_box().sendKeys("20OFF");
        Thread.sleep(5000);
        //click on add button
        obj.promo_add_button().click();
        Thread.sleep(5000);
        //click on check out button
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
