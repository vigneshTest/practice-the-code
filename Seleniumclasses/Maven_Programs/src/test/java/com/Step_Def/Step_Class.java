package com.Step_Def;

import com.baseclass.Base_Class;
import com.pomclass.Details_Fillings;
import com.pomclass.Login_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Class extends Base_Class {

	Login_Page v = new Login_Page(driver);
	Details_Fillings i = new Details_Fillings(driver);

	@Given("^user should launch the application$")
	public void user_should_launch_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		openurl("https://adactinhotelapp.com/");
	}

	@When("^user enter the correct username$")
	public void user_enter_the_correct_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SendKeys(v.getUsername(), "vigneshparamasivam92");

	}

	@When("^user enter the correct password$")
	public void user_enter_the_correct_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SendKeys(v.getPassword(), "69EZ3Z");
	}

	@Then("^user click the login button move to next page$")
	public void user_click_the_login_button_move_to_next_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(v.getLogin());
	}

	@Given("^user fill the particular aspect$")
	public void user_fill_the_particular_aspect() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		implicitlywait();
		click(i.getSelectlocation());
		dropdown(driver, i.getSelectlocation(), 3);
	}

	@When("^user select hotels$")
	public void user_select_hotels() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(i.getSelecthotel());
		dropdown(driver, i.getSelecthotel(), 3);
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(i.getSelectroom());
		dropdown(driver, i.getSelectroom(), 2);

	}

	@When("^user enter in Date$")
	public void user_enter_in_Date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SendKeys(i.getCheckin(), "15/08/2022");
	}

	@When("^user enter the out date$")
	public void user_enter_the_out_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SendKeys(i.getCheckin(), "18/08/2022");
	}

	@When("^user select the adults per room$")
	public void user_select_the_adults_per_room() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(i.getAdult());
		dropdown(driver, i.getAdult(), 2);
	}

	@When("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(i.getChild());
		dropdown(driver, i.getChild(), 2);
	}

	@Then("^user click search button$")
	public void user_click_search_button1() throws Throwable {
		click(i.getSearch());
	}

	@Given("^user select particular hotel$")
	public void user_select_particular_hotel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user select the hotel in given list$")
	public void user_select_the_hotel_in_given_list() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user click search button$")
	public void user_click_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^user pay hotel amount in payer$")
	public void user_pay_hotel_amount_in_payer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the (\\d+) digit credit card number$")
	public void user_enter_the_digit_credit_card_number(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the credit card type$")
	public void user_enter_the_credit_card_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the expire month in card$")
	public void user_enter_the_expire_month_in_card() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the expire year in card$")
	public void user_enter_the_expire_year_in_card() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the CVV number$")
	public void user_enter_the_CVV_number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user click the book now button$")
	public void user_click_the_book_now_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user got order no$")
	public void user_got_order_no() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user click my itinerary button$")
	public void user_click_my_itinerary_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^user verify booking details$")
	public void user_verify_booking_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
