package com.amerimark.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlipperDetailsPage {

	@FindBy(id="color_label_55")
	private WebElement color;
	
	@FindBy(xpath ="//span[text()='Wide Width']")
	private WebElement shoeWidth;
	
	@FindBy(xpath="//span[text()='7 Wide']")
	private WebElement size;
	
	@FindBy(id="quantity")
	private WebElement qty;
/* select class */
	
	@FindBy(id="item_add")
	private WebElement addToBagBtn;
	
	@FindBy(id="reviewDetailedTitle")
	private WebElement scrollDown;
	
	public WebElement getScrollDown() {
		return scrollDown;
	}

	public static SlipperDetailsPage SlipperDetailsPageInstance;
	private SlipperDetailsPage() {
	}
	public static SlipperDetailsPage getInstance()
	{
		if(SlipperDetailsPageInstance==null)
		{
			SlipperDetailsPageInstance = new SlipperDetailsPage();
		}
		return SlipperDetailsPageInstance;
	}
	
	public WebElement getColor() {
		return color;
	}

	public WebElement getShoeWidth() {
		return shoeWidth;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAddToBagBtn() {
		return addToBagBtn;
	}

	public WebElement getCheckoutPopup() {
		return checkoutPopup;
	}

	@FindBy(xpath="//button[@class='btn btn-primary submit_btn']")
	private WebElement checkoutPopup;
}
