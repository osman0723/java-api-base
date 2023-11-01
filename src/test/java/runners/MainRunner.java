package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/functionalTests",
        dryRun = true, glue = "stepDefinitions",
        tags = "@apitest", monochrome = true, plugin = {"html:target/cucumber",
        "json:target/cucumber.json"} )

@RunWith(Cucumber.class)
public class MainRunner {

}
