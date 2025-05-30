Feature: feature to test login page functionality

  Scenario Outline: Validate username and password is working
    Given browser is open
    And user is on login page
    And user enters id and password
    When hit login button
    Then user is on home page
    Then users click snag360 button
    When user click setup button
    And user click add project
    When user enter project name
    Then user click on save button
    And click dropdown select purpose
    Then click on create btn
    And click on phases
    Then enter phases name
    When user select purpose 
    And click create button
    Then click on Stages button
    And  select phase
    Then enter stage name
    When Click on create bttn
    Then Click on proceed button
    And user enters towers
    Then Clicks add button
    When scroll down
    And Click on Towers proceed button
    When click on add floor

    #Examples: 
      #| id                | password   |
      #| demo@lockated.com |123456|
