package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class commonutils {
 WebDriver driver;
 WebDriverWait wait;

 public commonutils(WebDriver driver) {
  this.driver = driver;
  wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 }

 public WebElement clickelement(By locator) {
  return wait.until(ExpectedConditions.elementToBeClickable(locator));
 }

 public WebElement visibleelement(By locator) {
  return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
 }

 public void clicking(By locator)
 {
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

  wait.until(ExpectedConditions.invisibilityOfElementLocated(
          By.cssSelector(".oxd-form-loader")));

  wait.until(ExpectedConditions.elementToBeClickable(locator));

  clickelement(locator).click();
 }

 public void sendkeys(By locator, String text) {
  visibleelement(locator).clear();
  visibleelement(locator).sendKeys(text);
 }
public void sending(By locator,String text)
{
 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
 element.sendKeys(Keys.CONTROL + "a");
 element.sendKeys(Keys.DELETE);
 element.sendKeys(text);
}
public void listelement(By locator,String text,By locator1)
{
 List<WebElement> rows = driver.findElements(locator);
 for (WebElement row : rows)
 {
  System.out.println("SIZE" + rows.size());
  System.out.println(row.getText());
  if (row.getText().contains(text))
  {
   List<WebElement> buttons = driver.findElements(locator1);
   System.out.println("Buttons = " + buttons.size());
   buttons.get(2).click();
   break;
  }
 }
}
}

