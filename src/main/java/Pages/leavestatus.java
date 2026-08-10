package Pages;

import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class leavestatus
{
WebDriver driver;
commonutils cu;

By leave= By.xpath("//span[normalize-space()='Leave']");
By myleave=By.xpath("//a[text()='My Leave']");
By fromdate=By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]");
By todate=By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]");
By clearicon=By.xpath("//i[contains(@class,'bi-x') and contains(@class,'--clear')]");
By leavestatusdropdown=By.xpath("//div[@class='oxd-select-text-input'][1]");
By pendingapproval=By.xpath("//span[normalize-space()='Pending Approval']");
By leavetypedropdown=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div");
By uspersonal=By.xpath("//span[normalize-space()='US - Personal']");
By searchbutton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

public leavestatus(WebDriver driver)
{
this.driver=driver;
this.cu=new commonutils(driver);
}
public void leave()
{
 cu.clicking(leave);
}
public void Myleave()
{
cu.clickelement(myleave);
}
public void fromdate()
{
cu.sending(fromdate,"2026-03-04");
}
public void todate()
{
cu.sending(todate,"2026-08-01");
}
public void clearvalue()
{
 while (true) {
  List<WebElement> clearIcons = driver.findElements(clearicon);

  if (!clearIcons.isEmpty())
   clearIcons.get(0).click();
  break;
 }
}
public void Leavestatusdropdown()
{
cu.clicking(leavestatusdropdown);
}
public void Pendingapproval()
{
 cu.clicking(pendingapproval);
}
public void Leavetypedropdown()
{
cu.clicking(leavetypedropdown);
}
public void usapproval()
{
cu.clicking(uspersonal);
}
public void search()
{
 cu.clicking(searchbutton);
}
}
