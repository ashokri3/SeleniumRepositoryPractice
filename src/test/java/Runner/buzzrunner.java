package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Resource//buzz.feature",glue="Resource",plugin = {"pretty", "html:target/buzzreport.html"} )
public class buzzrunner extends AbstractTestNGCucumberTests
{

}
