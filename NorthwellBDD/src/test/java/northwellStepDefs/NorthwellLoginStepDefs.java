package northwellStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import northwellActions.NorthwellLoginActions;

public class NorthwellLoginStepDefs {
	
	NorthwellLoginActions obj = new NorthwellLoginActions();
	
	@Given("User is on Northwell homepage")
	public void user_is_on_Northwell_homepage() {
	   obj.Hompage();
	   
	}
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    obj.clickLoginButton();
	}
	

	@When("User enters invalid email")
	public void user_enters_invalid_email(String email) {
	   obj.enterEmail(email);
	}
	

	@When("User enters invalid password")
	public void user_enters_invalid_password(String password) {
	    obj.enterPassword(password);
	}
	

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
	    obj.clickBottomLoginButton();
	}
	

	@Then("User should see {string} message")
	public void user_should_see_message(String string) {
	   obj.VerifyLogin();
	}




}
