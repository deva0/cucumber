package com.amerimark.test.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath ="//input[@id='search_terms']")
	private WebElement searchBox;
	
	@FindBy(id="search_button")
	private WebElement searchButton;
	
	public static HomePage HomePageInstance;
	private HomePage() {
	}
	public static HomePage getInstance()
	{
		if(HomePageInstance==null)
		{
			HomePageInstance = new HomePage();
		}
		return HomePageInstance;
	}
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
}
