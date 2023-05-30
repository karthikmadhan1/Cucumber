package org.google.pages;

import org.google.utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel1 extends BaseClass  {
	WebDriver driver ;
	 public SearchHotel1(WebDriver driver) {	
		 PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css = "#location")
	private WebElement location ;
	@FindBy(css = "#hotels")
	private WebElement hotels ;
	@FindBy(css = "#room_type")
	private WebElement roomtype ;
	@FindBy(css = "#room_nos")
	private WebElement noofrooms ;
	@FindBy(css = "#datepick_in")
	private WebElement checkin ;
	@FindBy(css = "#datepick_out")
	private WebElement checkout ;
	@FindBy(css = "#adult_room")
	private WebElement adults ;
	@FindBy(css = "#Submit")
	private WebElement search;
	@FindBy(css = "#radiobutton_0")
	private WebElement selectHotel;
	@FindBy(css = "#continue")
	private WebElement continueButton;
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebDriver getDriver() {
		return driver;
	}

	
}



