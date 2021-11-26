package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {

	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='test 11 (0)'])[2]")
	private WebElement test11;

	@FindBy(xpath = "(//a[text()='test 18 (0)'])[2]")
	private WebElement test18;

	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement iPodClassic;

	@FindBy(xpath = "//a[text()='iPod Shuffle']")
	private WebElement iPodShuffle;

	@FindBy(xpath = "//a[text()='iPod Touch']")
	private WebElement iPodouch;

	@FindBy(xpath = "(//label[@class='input-group-addon'])[2]")
	private WebElement showMp3;
	@FindBy(xpath = "(//a[@class='list-group-item'])[9]")
	private WebElement test12;
	@FindBy(xpath = "(//a[@class='list-group-item'])[10]")
	private WebElement test15;
	@FindBy(xpath = "(//a[@class='list-group-item'])[11]")
	private WebElement test16;
	@FindBy(xpath = "(//a[@class='list-group-item'])[12]")
	private WebElement test17;
	@FindBy(xpath = "(//a[@class='list-group-item'])[13]")
	private WebElement test19;
	@FindBy(xpath = "(//a[@class='list-group-item'])[15]")
	private WebElement test20;
	@FindBy(xpath = "(//a[@class='list-group-item'])[16]")
	private WebElement test21;
	@FindBy(xpath = "(//a[@class='list-group-item'])[17]")
	private WebElement test22;
	@FindBy(xpath = "(//a[@class='list-group-item'])[25]")
	private WebElement test9;

	public void clickOnTest11() {
		test11.click();
	}

	public void clickOnTest18() {
		test18.click();
	}

	public void clickonIpodClassic() {
		iPodClassic.click();
	}

	public void clickonIPodShuffle() {
		iPodShuffle.click();
	}

	public void clickOnIPodouch() {
		iPodouch.click();
	}

	public void clickOnShowMp3() {
		showMp3.click();
	}

	public void clickOntest12() {
		test12.click();
	}

	public void clickOnTest15() {
		test15.click();
	}

	public void clickOnTest16() {
		test16.click();
	}

	public void clickOnTest17() {
		test17.click();
	}

	public void clickOnTest19() {
		test19.click();
	}

	public void clickOnTest20() {
		test20.click();
	}

	public void clickOnTest21() {
		test21.click();
	}

	public void clickOnTest22() {
		test22.click();
	}

	public void clickOnTest9() {
		test9.click();
	}

}