package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.SelectCountry;
import io.cucumber.java.en.Given;

public class SelectCountrySteps extends BaseClass{

	
	@Given("user select country")
	public void user_select_country() {
	    
		SelectCountry selectCountry1 = new SelectCountry();
		selectCountry1.selectCountry("INDIA");
	}
}
