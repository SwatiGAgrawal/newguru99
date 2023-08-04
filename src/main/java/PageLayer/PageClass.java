package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

import static UtilsLayer.UtilsClass.*;

public class PageClass extends BaseClass {

	@FindBy(name="firstName")
	private WebElement firstname;
	
	

	public PageClass() {

		PageFactory.initElements(driver, this);
	}

	public void registerPageFuctinality(String name)
	
	{
		sendData(firstname,name);
		
	}
	
	
}
