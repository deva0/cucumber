package com.amerimark.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Verify_Slipper_Checkout.feature", 
glue="com.amerimark.test.stepdefinition", 
dryRun = false,
monochrome= true,
plugin ="html:report/webReport")
public class Runner {

}
