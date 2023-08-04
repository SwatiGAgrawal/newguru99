package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PageClass;
import io.cucumber.java.en.Given;

public class RegisterStepDefination extends BaseClass {
	
    public static PageClass pageclass;
    
    
    
	
	@Given("user enter firstname")
	public void user_enter_firstname() {
		initialization();
		
		pageclass= new PageClass();
		pageclass.registerPageFuctinality("swati");
	   
	}
	
	


}
