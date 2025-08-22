@NdosiAutomationLogin @MobileAutomationTesting
Feature: Ndosi Automation Login
  In order to access learning materials
  As a user of the Ndosi website
  I want to be able to log in using my credentials

  @AthenkosiTest
  Scenario Outline: Login to Ndosi website using Android Device
    Given The android device open with chrome browser
    When I open the Ndosi website
    And I should see the heading Learn Automation the Right Way displayed
    And I click on the OpenMenu
    And I click learning material tab
    And I should see the heading Login to Access Learning Materials displayed
    And I login using admin username "<admin_username>"
    And I put admin login password "<admin_password>"
    And I click on the login button
    Then I should see the heading Practice Assessments displayed

    Examples:
      | admin_username | admin_password |
      | admin          | ndosi          |


  @Regression
  Scenario: Login to Ndosi website using mysql data
    Given The android device open with chrome browser
    When I open the Ndosi website
    And I should see the heading Learn Automation the Right Way displayed
    And I click on the OpenMenu
    And I click learning material tab
    And I should see the heading Login to Access Learning Materials displayed
    And I login using user with id 26
    And I click on the login button
    Then I should see the heading Practice Assessments displayed

