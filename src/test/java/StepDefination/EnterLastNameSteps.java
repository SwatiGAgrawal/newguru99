package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.EnterLastNamePage;
import io.cucumber.java.en.Given;

public class EnterLastNameSteps extends BaseClass{

	@Given("user enter lastname")
	public void user_enter_lastname() {
	    
		EnterLastNamePage enterLastNamePage = new EnterLastNamePage();
		enterLastNamePage.userEnterLastNAme("agarwal");
		
	}
}
