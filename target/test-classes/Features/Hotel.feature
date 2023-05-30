@smoke
Feature: Validate the Hotel Room Booking Functions

Background:
	Given Launch the browser
  And Open application
	

Scenario Outline:

 	When Enter the  "<username>" and valid "<password>" 
	And Enter the "<location>" and hotel "<hotel>" and room "<roomtype>"
	And Enter the first "<firstname>" and lastname "<lastname>" and "<address>" 
	And Enter the cardno "<cardnum>" and cardtype "<cardtype>" and month "<exp_month>" and year "<exp_year>" and cvv "<cvv>"
  Then I validate the outcomes
   
 	Examples:
 	
 	|username|password|location|hotel|roomtype|firstname|lastname|address|cardnum|cardtype|exp_month|exp_year|cvv|
 	|karthikmadhan|karthikeyan007|London|Hotel Sunshine|Standard|ganapathy|Sekar|Los Angels|8965756321563254|AMEX|5|2025|152|
