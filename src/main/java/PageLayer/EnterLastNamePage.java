package PageLayer;

import static UtilsLayer.UtilsClass.sendData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class EnterLastNamePage extends BaseClass {

	@FindBy(name="lastName")
	private WebElement lastName1;
	
	
	public EnterLastNamePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void userEnterLastNAme(String name1)

	{
		sendData(lastName1,name1);
		
	}
}
