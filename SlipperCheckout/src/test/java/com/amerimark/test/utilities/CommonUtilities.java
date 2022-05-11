package com.amerimark.test.utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.amerimark.test.constants.Constants;
import com.amerimark.test.driver.Driver;
import com.amerimark.test.pageobjects.HomePage;
import com.amerimark.test.pageobjects.SlipperCheckoutPage;
import com.amerimark.test.pageobjects.SlipperDetailsPage;
import com.amerimark.test.pageobjects.SlipperPage;

public class CommonUtilities {
	public static CommonUtilities propertyInstance;
	private CommonUtilities() {
	}
	public static CommonUtilities getInstance()
	{
		if(propertyInstance==null)
		{
			propertyInstance = new CommonUtilities();
		}
		return propertyInstance;
	}
public void getProperties() {
Properties properties = new Properties();
try {
	properties.load(getClass().getResourceAsStream("/config.properties"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Constants.Browser = properties.getProperty("browser");
Constants.App_url = properties.getProperty("App_url");
Constants.dLoc = properties.getProperty("dlocation");


}
public void initElmnts()
{
	PageFactory.initElements(Driver.getDriver(), HomePage.getInstance());
	PageFactory.initElements(Driver.getDriver(), SlipperPage.getInstance());
	PageFactory.initElements(Driver.getDriver(), SlipperDetailsPage.getInstance());
	PageFactory.initElements(Driver.getDriver(), SlipperCheckoutPage.getInstance());
}
}
