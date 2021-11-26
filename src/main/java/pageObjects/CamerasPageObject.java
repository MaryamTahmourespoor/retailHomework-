package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CamerasPageObject extends Base {
	public CamerasPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEos5d;
	@FindBy(xpath = "//a[text()='Nikon D300']")
	private WebElement nikonD300;
	@FindBy(xpath = "(//label[@class='input-group-addon'])[1]")
	private WebElement sortByCanon;

	public void clickOnCanonEos5d() {
		canonEos5d.click();
	}

	public void clickNikonD300() {
		nikonD300.click();
	}

	public void clickOnSortByCanon() {
		sortByCanon.click();
	}
}