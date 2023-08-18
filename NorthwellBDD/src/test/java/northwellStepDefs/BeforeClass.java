package northwellStepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import northwellUtilities.WebDriverSetup;

public class BeforeClass {
	@Before
	
	public void beforeChromeScenario(Scenario scen) {
		System.out.println(">>> ChromeDriver Initialization <<<");
		try {
			WebDriverSetup.SetUpChromeDriver();
			System.out.println(">>> ChromeDriver Initialized <<<");
			System.out.println(scen.getName());
		} catch (Exception e) {
			System.out.println(">>> ChromeDriver Initialization has failed");
		}
		
	}

}
