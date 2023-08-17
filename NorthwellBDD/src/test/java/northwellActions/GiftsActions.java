package northwellActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import northwellElements.GiftsElements;
import northwellUtilities.WebDriverSetup;

public class GiftsActions {
	
	GiftsElements elements;
	//WebDRiverWait wait = new WebDriverWait()
	
	public GiftsActions() {
		elements = new GiftsElements();
		PageFactory.initElements(WebDriverSetup.driver, elements);
	}
	
	public String V_user_is_at_home_page() {
		WebDriverSetup.driver.get("https://www.northwell.edu/");
		WebDriverSetup.driver.manage().window().maximize();
		WebDriverSetup.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String title=WebDriverSetup.driver.getTitle();
		return title;
	}

	public void v_user_clicks_the_gift_button() {
		
	}

	public void v_user_is_able_to_land_on_gifts_page() {
	}
}
