package com.stepdefinition;

import com.base.Base_Task;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaastepDefinition extends Base_Task{

	PageObjectManager pom = new PageObjectManager();
	
	@Given("User launch the Web browser and Url")
	public void user_launch_the_web_browser_and_url() {
		browserLaunch("chrome");
		LaunchUrl("https://www.nykaa.com/");
	}
	@Then("User should be on the Nykaa home page")
	public void user_should_be_on_the_nykaa_home_page() {
	    System.out.println("User should be on the Nykaa home page");
	}
	
	@When("User move to an cursor on Skin and click a facewash")
	public void user_move_to_an_cursor_on_skin_and_click_a_facewash() {
		Actions(pom.getOrder().getSkin(), "movetoelement");
		clickonElement(pom.getOrder().getSelcetFaceWash());
	}
	@When("Page is navigate to new tab")
	public void page_is_navigate_to_new_tab() {
	    getWindowHandles();
	}
	@When("User click a Cetaphil Gentle Skin Cleanser")
	public void user_click_a_cetaphil_gentle_skin_cleanser() {
		clickonElement(pom.getOrder().getFaceWash());
	    getWindowHandles();
	    DropDownVisibleText(pom.getOrder().getDropdown(), "500ml");
	}
	
	@Then("User should see the Cetaphil Gentle Skin Cleanser product")
	public void user_should_see_the_cetaphil_gentle_skin_cleanser_product() {
	   System.out.println("User should see the Cetaphil Gentle Skin Cleanser product");
	}
	
	@Given("User click a Add to card button")
	public void user_click_a_add_to_card_button() {
		clickonElement(pom.getOrder().getAddtoBag());
	}
	@When("User click a bag button")
	public void user_click_a_bag_button() {
		clickonElement(pom.getOrder().getBag());
		frame(0);
	}
	@When("User click a proceed button")
	public void user_click_a_proceed_button() {
		clickonElement(pom.getOrder().getProceed());
	}
	@Then("Place your oder page should be opend")
	public void place_your_oder_page_should_be_opend() {
	    System.out.println("Place your oder page should be opend");
	}
	@Given("User can able to click a Continue as guest button")
	public void user_can_able_to_click_a_continue_as_guest_button() {
		clickonElement(pom.getOrder().getGuest());
	}
	@Given("User enters their Pincode in given filed")
	public void user_enters_their_pincode_in_given_filed() throws InterruptedException {
		sendKeys(pom.getProceed().getPincode(), "602001");
		Thread.sleep(3000);
	}
	@When("User enters their house no in given filed")
	public void user_enters_their_house_no_in_given_filed() throws InterruptedException {
		clickonElement(pom.getProceed().getHouse());
		Thread.sleep(5000);
	}
	@When("User enters their Road\\/Area name in given filed")
	public void user_enters_their_road_area_name_in_given_filed() {
		sendKeys(pom.getProceed().getHouse(), "21b");
		sendKeys(pom.getProceed().getArea(), "vk nager");
	}
	@When("User enters their  name in given filed")
	public void user_enters_their_name_in_given_filed() {
		sendKeys(pom.getProceed().getName(), "Deepika");
	}
	@When("User enters their Phone no in given filed")
	public void user_enters_their_phone_no_in_given_filed() {
		sendKeys(pom.getProceed().getPhoneno(), "9924562894");
	}
	@When("User enters their Email id in given filed")
	public void user_enters_their_email_id_in_given_filed() {
		sendKeys(pom.getProceed().getEmail(), "deepika123@gmail.com");
	}
	@When("User click on Ship to the Address button")
	public void user_click_on_ship_to_the_address_button() {
		clickonElement(pom.getProceed().getShiptotheaddress());
	}
	@Then("The Payment page should be opend")
	public void the_payment_page_should_be_opend() {
		System.out.println("The Payment page should be opend");
	}

	@Given("User click on Cash on Delivery")
	public void user_click_on_cash_on_delivery() {
		clickonElement(pom.getProceed().getDeliver());
	}
	
	@Then("Order should be placed with cash on delivery")
	public void order_should_be_placed_with_cash_on_delivery() {
	    System.out.println("order placed");
	}




}
