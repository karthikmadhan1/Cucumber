package org.google.pages;

import org.google.utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BaseClass{
	WebDriver driver ;
	
	 public LoginPage(WebDriver driver) {
		
		 PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement username ;
	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement password;
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;  
	}
	public WebElement getLogin() {
		return login; 
	}

}