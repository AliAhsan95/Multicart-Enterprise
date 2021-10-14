Feature: Reseller Register Account Mechanism

  Background: 
    Given I open my "chrome" browser
    And I navigate to URL "https://www.demo.iscripts.com/multicart-enterprise/demo/index.php"

  Scenario: Successfully Land on Reseller Login Page
    When I Click "Resellers Link"
    Then I Land in "Reseller Login" Page and Expect Title Text as "Reseller Login"
    
    
  Scenario: Successfully get the expected header text on Reseller Plans Page
    When I Click "Resellers Link"
    And I Click "Register Now Link"
    Then I Land in "Reseller Plans" Page and Expect Title Text as "Reseller Plans"
    
  Scenario: Successfully Land on Reseller Registration Page
    When I Click "Resellers Link"
    And I Click "Register Now Link"
    And I Click "Free Reseller Membership Select Button"
    Then I Land in "Reseller Registration" Page and Expect Title Text as "Reseller Registration"  
    
   Scenario: Successfully Land on Reseller Plans Page
    When I Click "Resellers Link"
    And I Click "Register Now Link"
    Then I expect "Left Side Reseller Plans Page" options are available
    |Home|
    |Login|
    |Register Now|
    |Forgot Password|

