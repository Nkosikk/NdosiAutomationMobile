@NkosiTest
Feature: Ndosi website

  Scenario Outline: Login to Ndosi website
    Given I an android device open with chrome browser
    When I open the Ndosi website
    And I should see the the heading Learn Automation the Right Way displayed
    And I click on the burger menu
    And I click learning material tab
    And I should see the heading Login to Access Learning Materials displayed
    And I put my login username <admin_username>
    And I put my login password <admin_password>
    And I click on the login button
    Then I should see the heading Practice Assessments displayed

    Examples:
      | admin_username | admin_password |
      | admin          | ndosi          |

