package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Resources/MyFeature.feature"
        ,glue={"stepDefinition"},
        plugin = { "pretty" },
        monochrome = true
)
public class Test_CucumberRunner {

}
