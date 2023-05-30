package org.google.pages;

import org.google.utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage1  extends BaseClass{
	WebDriver driver;
	public PaymentPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "#first_name")
	private WebElement firstName;
	@FindBy(css = "#last_name")							
	private WebElement lastName;
	@FindBy(css = ".txtarea")	
	private WebElement address;
	@FindBy(css = "#cc_num")
	private WebElement cardNo;
	@FindBy(css = "#cc_type")
	private WebElement cardType;
	@FindBy(css = "#cc_exp_month")
	private WebElement expiryDate;
	@FindBy(css = "#cc_exp_year")
	private WebElement expiryMonth;
	@FindBy(css = "#cc_cvv")
	private WebElement cvv;
	@FindBy(css = "#book_now")
	private WebElement bookButton;
	@FindBy(css="#order_no")
	private WebElement orderNo;
	@FindBy(css = "#search_hotel")
	private WebElement javasc;
	
	public WebElement getJavasc() {
		return javasc;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookButton() {
		return bookButton;
	}
	
	
 		}



