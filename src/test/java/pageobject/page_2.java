package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_2 {
	
	public static void main(String...args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser And Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://demowebshop.tricentis.com";
		driver.get(url);
		driver.manage().window().maximize();	
		Page_object_demo1 Pobject=new Page_object_demo1(driver);
		Pobject.clickLink();
		String username="";
		Pobject.typename(username);
		String password="";
		Pobject.typepassword(password);
		Pobject.clicklogin();
		System.out.println("title of the page is"+driver.getTitle());
		
	}

}
