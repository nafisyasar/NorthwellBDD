package northwellElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsElements {
	
	@FindBy(id = "//accessible-megamenu-1691695670103-3")
	public WebElement LocationsButton;
	//accessible-megamenu-1691695670103-3
	//*[contains(@class, 'main-nav__primary-nav-item')][2]
	//*[@id="accessible-megamenu-1692234615736-3"]

	@FindBy(id = "geolocations-zip")
	public WebElement ZipCodeSearchBar;
	
	@FindBy(id = "geo_search_btn")
	public WebElement SearchButton;

}
