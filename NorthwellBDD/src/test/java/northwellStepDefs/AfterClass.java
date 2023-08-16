package northwellStepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import northwellUtilities.WebDriverSetup;


public class AfterClass {
	@After
	public void afterChromeScenario(Scenario scen) {

		System.out.println(">> Test Eexecution Completed: " + scen.getName()+" <<");
		System.out.println(">> Shutting Down Browser! <<");

		try {
			if (scen.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) WebDriverSetup.driver;
				byte[] imageBytes = ts.getScreenshotAs(OutputType.BYTES);
				scen.attach(imageBytes, "image/png", "failed_image");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//SetupDriver.tearDownDriver();
		
		System.out.println(">> Driver Closed! <<");

	}
}
