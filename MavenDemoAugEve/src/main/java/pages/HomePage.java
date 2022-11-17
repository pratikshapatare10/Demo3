package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//1
		@FindBy (xpath="//div[@class='app_logo']") private WebElement logo;
		
		//2
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3
		public void verifyHomePageLogo()
		{
			boolean res=logo.isDisplayed();
			if(res==true)
			{
				System.out.println("Logo is visible");
			}
			else
				System.out.println("Logo is not visible");
		}
}
