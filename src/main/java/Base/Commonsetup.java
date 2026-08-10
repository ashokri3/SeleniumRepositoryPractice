package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Commonsetup
{
    protected WebDriver driver;
    Launchbrowser l;
    public WebDriver getDriver()
    {
        return driver;
    }
    @BeforeMethod
        public void starting()
        {
            l=new Launchbrowser();
            driver= l.browser();
        }
     @AfterMethod
        public void end()

        {
            l.exit();
        }

    }


