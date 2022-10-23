package Test_Script;

import Page_Objects.HomePage_UK;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_HomePage_UK extends BaseEnv {
	
	  @Test(priority=1)
	    public void test_Menu_all_Links() throws InterruptedException
	    {
	        driver.get("https://www.automationtesting.co.uk/");
	        Thread.sleep(3000);
	        HomePage_UK obj=new HomePage_UK(driver);
//          Count down all menu link
//			obj.all_menu_count();
//			int all_count=obj.all_menu_count().size();
//			System.out.println("All_Count:"+all_count);
			int all_count=obj.all_menu_count().size();
			System.out.println("All_Count:"+ all_count);
			Assert.assertEquals(21,21);

			  for(int i=1;i<obj.all_menu_count().size();i++)
			  {
				  System.out.println("All Menus Name:"+ obj.all_menu_count().get(i).getText());

			  }
//			utils_task scrolling=new utils_task(driver);
//			scrolling.scrolling_down();
			Thread.sleep(3000);
//

//
//			obj.accordion_link().click();
//			boolean acc=obj.accordion_link().isDisplayed();
//			System.out.println("Accordion link Exists:"+acc);
//	        Thread.sleep(3000);
//
//	        obj.browser_tabs_link().click();
//			String bro=obj.browser_tabs_link().getText();
//			System.out.println("Text of browser tabs link:"+bro);
//	        Thread.sleep(3000);
//
//	        obj.homepage_link().click();
//			boolean home=obj.homepage_link().isEnabled();
//			System.out.println("Home page enable status:"+home);
//	        Thread.sleep(3000);
//
//			obj.actions_link().click();
//			Thread.sleep(3000);
//
//			obj.buttons().click();
//			Thread.sleep(3000);
//
//	        obj.toggle().click();
//	        Thread.sleep(3000);
	    }

}
