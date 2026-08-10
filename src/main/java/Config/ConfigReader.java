package Config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader
{
private Properties prop;
public ConfigReader()
{
prop=new Properties();
    try (FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
        prop.load(fis);
    }
    catch (Exception e)
    {
    e.getStackTrace();
    }
}
public String getbrowser()
{
return prop.getProperty("browser");
}
public String geturl()
{
return prop.getProperty("url");
}
public String getusername()
{
return prop.getProperty("username");
}
public String getpassword()
{
    return prop.getProperty("password");
}
}
