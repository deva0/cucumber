package com.amerimark.test.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amerimark.test.constants.Constants;
import com.amerimark.test.driver.Driver;
import com.amerimark.test.pageobjects.HomePage;
import com.amerimark.test.pageobjects.SlipperCheckoutPage;
import com.amerimark.test.pageobjects.SlipperDetailsPage;
import com.amerimark.test.pageobjects.SlipperPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SlipperCheckoutStepDef {


@Given("user is entering www.amerimark.com")
public void user_is_entering_www_amerimark_com() {
    // Write code here that turns the phrase above into concrete actions
	Driver.getDriver().get(Constants.App_url);

}

@When("user is typing slipper in the search box and clicks the search button")
public void user_is_typing_slipper_in_the_search_box_and_clicks_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
HomePage.getInstance().getSearchBox().sendKeys("slipper");
HomePage.getInstance().getSearchButton().click();
}

@Then("user should see all the slippers in the slipper page")
public void user_should_see_all_the_slippers_in_the_slipper_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("All slippers are visible");

}

@When("the user clicks the first slipper shown in the page")
public void the_user_clicks_the_first_slipper_shown_in_the_page() {
    // Write code here that turns the phrase above into concrete actions
	SlipperPage.getInstance().getFirstSlipper().click();
   
}

@Then("the user should see the slipper details")
public void the_user_should_see_the_slipper_details() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Slipper details is shown");
    
}

@Then("user should select the color,shoe width, size and quantity")
public void user_should_select_the_color_shoe_width_size_and_quantity() {
    // Write code here that turns the phrase above into concrete actions
	WebElement scrlDwn = SlipperDetailsPage.getInstance().getScrollDown();
	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	js.executeScript("arguments[0].scrollIntoView(true)", scrlDwn);
	SlipperDetailsPage.getInstance().getColor().click();
	SlipperDetailsPage.getInstance().getShoeWidth().click();
	SlipperDetailsPage.getInstance().getSize().click();
	WebElement Quant = SlipperDetailsPage.getInstance().getQty();
	Select select = new Select(Quant);
	select.selectByIndex(2);
}

@Then("the user should click the Add to Bag button")
public void the_user_should_click_the_add_to_bag_button() {
    // Write code here that turns the phrase above into concrete actions
	SlipperDetailsPage.getInstance().getAddToBagBtn().click();

  
}

@Then("user should see the pop up and clicks the checkout button")
public void user_should_see_the_pop_up_and_clicks_the_checkout_button() {
    // Write code here that turns the phrase above into concrete actions
	SlipperDetailsPage.getInstance().getCheckoutPopup().click();
 
}

@Then("use should see the checkout page")
public void use_should_see_the_checkout_page() {
    // Write code here that turns the phrase above into concrete actions
	WebElement coupon = SlipperCheckoutPage.getInstance().getCouponCode();
	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	js.executeScript("arguments[0].scrollIntoView(true)", coupon);
	String verifyText = coupon.getText();
	System.out.println(verifyText);
	
	
	
	  if(verifyText.equals("Enter Coupon Code")) 
	  { System.out.println("ALL DONE");
	  } else { System.out.println("Failed"); }
	 
}

	
}
