package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle' and text()='Desktops']")
	private WebElement desktopsBar;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement searchBar;
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	private WebElement searchButton;
	@FindBy(xpath = "//a[contains(text(),'- PC (0)')]")
	private WebElement pc;
	@FindBy(xpath = "//a[contains(text(),'- Mac (1)')]")
	private WebElement mac;
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement buttonList;
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement buttonGrid;
	@FindBy(xpath = "//label[contains(text(),'Sort By:')]")
	private WebElement sortBy;
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement showButton;
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30')]")
	private WebElement appleCinema30;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement addToCartHtc;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList;
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement cmpareThisProduct;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5D;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[11]")
	private WebElement addToCartIphone;
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLp3065;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[9]")
	private WebElement hpLp3065AddToCart;
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selecteColor;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement qtyCanon;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement canonEos5DAddToCart;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageSuccess2;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReview;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement reviewYouName;
	@FindBy(xpath = "(//textarea[@class='form-control'])[1]")
	private WebElement yourReview;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement htcTouchHd;
	@FindBy(xpath = "(//img[@class='img-responsive'])[6]")
	private WebElement pictureIphone;
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUsInformation;
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformation;
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsAndConditions;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returns;
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMap;
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brands;
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificates;
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliate;
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specials;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistory;
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishList;
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement newsletter;
	@FindBy(linkText = "Product Compare (0)")
	private WebElement productCompare;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement qty;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCart;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCartCanon;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement continueButton;
	@FindBy(xpath = "(//input[@name='rating'])[5]")
	private WebElement ratingGood;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement hpLp3065Qty;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewMessage;

	public void clickOnDesktopBar() {
		desktopsBar.click();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public void clickOnSearchBar() {
		searchBar.sendKeys();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickonPc() {
		pc.click();
	}

	public void clickOnMac() {
		mac.click();
	}

	public void clickOnButtonList() {
		buttonList.click();
	}

	public void clickOnButtonGrid() {
		buttonGrid.click();
	}

	public void clickOnSortBy() {
		sortBy.click();
	}

	public void clickOnShow() {
		showButton.click();
	}

	public void clickOnAppleCinema30() {
		appleCinema30.click();
	}

	public void cilckOnAddToCartHtc() {
		addToCartHtc.click();
	}

	public void clickAddToWishList() {
		addToWishList.click();
	}

	public void clickOnCmpareThisProduct() {
		cmpareThisProduct.click();
	}

	public void clickOnCanonEOS5D() {
		canonEOS5D.click();
	}

	public void clickOnAddToCartIphon() {
		addToCartIphone.click();
	}

	public void clickOnHpLp3065() {
		hpLp3065.click();
	}

	public void clickOnHtcTouchHd() {
		htcTouchHd.click();
	}

	public void clickOnPictureIphone() {
		pictureIphone.click();
	}

	public void clickOnAboutUsInformation() {
		aboutUsInformation.click();
	}

	public void clickonDeliveryInformation() {
		deliveryInformation.click();
	}

	public void clickonTermsAndConditions() {
		termsAndConditions.click();
	}

	public void clickonContactUs() {
		contactUs.click();
	}

	public void clickonReturns() {
		returns.click();
	}

	public void clickonSiteMap() {
		siteMap.click();
	}

	public void clickonBrands() {
		brands.click();
	}

	public void clickonGiftCertificates() {
		giftCertificates.click();
	}

	public void clickonAffiliate() {
		affiliate.click();
	}

	public void clickonSpecials() {
		specials.click();
	}

	public void clickonMyAccount() {
		myAccount.click();
	}

	public void clickonOrderHistory() {
		orderHistory.click();
	}

	public void clickonwishList() {
		wishList.click();
	}

	public void clickonNewsletter() {
		newsletter.click();
	}

	public void clickonProductCompare() {
		productCompare.click();
	}

	public void clickonHpLp3065AddToCart() {
		hpLp3065AddToCart.click();
	}

	public void clickonAddToCartButton() {
		addToCart.click();

	}

	public void clickonAddToCartButton2() {
		addToCartCanon.click();
	}

	public void clickSelectColor() {
		selecteColor.click();

		Select select = new Select(selecteColor);
		select.selectByVisibleText("Red");

	}

	public boolean successMessageCanon() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnQtyCanon() {
		qtyCanon.sendKeys("1");

	}

	public void clickOnCanonAddToCart() {
		canonEos5DAddToCart.click();
	}

	public void clickOnWriteAReview() {
		writeAReview.click();
	}

	public void clickOnReviewYourName(String rName) {
		reviewYouName.sendKeys("rName");
		}

	public boolean clickOnyourReview(String yReview) {
		yourReview.sendKeys(yReview);
	
		if( yReview.length()>26) 
			 
		return true;
	else
		return false;
	}

	public void clickOnRatingGood() {
		ratingGood.click();
		}

	public void clickOnCountinueButton() {
		continueButton.click();
	}

	public boolean writeAReviewMessag() {
		if (reviewMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnHpLp3065Qty() {
		hpLp3065Qty.click();
	}

	public boolean seeMessageSuccess2() {
		if (messageSuccess2.isDisplayed())
			return true;
		else
			return false;
	}
}