package com.facebook.stepsDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("user open facekook url")
	public void user_open_facekook_url() {
		System.out.println("Hello Cucumber");
	   }

	@When("user enter username")
	public void user_enter_username() {
	   }

	@When("user enter password")
	public void user_enter_password() {
	    }

	@Then("user logged in")
	public void user_logged_in() {
	   }
}
