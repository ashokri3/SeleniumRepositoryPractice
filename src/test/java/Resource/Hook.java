package Resource;

import Base.Launchbrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hook
{
    public static WebDriver driver;
    public static Launchbrowser l;

    @Before
    public void starting()
    {
        l=new Launchbrowser();
        driver= l.browser();
    }
   @After
    public void end()

    {
        l.exit();
    }

}
