package Pages;

import Utils.commonutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class maindashboard
{
    WebDriver driver;
    commonutils cu;
    By dashboard= By.xpath("//a[@class='oxd-main-menu-item active']");
    By timesheettoapprove=By.xpath("//div[@class='orangehrm-todo-list']//div[1]");
    By pendingselfreview=By.xpath("//div[@class='orangehrm-todo-list']//div[2]");
    By candidatetointerview=By.xpath("//div[@class='orangehrm-todo-list']//div[3]");

    public maindashboard(WebDriver driver)
    {
        this.driver=driver;
        this.cu=new commonutils(driver);
    }
    public void setDashboard()
    {
     cu.clicking(dashboard);
    }
    public void Timesheettoapprove()
    {
     cu.clicking(timesheettoapprove);
    }
    public void Pendingselfreview()

    {
    cu.clicking(pendingselfreview);
    }
    public void Candidatetointerview()
    {
     cu.clicking(candidatetointerview);
    }

}
