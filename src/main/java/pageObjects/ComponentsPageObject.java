package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {

	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement showAllcomponents;
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[1]/a[1]/i[1]")
	private WebElement homeIcone;
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement desctop;
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement laptopsAndNotebooks;
	@FindBy(xpath = "//a[contains(text(),'- Mice and Trackballs (0)')]")
	private WebElement miceMndTrackball;
	@FindBy(xpath = "//a[contains(text(),'- Monitors (2)')]")
	private WebElement monitors;
	@FindBy(xpath = "//a[contains(text(),'- Printers (0)')]")
	private WebElement printers;
	@FindBy(xpath = "//a[contains(text(),'- Scanners (0)')]")
	private WebElement scanners;
	@FindBy(xpath = "//a[contains(text(),'- Web Cameras (0)')]")
	private WebElement WebCameras;
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets;
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement software;
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phonesAndPDAs;
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mP3Players;
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement picture;
	@FindBy(xpath = "(//a[text()='Mice and Trackballs (0)'])[2]")
	private WebElement refineMicAndTrackballs;
	@FindBy(xpath = "(//a[text()='Monitors (2)'])[2]")
	private WebElement refineMonitors;
	@FindBy(xpath = "(//a[text()='Printers (0)'])[2]")
	private WebElement refinePrinters;
	@FindBy(xpath = "(//a[text()='Scanners (0)'])[2]")
	private WebElement refineScanners;
	@FindBy(xpath = "(//a[text()='Web Cameras (0)'])[2]")
	private WebElement refineWebCameras;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement shopingCard;

	
	public void clickOnshowAllcomponents() {
		showAllcomponents.click();
	}

	public void clickOnHomeIcone() {
		homeIcone.click();
	}

	public void clickOnDesctop13() {
		desctop.click();
	}

	public void clickOnLaptopsAndNotebooks() {
		laptopsAndNotebooks.click();
	}

	public void clickOnMiceandTrackball() {
		miceMndTrackball.click();
	}

	public void clickOnMonitors() {
		monitors.click();
	}

	public void clickOnPrinters() {
		printers.click();
	}

	public void clickOnScanners() {
		scanners.click();
	}

	public void clickOnWebCameras() {
		WebCameras.click();
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

	public void clickOnPicture() {
		picture.click();
	}

	public void clickOnMicAandTrackball() {
		refineMicAndTrackballs.click();
	}

	public void clickOnMonitors2() {
		refineMonitors.click();
	}

	public void clickOnPrinter() {
		refinePrinters.click();
	}

	public void clickOnScanner() {
		refineScanners.click();
	}

	public void clickOnWebCamera() {
		refineWebCameras.click();
	}

	public void clickOnShopingCard() {
		shopingCard.click();
	}
}
