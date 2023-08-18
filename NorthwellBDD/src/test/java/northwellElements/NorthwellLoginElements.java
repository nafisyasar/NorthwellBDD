package northwellElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NorthwellLoginElements {
	
	@FindBy(id ="gigya-login-link")
	public WebElement LoginButton;
	
	@FindBy(id = "loginUsername")
	public WebElement username;
	
	@FindBy(id = "loginPassword")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app-mount\"]/form/div/div/div[3]/button")
	public WebElement bottomLoginButton;

}
