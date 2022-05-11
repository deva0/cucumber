package com.amerimark.test.stepdefinition;


import java.time.Duration;

import com.amerimark.test.driver.Driver;
import com.amerimark.test.utilities.CommonUtilities;

import io.cucumber.java.Before;

public class CommonStepDef {
	

	@Before
	public void beforeScenario() {
		CommonUtilities.getInstance().getProperties();
		
		/* browserLaunch(); */
		Driver.getInstance().browserLaunch();
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		CommonUtilities.getInstance().initElmnts();
	}
	
}
