Feature:

  Scenario Outline: Login to Ndosi website
    Given I an andrid device open with chrome browser
    When I open the Ndosi website
    And I should see the the heading Learn Automation the Right Way desplayed
    And I click on the baggur menu
    And I click learning material tab
    And I should see the heading Login to Access Learning Materials desplayed
    And I put my login username <admin_username>
    And I put my login password <admin_password>
    And I click on the login button
    Then I should see the heading Practice Assessments desplayed

    Examples:
      | admin_username | admin_password |
      | admin          | admin          |

