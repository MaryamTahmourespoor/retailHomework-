package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.UtilityClass;


public class HomePageStepDef extends Base {
	HomePageObject homepage = new HomePageObject();

	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepage.clickOnCurrency();
		UtilityClass.takeScreenShot(); 
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepage.clickOnEuro();
		UtilityClass.takeScreenShot(); 
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		UtilityClass.takeScreenShot(); 
		UtilityClass.takeScreenShot(); 
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepage.clickOnShoppingCart();
		UtilityClass.takeScreenShot(); 
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		UtilityClass.takeScreenShot(); 
	}


}



