Feature: Register Affiliates Account Mechanism

  Background: 
    Given I open my "chrome" browser
    And I navigate to URL "https://www.demo.iscripts.com/multicart-enterprise/demo/index.php"

  Scenario: Successfully Land on vandors Login Page
    When I Click "VENDORS link"
    Then I Land on "Vendors signup page" and expect Title text as "Vendor Login"

  Scenario: Successfully Land on Register Page
    And I Click "VENDORS link"
    When I Click "Register now link"
    Then I expect options text on the left side as
      | Login           |
      | Register Now    |
      | Forgot Password |

  Scenario: successfully vandors plan page
    When I Click "VENDORS link"
    And I Click "Register now link"
    And I Land on "login page" and expect Title text as "Vendor Plans"
    And I Click "Select button"
    #Scenario: Sucessfully creation account for a new user
    #When I Click "VENDORS link"
    #And I Click "Register now link"
     #And I Click "Select button"
    #And I complete registation form for a new user firstname "mr hasan" and lastname "generatenew" 
