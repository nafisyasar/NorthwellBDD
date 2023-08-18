package northwellActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import northwellElements.NorthwellLoginElements;
import northwellUtilities.WebDriverSetup;

public class NorthwellLoginActions {
	
	NorthwellLoginElements elements;
	Actions action = new Actions(WebDriverSetup.driver);
	//WebDriverWait wait = new WebDriverWait(WebDriverSetup.driver, 30);
	
	public NorthwellLoginActions() {
		elements = new NorthwellLoginElements();
		PageFactory.initElements(WebDriverSetup.driver, elements);
	}
	
	public void Hompage() {
		WebDriverSetup.driver.get("https://www.northwell.edu/");
		WebDriverSetup.driver.manage().window().maximize();
		WebDriverSetup.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	public void clickLoginButton() {
		//wait.until(ExpectedConditions.elementToBeClickable (By.id("gigya-login-link")));
		//elements.LoginButton.click();
		action.moveToElement(elements.LoginButton).click().build().perform();
	}
	
	public void enterEmail(String email) {
		email = "nafisyasar101@gmail.com";
		elements.username.sendKeys(email);
		
	}
	
	public void enterPassword(String password) {
		password = "abc123";
		elements.password.sendKeys(password);
		
	}
	
	public void clickBottomLoginButton() {
		elements.bottomLoginButton.click();
	}
	
	public void VerifyLogin() {
		if(WebDriverSetup.driver.getPageSource().contains("Invalid LoginID")) {
			System.out.println("Text Present");
		}else {
			System.out.println("Text Absent");
		}
	}

}
