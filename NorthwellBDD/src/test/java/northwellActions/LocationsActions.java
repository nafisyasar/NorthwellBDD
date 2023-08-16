package northwellActions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import northwellElements.LocationsElements;
import northwellUtilities.WebDriverSetup;

public class LocationsActions {
	
	LocationsElements elements;
	WebDriverWait wait = new WebDriverWait(WebDriverSetup.driver, 30);
	
	public LocationsActions() {
		elements = new LocationsElements();
		PageFactory.initElements(WebDriverSetup.driver, elements);
		
	}
	
	public void getHomePage() {
		WebDriverSetup.driver.get("https://www.northwell.edu/");
		WebDriverSetup.driver.manage().window().maximize();
	}
	
	
	public void clickOnLocationsButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accessible-megamenu-1691695670103-3")));
		elements.LocationsButton.click();
		
	}
	
	
	public void clickOnZipCode() {
		elements.ZipCodeSearchBar.click();
		
	}
	
	public void enterZipCode() {
		elements.ZipCodeSearchBar.sendKeys("11373");
		
	}
	
	public void clickSearchButton() {
		elements.SearchButton.click();
		
	}
	
	public void verifyLocationsPage() {
		String expectedUrl = "https://www.northwell.edu/doctors-and-care/locations?keywords=&zip=11373&type=";
		String actualUrl = WebDriverSetup.driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

}
