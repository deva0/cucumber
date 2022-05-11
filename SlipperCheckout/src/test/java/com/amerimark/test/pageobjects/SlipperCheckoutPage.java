package com.amerimark.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlipperCheckoutPage {

	@FindBy(xpath="//div[text()='Enter Coupon Code ']")
	private WebElement couponCode;
	
	public static SlipperCheckoutPage checkoutInstance;
	private SlipperCheckoutPage() {
	}
	public static SlipperCheckoutPage getInstance()
	{
		if(checkoutInstance==null) {
			checkoutInstance = new SlipperCheckoutPage();
		}
		return checkoutInstance;
	}
	public WebElement getCouponCode() {
		return couponCode;
	}
}
