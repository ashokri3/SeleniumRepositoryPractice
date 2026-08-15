package Pages;

import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buzz
{
    WebDriver driver;
    commonutils cu;

By claim= By.xpath("//span[text()='Claim']");
By configuration=By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and text()='Configuration ']");
By eventvalue=By.xpath("//a[text()='Events']");
By adding=By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon'] ");
By eventname=By.xpath("//form[@class='oxd-form']//div[2]//input");
By description=By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2']//textarea");
By save=By.xpath("//button[text()=' Save ']");
 public buzz(WebDriver driver)
 {
  this.driver=driver;
  this.cu=new commonutils(driver);
 }
public void clickclaim()
{
cu.clicking(claim);
}
public void configurationevents()
{
cu.clicking(configuration);
cu.clicking(eventvalue);
}
public void adding()
{
cu.clicking(adding);
}
public void Eventvalue()
{
 cu.sendkeys(eventname,"Prakash");
}
public void Description()
{
cu.sendkeys(description,"Everything is added");
}
public void saving()
{
cu.clicking(save);
}
}
