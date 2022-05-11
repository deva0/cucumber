package com.amerimark.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SlipperPage {
@FindBy(xpath = "//div[@class='productGrid']")
private WebElement firstSlipper;

public static SlipperPage SlipperPageInstance;
private SlipperPage() {
}
public static SlipperPage getInstance()
{
	if(SlipperPageInstance==null)
	{
		SlipperPageInstance = new SlipperPage();
	}
	return SlipperPageInstance;
}

public WebElement getFirstSlipper() {
	return firstSlipper;
}
}
