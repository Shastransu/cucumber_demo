package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class PageImplementation {
	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser And Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://demowebshop.tricentis.com";
		driver.get(url);
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Demo_3 loacteElements=PageFactory.initElements(driver,Demo_3.class);
		 loacteElements.loginmethod("shastransu@gmail.com", "Suprabh_01");
	}

}
