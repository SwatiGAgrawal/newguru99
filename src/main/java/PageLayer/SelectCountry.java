package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.HandleDropDown.*;

import BaseLayer.BaseClass;

public class SelectCountry extends BaseClass {

	@FindBy(name="country")
	private WebElement country;
	
	public SelectCountry() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry(String value) {
		
		selectByVisibleText(country, value);
	}

	
}
