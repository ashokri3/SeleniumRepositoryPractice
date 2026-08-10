package Base;
import Config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Launchbrowser
{
   private WebDriver driver ;
   private ConfigReader reader;

    public WebDriver browser()
    {
     reader=new ConfigReader();
     String browse=reader.getbrowser();
     System.out.println("Browser = " + browse);
     if (browse.equalsIgnoreCase("chrome"))
     {
         driver=new ChromeDriver();
     }
     else if (browse.equalsIgnoreCase("firefox"))
     {
      driver=new FirefoxDriver();
     }
     else {
      throw new RuntimeException("Invalid browser in config.properties: " + browse);
     }
     driver.manage().window().maximize();
     driver.get(reader.geturl());
     return driver;
    }
public void exit()
{
 if (driver!=null)
  driver.quit();
}
public void userpassword()
{
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
 ele.sendKeys(reader.getusername());
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(reader.getpassword());
 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
}
}
