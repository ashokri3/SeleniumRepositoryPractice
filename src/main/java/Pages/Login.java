package Pages;

import Config.ConfigReader;
import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login
{
WebDriver driver;
commonutils cu;
By username=By.name("username");
By password=By.xpath("//input[@name='password']");
By login=By.xpath("//button[text()=' Login ']");
public Login(WebDriver driver)
{
this.driver=driver;
this.cu=new commonutils(driver);
}
public void enterusername(String user)
{
 cu.sendkeys(username,user);
}
public void enterpassword(String pass)
{
cu.sendkeys(password,pass);
}
public void clicksubmit()
{
cu.clicking(login);
}
public void equals()
{
 System.out.println(driver.getTitle());
 Assert.assertEquals(driver.getTitle(),"OrangeHRM");
}
}
