package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPagePageObject;
import utilities.UtilityClass;


public class RetailPageStepDef extends Base{

	RetailPagePageObject retailpage = new RetailPagePageObject();
	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle ="TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Titel is matching with expected title");
		retailpage.clickOnMyAccount();
		
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailpage.clickOnLogin();
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_user_Name_and_Password(String string, String string2) {
		retailpage.enterEmailAndPassword(string, string2);
		logger.info("user Enter " + string + "and password " + string2);
		UtilityClass.takeScreenShot();
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
	   retailpage.clickOnLoginButton();
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	
	}
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	   retailpage.clickOnrRegisterAffiliate();
	  
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
			  
			List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
			 retailpage.clickOnCompany(info.get(0).get("company"));
			 retailpage.clickOnWebSite(info.get(0).get("website"));
			 retailpage.clickOnTaxID(info.get(0).get("taxID"));
        	 retailpage.clickOnPaymentMethodCheque();
        	 retailpage.clickOnchequePayeeName(info.get(0).get("paymentMethod"));
        	 logger.info("user entered personal information " + info.toString());
			UtilityClass.takeScreenShot();
		}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	  retailpage.clickOnAboutUsBox();
	  UtilityClass.takeScreenShot();
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	 retailpage.clickOnContinueButton();
	 UtilityClass.takeScreenShot();
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	  retailpage.messageSuccess();
	  UtilityClass.takeScreenShot();
	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	  retailpage.clickOnEditAffiliate();
	  UtilityClass.takeScreenShot();
	}	
	 @When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	  retailpage.clickOnBankTransfer();
	  UtilityClass.takeScreenShot();
	 }
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	
		List<Map<String,String>> info =dataTable.asMaps(String.class,String.class);
		retailpage.clickOnBankName(info.get(0).get("bankName"));
		retailpage.clickOnBranchNumber(info.get(0).get("abaNumber"));
		retailpage.clickOnSWIFTCode(info.get(0).get("swiftCode"));
		retailpage.clickOnAccountName(info.get(0).get("accountName"));
		retailpage.clickOnAccountNumber(info.get(0).get("accountNumber"));
		UtilityClass.takeScreenShot();
		}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailpage.clickOnEditAccount();
		UtilityClass.takeScreenShot();	}
	
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> info =dataTable.asMaps(String.class,String.class);
		retailpage.clickOnFirstName(info.get(0).get("firstname"));
		retailpage.clickOnLastName(info.get(0).get("lastName"));
		retailpage.clickOnEMail(info.get(0).get("email"));
		retailpage.clickOnTelephone(info.get(0).get("telephone"));
		UtilityClass.takeScreenShot();	
	}
	@When("User click on continue button")
	public void user_click_on_continue_button1() {
	  retailpage.clickOnbuttonContinueEdit();
	  UtilityClass.takeScreenShot();
	  
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		retailpage.clickOnSuccessEdit();
		UtilityClass.takeScreenShot();
	}

	



}



