Feature: Register Affiliates Account Mechanism

  Background: 
    Given I open my "chrome" browser
    And I navigate to URL "https://www.demo.iscripts.com/multicart-enterprise/demo/index.php"

  Scenario: Successfully Land on vandors Login Page
  When I Click "VENDORS link"
  Then I Land on "Vandors signup page" and expect Title text as "Vendor Login"
  
  #
  #Scenario: Successfully Land on Register Page
    #When I Click "VENDORS link"
    #And I Click "Register now link"
     #Then I Land on "MultiCart Enterprise" and expect Title text as "Vendor Login"
     #And I expect"ALL title " text as
    #And I Click "Select button"
    #
    
    
    #Scenario: Sucessfully creation account for a new user
     #When I Click "VENDORS link"
     #And I Click "Select button"
    #And I Click "Register now link"
    #And I complete registation form for a new user firstname "mr hasan" and lastname "generatenew" 
