package stepDefinition;

import org.junit.runner.RunWith;

import Keywords.Keyword;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class productSearch {

	@Given("^Chrome browser is opened$")	
	public void open_ChromeBrowser() {
		Keyword.openBrowser("chorme");
		System.out.println("Opening chrome browser");
	}
	@When("^User enters invalid uname and password$")
	public void enter_Username_Password() {
		
		System.out.println("uname and password is entered");
	}
	@Then("^user will get an error message$")
	public void show_Error_Message1() {
	
		System.out.println("user enetered wrong password");
	

	}
	@Given("^I want to buy laptop$")
	public void I_want_Laptop(String phonetype) {
	System.out.println("I want to buy an"+phonetype);
	}

    @And("it should be black")
	public void colorReq() {
	System.out.println("Black color");
	}

	@When("I go to https://eagercrow.com/Home")
	public void loadSite(){
	System.out.println("Go to eagercrow");
	}

	@And("I search for Laptop")
	public void search() {
		Keyword.enterText("XPATH", "//a[@class='color0-hov']", "laptop");
	System.out.println("laptop search");
	}
	@Then("All search results should have IphoneX")
	public void searchRes()
	{
	System.out.println("All search results should have IphoneX");
	}
	@When("^I select first search result$")
	public void firstsearchRes()
	{
	System.out.println(" I select first search result");
	}
	@Then("Next Page should open with the result")
	public void nextPageValidation()
	{
	System.out.println("Next Page should open with the result");
	}

	}

	 
	/*
	@Given("^Chrome browser is opened$")	
	public void open_ChromeBrowser1() {
		Keyword.openBrowser("chorme");
		System.out.println("Opening chrome browser");
	}
	@When("^User enters valid uname and password$")
	public  void again() {
		
		System.out.println("uname and password is entered");
	}
	@Then("^user  will directed  to dashboard $")
	public void show_Error_Message() {
	
		System.out.println("user enetered wrong password");
	

	}
}*/

