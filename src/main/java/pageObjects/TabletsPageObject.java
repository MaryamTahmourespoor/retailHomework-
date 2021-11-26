package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{

	public TabletsPageObject() {
		PageFactory.initElements(driver,this);	
		}
	@FindBy(xpath="//a[contains(text(),'Tablets')]")
	private WebElement tablets;
	@FindBy(xpath="//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement samsungGalaxyTab;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[2]")
	private WebElement addToWishList;
		
	
	public void ClickOnTablets() {
	tablets.click();
	}
	public void ClickOnSamsungGalaxyTab() {
	samsungGalaxyTab.click();
	}
	public void ClickOnAddToWishList() {
	addToWishList.click();
	}
} 