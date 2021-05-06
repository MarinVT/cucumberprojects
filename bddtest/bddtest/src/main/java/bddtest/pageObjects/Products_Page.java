package bddtest.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends BasePage {

	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;
	public @FindBy(css = "container-product2") WebElement button_Laptops;
	public @FindBy(xpath = ".//*[@id='myModal']//b[contains(text(), 'NEWCUSTOMER')]") WebElement voucherNumber;
	public @FindBy(xpath = "//button[text()='Proceed']") WebElement button_Proceed_Popup;

	
	public Products_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Products_Page clickOnProceedBtn_Popup() throws InterruptedException, IOException {
		waitAndClickElement(button_Proceed_Popup);
		return new Products_Page();
	}
	
	public String printOfferVaucherCode() {
		WaitUntilWebElementIsVisible(voucherNumber);
		
		String voucherCode = voucherNumber.getText();
		System.out.println("Voucher code is: " + voucherCode);
		return voucherCode;
	}
}
