
@Reg
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
	|karthikmadhan|karthikeyan007|Los Angeles|Hotel Creek|Double|Selvaraj|Pandey|Melbourne|7895461238546982|VISA|7|2029|165|
	|karthikmadhan|karthikeyan007|Melbourne|Hotel Hervey|Deluxe|Palaniswamy|karuppa|Edappadi|9845697845235469|MAST|11|2030|224|
 
