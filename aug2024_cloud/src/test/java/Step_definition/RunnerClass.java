package Step_definition;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(strict = false,
        features = "src/test/resources/feature",
        plugin = {"pretty", "json:target/cucumber.json"},
        tags = {"~@ignore"} )
@RunWith(Cucumber.class)
public class RunnerClass {
}
