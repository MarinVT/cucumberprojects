Feature: Product page promo code validation

Scenario Outline: Validate promo code alert is visible when clicking on the offers link
		Given User navigates to "<url>" website
		When User click on "<button>" 
		Then User is informed with promo alert 
		 
		Examples: 
		| 						url 																						 		   | 						button	 				|
		| http://www.webdriveruniversity.com/Page-Object-Model/products.html |      //*[@id="laptop1"]		|
		