package config;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //file
    //ioexception
    //java util properties

    private Properties properties;

    public ConfigReader() throws FileNotFoundException {
        properties = new Properties();

        try {
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public String getBrowser(){
        return properties.getProperty("browser");
    }

    public String getUrl(){
        return properties.getProperty("url");
    }

}

