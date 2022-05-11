#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: This is to test the slipper checkout page visibility

  Scenario: Verify the slipper checkout scenario 
    Given user is entering www.amerimark.com
    When user is typing slipper in the search box and clicks the search button
    Then user should see all the slippers in the slipper page
    When the user clicks the first slipper shown in the page
    Then the user should see the slipper details 
    And user should select the color,shoe width, size and quantity
    And the user should click the Add to Bag button
    Then user should see the pop up and clicks the checkout button
    Then use should see the checkout page
    

 
