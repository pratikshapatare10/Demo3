package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class TestClass {
  @Test
  public void f() {
	  
	  Property_Reader p=new Property_Reader();
	  
	  System.setProperty("webdriver.chrome.driver",p.getChromePath() );
		WebDriver driver=new ChromeDriver();
		
		driver.get(p.getUrl());
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage l=new LoginPage(driver);
		l.setLoginPageUn();
		l.setLoginPagePwd();
		l.clickLoginPageLgnBtn();
		
		HomePage h=new HomePage(driver);
		h.verifyHomePageLogo();
		
  }
}
