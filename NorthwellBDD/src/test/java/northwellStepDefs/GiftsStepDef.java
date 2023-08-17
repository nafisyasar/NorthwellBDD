package northwellStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import northwellActions.GiftsActions;

public class GiftsStepDef {
	
	GiftsActions GA = new GiftsActions();
	
	@Given("^User is at home page$")
	public void user_is_at_home_page()  {
		GA.V_user_is_at_home_page();
	    
	}

	@When("^User clicks the gift button$")
	public void user_clicks_the_gift_button() {

	}

	@Then("^User is able to land on gifts page$")
	public void user_is_able_to_land_on_gifts_page() {
	    	}
}