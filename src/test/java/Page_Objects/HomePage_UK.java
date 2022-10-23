package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage_UK {
	
	    WebDriver driver;
	    public HomePage_UK(WebDriver driver)
	    {
	        this.driver=driver;
	    }
		By toggle= By.xpath("//a[normalize-space()='Toggle']");
	    By homepage_link=By.xpath("//a[normalize-space()='Homepage']");
	    By accordion_link=By.xpath("//a[normalize-space()='Accordion']");
	    By browser_tabs_link=By.xpath("//a[normalize-space()='Browser Tabs']");
		By actions_link=By.xpath("//a[normalize-space()='Actions']");
		By buttons=By.xpath("//a[normalize-space()='Buttons']");

		By all_menu_list=By.xpath("//nav[@id='menu']//ul/li");
		public List<WebElement> all_menu_count()
		{
//			  List<WebElement> count_all =driver.findElements(all_menu_list);
//			  System.out.println("All_Count:"+count_all.size());
//			  for(int i=1;i<count_all.size();i++)
//			  {
//				  System.out.println("All Menus Name:"+count_all.get(i).getText());
//			  }
			return driver.findElements(all_menu_list);
		}

		public WebElement actions_link()
		{
			return driver.findElement(actions_link);
		}
		public WebElement buttons()
		{
			return driver.findElement(buttons);
		}
	    public WebElement accordion_link()
	    {
	        return driver.findElement(accordion_link);
	    }
	    public WebElement browser_tabs_link()
	    {
	    	return driver.findElement(browser_tabs_link);
	    }
	    public WebElement homepage_link()
	    {
	    	return driver.findElement(homepage_link);
	    }
	    public WebElement toggle()
	    {
	    	return driver.findElement(toggle);
	    }
	    

}
