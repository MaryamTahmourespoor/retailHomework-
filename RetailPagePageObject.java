package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;

public class RetailPagePageObject extends Base{

	public RetailPagePageObject() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliate;
	
	@FindBy(xpath ="(//input[@class='form-control'])[1]")
	private WebElement company;
	
	@FindBy(xpath ="(//input[@class='form-control'])[2]")
	private WebElement webSite;
	
	
	@FindBy(xpath ="(//input[@class='form-control'])[3]")
	private WebElement taxID;
	
	@FindBy(xpath ="(//input[contains(@name,'payment')][1])[1]")
	private WebElement paymentMethodCheque;


	@FindBy(xpath ="//input[contains(@name,'agree')]")
	private WebElement aboutUsBox;

	@FindBy(xpath ="//input[@class='btn btn-primary']")
	private WebElement continueButton;

	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement success;
	@FindBy(xpath ="(//input[@class='form-control'])[4]")
	private WebElement chequePayeeName;
	
	@FindBy(xpath ="//a[text()='Edit your affiliate information']")
	private WebElement editAffiliate;
	
	@FindBy(xpath ="(//input[contains(@name,'payment')][1])[3]")
	private WebElement bankTransfer;
	
	@FindBy(xpath ="(//input[@class='form-control'])[6]")
	private WebElement bankName ;
	
	@FindBy(xpath ="(//input[@class='form-control'])[7]")
	private WebElement branchNumber;
	
	@FindBy(xpath ="(//input[@class='form-control'])[8]")
	private WebElement sWIFTCode;
	
	@FindBy(xpath ="(//input[@class='form-control'])[9]")
	private WebElement accountName;
	
	@FindBy(xpath ="(//input[@class='form-control'])[10]")
	private WebElement accountNumber;
	
	@FindBy(xpath ="//a[text()='Edit Account']")
	private WebElement editAccount;
	
	@FindBy(xpath ="(//input[@class='form-control'])[1]")
	private WebElement firstName;
	
	@FindBy(xpath ="(//input[@class='form-control'])[2]")
	private WebElement lastName;
	
	@FindBy(xpath ="(//input[@class='form-control'])[3]")
	private WebElement eMail;
	
	@FindBy(xpath ="(//input[@class='form-control'])[4]")
	private WebElement telephone;
	
	@FindBy(xpath ="//input[@class='btn btn-primary']")
	private WebElement buttonContinueEdit;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successEdit ;
	
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmailAndPassword(String userName, String pass) {
		email.sendKeys("azadeh111@gmail.com");
		password.sendKeys("azad111");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void clickOnrRegisterAffiliate() {
		registerAffiliate.click();
	}
		
	
	public void clickOnCompany(String nCompany) {
		company.sendKeys(nCompany);
		}
	
	public void clickOnWebSite(String nWebSite) {
		webSite.sendKeys(nWebSite);
		}

	public void clickOnTaxID(String string) {
		taxID.sendKeys(string);
		}

	public void clickOnPaymentMethodCheque() {
		paymentMethodCheque.click();
	}


	public void clickOnAboutUsBox() {
		aboutUsBox.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}
	public boolean messageSuccess() {
		if(success.isDisplayed())
		return true;
		else
			return false;
	}
	
	public void clickOnchequePayeeName(String string) {
		chequePayeeName.sendKeys(string);
	}
	
	public void clickOnEditAffiliate() {
		editAffiliate.click();
	}
	
	public void clickOnBankTransfer() {
		bankTransfer.click();
	}
	
	public void clickOnBankName(String bankname) {
		bankName.sendKeys(bankname);
	}
	
	public void clickOnBranchNumber(String branchnumber) {
		branchNumber.sendKeys(branchnumber);
	}
	public void clickOnSWIFTCode(String SWIFTCode) {
		sWIFTCode.sendKeys(SWIFTCode);
	}
	public void clickOnAccountName(String AccountName) {
		accountName.sendKeys(AccountName);
	}
	public void clickOnAccountNumber(String AccountNumber) {
		accountNumber.sendKeys(AccountNumber);
	}
	public void clickOnEditAccount() {
		editAccount.click();
	}
	public void clickOnFirstName(String FirstName) {
		firstName.clear();
		firstName.sendKeys(FirstName);
	}
	public void clickOnLastName(String LastName) {
		lastName.clear();
		lastName.sendKeys(LastName);
	}
	public void clickOnEMail(String EMail) {
		eMail.clear();
		eMail.sendKeys(EMail);
	}
	public void clickOnTelephone(String Telephone) {
		telephone.clear();
		telephone.sendKeys(Telephone);
	}
	public void clickOnbuttonContinueEdit() {
		buttonContinueEdit.click();
	}
	public void clickOnSuccessEdit() {
		successEdit.click();
	}
	
}




	
	




