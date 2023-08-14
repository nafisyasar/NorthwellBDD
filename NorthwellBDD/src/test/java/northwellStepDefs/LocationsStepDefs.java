package northwellStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import northwellActions.LocationsActions;

public class LocationsStepDefs {
	
	LocationsActions obj = new LocationsActions();
	
	@Given("User is on the Northwell Homepage")
	public void user_is_on_the_Northwell_Homepage() {
		obj.getHomePage();
	    
	}

	@When("User clicks on Locations button on top menu bar")
	public void user_clicks_on_Locations_button_on_top_menu_bar() {
		obj.clickOnLocationsButton();
	    
	}

	@When("User clicks on {string} search bar")
	public void user_clicks_on_search_bar(String string) {
		obj.clickOnZipCode();
	   
	}

	@When("User enters zip code {string}")
	public void user_enters_zip_code(String string) {
		obj.enterZipCode();
	    
	}

	@Then("User should see physicians nearby the zip code of {int}")
	public void user_should_see_physicians_nearby_the_zip_code_of(Integer int1) {
		obj.clickSearchButton();
		obj.verifyLocationsPage();

	}




}
