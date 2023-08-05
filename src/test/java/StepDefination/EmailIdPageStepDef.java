package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.EmailIdPage;
import io.cucumber.java.en.When;

public class EmailIdPageStepDef extends BaseClass{
	
	EmailIdPage emailPage;
	
	@When("user enters emailid")
	public void user_enters_emailid() {
		emailPage = new EmailIdPage();
		emailPage.enterEmailId("sarita@gmail.com");
	}

}
