Feature:Verifying the Profile web application
 # Feature,Background,given (precondition), when ( Action), then (Validation/test)
  Background: The profile link is visible
    Given The Profile link is loaded in the browser


    Scenario: Tc-101 Verify that the title shows something meaningful
    When user take the capture the title
    Then the title should be something meaningful


   Scenario: Tc-102 Verify the url
     When User capture the url
     Then the url should be as expected

   Scenario: Tc-103 Verify that the input box is available
     When user click on it
     Then it shows All the Testing tool name

   Scenario: Tc-104
     When User see Project Management tool
     Then User can type Jira

   Scenario: Tc-105
     When User Click on the facebook link
     Then it should take user to the Facebook Page

   Scenario: Tc-106
     When User Click on Linkedin Link
     Then it should take user to Linkedin Page

   Scenario: Tc-107
     When User Click on Hobbies tab
     Then user should be able to  click on all checkboxes

   Scenario: Tc-108
     When User click on Gender Tab
     Then user should be able to check only one box at the time

   Scenario: Tc-109
     When user see Api testing tool
     Then user can  type API

   Scenario: Tc- 110
     When User see Mobile Automation testing Tool
     Then User Can type Appium

   Scenario: Tc-111