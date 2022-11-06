package Test_Script;

import Page_Objects.TestPage;
import org.testng.annotations.Test;

public class Test_Prac extends BaseEnv{

    @Test(priority = 1)
    public void Popular_Test() throws InterruptedException {
        TestPage obj=new TestPage(driver);
        driver.get("https://www.chaldal.com/");
        //obj.click_on_popular_Element();
        obj.click_popular_item();
        obj.get_mini_title_text();
    }

}
