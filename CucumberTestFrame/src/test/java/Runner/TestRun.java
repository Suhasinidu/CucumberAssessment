package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/Ubanladder.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun {

}
