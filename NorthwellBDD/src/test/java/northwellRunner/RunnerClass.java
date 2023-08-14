package northwellRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"FeatureFile"},
		glue = {"northwellStepDefs"},
		plugin = {"pretty", "html: target/cucumberreports", "json: target/cucumber-jsonreports/cucumber.json"}
			)
		
		
	public class RunnerClass extends AbstractTestNGCucumberTests {
		
	
}
