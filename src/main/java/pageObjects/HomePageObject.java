package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsandNotebooks;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesAndPDAs;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameras;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mP3Players;
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement imgMacBook;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCardMac;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[3]")
	private WebElement compareThisProduct;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5D;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[1]")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement messageShoppingCart;
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[4]")
	private WebElement wishList;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[5]")
	private WebElement shopingCart;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[6]")
	private WebElement checkout;

	public void clickOnTestEnvironment() {
		testEnvironment.click();
	}

	public void clickOnDesktopsBar() {
		desktops.click();
	}

	public void clickOnLaptopsandNotebooks() {
		laptopsandNotebooks.click();
	}

	public void clickOnComponents() {
		components.click();
	}

	public void clickOnTablets() {
		tablets.click();
	}

	public void clickOnSoftware() {
		software.click();
	}

	public void clickOnPhonesAndPDAs() {
		phonesAndPDAs.click();
	}

	public void clickOnCameras() {
		cameras.click();
	}

	public void clickOnMP3Players() {
		mP3Players.click();
	}

	public void clickOnImgMacBook() {
		imgMacBook.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void clickOnAddToCardMac() {
		addToCardMac.click();
	}

	public void clickOnAddToWishList() {
		addToWishList.click();
	}

	public void clickOnCompareThisProduct() {
		compareThisProduct.click();
	}

	public void clickOnIphone() {
		iPhone.click();
	}

	public void clickOnAppleCinema30() {
		appleCinema30.click();
	}

	public void clickOncanonEOS5D() {
		canonEOS5D.click();
	}

	public void clickOnCurrency() {
		currency.click();
	}
	public void clickOnEuro() {
		euro.click();
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	public void clickOnMessageShoppingCart() {
		messageShoppingCart.click();
	}
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnWishList() {
		wishList.click();
	}

	public void clickOnShopingCart() {
		shopingCart.click();
	}

	public void clickOnCheckout() {
		checkout.click();

	}
}
