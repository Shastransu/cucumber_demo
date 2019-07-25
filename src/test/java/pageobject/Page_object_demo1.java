package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_object_demo1 {
	WebDriver driver;
	
By lnc=By.linkText("Log in");
By usname=By.name("Email");
By pwd=By.name("Password");
By log=By.xpath("//input[@value='Log in']");

public Page_object_demo1(WebDriver driver)
{
	this.driver=driver;
}
public void clickLink()
{
	driver.findElement(lnc).click();
}
public void typename(String username)
{
	driver.findElement(usname).sendKeys("shastransu@gmail.com");
}
public void typepassword(String password)
{
	driver.findElement(pwd).sendKeys("Suprabh_01");
}
public void clicklogin()
{
	driver.findElement(log).click();
}

}
