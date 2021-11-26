package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsAndNotebooksPageObject extends Base {

	public LaptopsAndNotebooksPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement macBookAddToCard;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement item;
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement xButten;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block'])")
	private WebElement macBookAddToCart;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookCompare;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement MacBookAirCompare;

	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement productComparison;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;

	@FindBy(xpath = "/html/body/div[2]/div/div/table")
	private WebElement comparisonChart;
	
	
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartSonyVaIO;

	

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement yourWishList;

	@FindBy(xpath = "(//a[@class='list-group-item'])[2]")
	private WebElement macs;
	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/a[4]")
	private WebElement windows;
	@FindBy(xpath = "(//a[text()='Macs (0)'])[2]")
	private WebElement macs0;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li[2]/a")
	private WebElement windows0;
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hplp3065;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement addToCardHplp;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	@FindBy(xpath = "//a[contains(text(),'Air')]")
	private WebElement macBookAir;
	@FindBy(xpath = "(//ul[@class='list-unstyled'])[10]")
	private WebElement macBookProAmount;

	public void clickOnLaptopsAndNotebooks() {
		laptopsAndNotebooks.click();
	}

	public void clickOnShowAllLaptopsAndNotebooks() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void clickOnMacBookAddToCard() {
		macBookAddToCard.click();
	}

	public boolean successMessageMavBook() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean itemCard() {
		if (item.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnitem() {
		item.click();
	}

	public void clickOnXButten() {
		xButten.click();
	}

	public void clickOnMacBookCompare() {
		macBookCompare.click();
	}

	public void clickOnMacBookAirCompare() {
		MacBookAirCompare.click();
	}

	public boolean messageProductComparison() {
		if (productComparison.isDisplayed())
			return true;
		else

			return false;
	}

	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	public boolean seeComparisonChart() {
		if (comparisonChart.isDisplayed())
			return true;
		else

			return false;
	}

	public void clickOnheartSonyVaIO() {
		heartSonyVaIO.click();
	}

	public boolean messageYourWishList() {
		if (yourWishList.isDisplayed())
			return true;
		else

			return false;
	}

	public boolean seeMacBookProAmount() {
		if (macBookProAmount.isDisplayed())
			return true;
		else

			return false;
	}

	public void clickMacBookAddToCart() {
		macBookAddToCart.click();
	}

	public void clickOnMacs() {
		macs.click();
	}

	public void clickOnWindows() {
		windows.click();
	}

	public void clickOnMacs0() {
		macs0.click();
	}

	public void clickOnWindows0() {
		windows0.click();
	}

	public void clickOnHplp3065() {
		hplp3065.click();
	}

	public void clickOnAddToCardHplp() {
		addToCardHplp.click();
	}

	public void clickOnMacBookPro() {
		macBookPro.click();
	}

	public void clickOnMacBokAir() {
		macBookAir.click();
	}

}