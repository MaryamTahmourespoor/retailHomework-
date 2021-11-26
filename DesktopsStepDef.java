package stepDefinitions;


import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class DesktopsStepDef extends Base{

	DesktopsPageObject desktopPage = new DesktopsPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle ="TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Titel is matching with expected title");
	}
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.clickOnDesktopBar();
		logger.info("user click on Desktops tab");
		UtilityClass.takeScreenShot(); 
	}
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("user lick on Show all desktops");
		UtilityClass.takeScreenShot();  
		
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	   
		
	}
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.clickonHpLp3065AddToCart();
		logger.info("User click  ADD TO CART option on ‘HP LP3065’ item");
		UtilityClass.takeScreenShot(); 
	}
	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopPage.clickOnHpLp3065Qty();
		logger.info("User select quantity {int}");
		UtilityClass.takeScreenShot();
	
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickonAddToCartButton();
		logger.info("User click add to Cart button");
		UtilityClass.takeScreenShot();
	 
	}
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		desktopPage.seeMessageSuccess2();
		Assert.assertTrue(desktopPage.seeMessageSuccess2());
		logger.info("User should see a message");
		UtilityClass.takeScreenShot();
	
	
	}
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	  desktopPage.clickOnCanonAddToCart();
	
	  
	}
	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	desktopPage.clickSelectColor();
	
	 
	}
	@And("User select quantity1 {int}")
	public void user_select_quantity1(Integer int1) {
	desktopPage.clickOnQtyCanon();
		
	}
	@And("User click add to cart button")
	public void user_click_add_to_cart_button1() {
	desktopPage.clickonAddToCartButton2();
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	   desktopPage.successMessageCanon();
	
	}
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    
		desktopPage.clickOnCanonEOS5D();
		// Write code here that turns the phrase above into concrete actions
	  
	}
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnWriteAReview();
	
	}
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	  
			List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
			desktopPage.clickOnReviewYourName(info.get(0).get("yourname"));
			desktopPage.clickOnyourReview(info.get(0).get("yourReview"));
			desktopPage.clickOnRatingGood();
		
			
			logger.info("user entered personal information " + info.toString());
			UtilityClass.takeScreenShot();

		}
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickOnCountinueButton();

	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		desktopPage.writeAReviewMessag();
		
		
		
	
	   
	}
	
}