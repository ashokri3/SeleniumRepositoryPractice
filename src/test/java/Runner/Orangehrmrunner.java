package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Resource/leave.feature",glue="Resource",plugin = {"pretty", "html:target/cucumberreport.html"})
public class Orangehrmrunner extends AbstractTestNGCucumberTests
{

}
