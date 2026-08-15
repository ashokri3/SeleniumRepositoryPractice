package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Resource//pim.feature",glue="Resource",plugin = {"pretty", "html:target/pimreport.html"} )
public class pimrunner extends AbstractTestNGCucumberTests
{

}
