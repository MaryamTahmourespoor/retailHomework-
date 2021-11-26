package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
	
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continueButton;
	
	
	
	public void clickonContinueButton() {
		continueButton.click();
	}
	
}
