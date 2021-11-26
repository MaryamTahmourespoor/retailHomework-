package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesAndPdasPageObject extends Base {

	public PhonesAndPdasPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement palmTreoPor;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement IPhone;

	public void ClickOnPalmTreoPor() {
		palmTreoPor.click();
	}

	public void clickOniphone() {
		IPhone.click();
	}

}
