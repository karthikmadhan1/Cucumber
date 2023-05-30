package org.google.stepDef;

import org.google.pages.LoginPage;
import org.google.pages.PaymentPage1;
import org.google.pages.SearchHotel1;
import org.google.utils.BaseClass;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBooking extends BaseClass {
	static WebDriver driver;
	LoginPage lp;
	PaymentPage1 pp;
	SearchHotel1 sh;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	   driver= launchBrowser("chrome");
	   lp=new LoginPage(driver);
	   pp=new PaymentPage1(driver);
	   sh=new SearchHotel1(driver);  
	}

	@Given("Open application")
	public void open_application() {
	   openApp("https://adactinhotelapp.com/");
	}

	@When("Enter the  {string} and valid {string}")
	public void enter_the_and_valid(String username, String password) {
		sendValue(lp.getUsername(),username );
		sendValue(lp.getPassword(),password);
		tap(lp.getLogin());
	}

	@When("Enter the {string} and hotel {string} and room {string}")
	public void enter_the_and_hotel_and_room(String location, String hotel, String room) {
		sendValue(sh.getLocation(), location);
		sendValue(sh.getHotels(), hotel);
		sendValue(sh.getRoomtype(), room);
	    tap(sh.getSearch());
	    tap(sh.getSelectHotel());
	    tap(sh.getContinueButton());
	   
	}
	
	@When("Enter the first {string} and lastname {string} and {string}")
	public void enter_the_first_and_lastname_and(String first, String last, String address) {
	  sendValue(pp.getFirstName(), first);
	  sendValue(pp.getLastName(), last);
	  sendValue(pp.getAddress(), address);
	}

	@When("Enter the cardno {string} and cardtype {string} and month {string} and year {string} and cvv {string}")
	public void enter_the_cardno_and_cardtype_and_month_and_year_and_cvv(String cardno, String cardtype, String month, String year, String cvv) {
	 sendValue(pp.getCardNo(),cardno);
	 select(pp.getCardType(), cardtype);
	 select(pp.getExpiryDate(), month);
	 select(pp.getExpiryMonth(), year);
	 sendValue(pp.getCvv(), cvv);
	 tap(pp.getBookButton());
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		javascript(pp.getJavasc());
		screenshot("orderId");
		orderId(pp.getOrderNo());
		closeWindow();
		System.out.println("Validate the Output");
	
		
		
	}

}
