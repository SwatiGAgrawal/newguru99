package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class EmailIdPage extends BaseClass{
	
	@FindBy(name="userName")
	private WebElement uname;
	
	public EmailIdPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String Uname)
	{
		UtilsClass.sendData(uname, Uname);
	}

}
