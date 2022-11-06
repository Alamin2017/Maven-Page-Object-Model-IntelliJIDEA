package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage_UK {

    public WebDriver driver;
    public ProductPage_UK(WebDriver driver)
    {
        this.driver=driver;
    }
    By confirm_msg=By.xpath("/html/body/main/section/div/div/section/section[1]/div/div/div/h3");
    public WebElement confirm_msg(){return driver.findElement(confirm_msg);}
    By pay_by_check=By.id("payment-option-1");
    public WebElement pay_by_check(){return driver.findElement(pay_by_check);}
    By condition_to_approve=By.id("conditions_to_approve[terms-and-conditions]");
    public WebElement condition_to_approve(){return driver.findElement(condition_to_approve);}
    By order_button=By.xpath("//button[normalize-space()='Order with an obligation to pay']");
    public WebElement order_button(){return driver.findElement(order_button);}
    By shipping_field=By.xpath("//textarea[@id='delivery_message']");
    public WebElement shipping_field(){return driver.findElement(shipping_field);}
    By address_field=By.xpath("//input[@name='address1']");
    public WebElement address_field(){return driver.findElement(address_field);}
    By city_field=By.xpath("//input[@name='city']");
    public WebElement city_field(){return driver.findElement(city_field);}
    By state_field=By.xpath("//select[@name='id_state']");
    public WebElement state_field(){return driver.findElement(state_field);}
    By postal_code=By.xpath("//input[@name='postcode']");
    public WebElement postal_code(){return driver.findElement(postal_code);}
    By continue_2=By.xpath("//button[@name='confirm-addresses']");
    public WebElement continue_2(){return driver.findElement(continue_2);}
    By continue_3=By.xpath("//button[@name='confirmDeliveryOption']");
    public WebElement continue_3(){return driver.findElement(continue_3);}
    By Mr_checkbox=By.xpath("//label[normalize-space()='Mr.']");
    public WebElement Mr_checkbox(){return driver.findElement(Mr_checkbox);}
    By first_name=By.xpath("//input[@name='firstname']");
    public WebElement first_name(){return driver.findElement(first_name);}
    By last_name=By.xpath("//input[@name='lastname']");
    public WebElement last_name(){return driver.findElement(last_name);}
    By email=By.xpath("//form[@id='customer-form']//input[@name='email']");
    public WebElement email(){return driver.findElement(email);}
    By get_terms_conditions=By.xpath("//input[@name='psgdpr']");
    public WebElement terms_conditions(){return driver.findElement(get_terms_conditions);}
    By continue_button=By.xpath("//button[@data-link-action='register-new-customer']");
    public WebElement continue_button(){return driver.findElement(continue_button);}
    By product1=By.xpath("//img[@alt='Hummingbird printed t-shirt']");
    public WebElement product_one()
    {
        return driver.findElement(product1);
    }
    By size_option=By.xpath("//select[@id='group_1']");
    By quantity_increase=By.xpath("//i[@class='material-icons touchspin-up']");
    By add_cart_button=By.xpath("//button[@class='btn btn-primary add-to-cart']");
    By proceed_to_checkout=By.xpath("//a[text()='Proceed to checkout']");
    By promo_code=By.xpath("//a[normalize-space()='Have a promo code?']");
    public WebElement promo_code(){return driver.findElement(promo_code);}
    By promo_text_box=By.xpath("//input[@placeholder='Promo code']");
    public WebElement promo_text_box(){return driver.findElement(promo_text_box);}
    By promo_add_button=By.xpath("//span[normalize-space()='Add']");
    public WebElement promo_add_button(){return driver.findElement(promo_add_button);}


    public WebElement product_size(){return driver.findElement(size_option);}
    public WebElement quantity_increase(){return driver.findElement(quantity_increase);}
    public WebElement add_cart_button(){return driver.findElement(add_cart_button);}
    public WebElement proceed_to_checkout_button(){return driver.findElement(proceed_to_checkout);}



}
