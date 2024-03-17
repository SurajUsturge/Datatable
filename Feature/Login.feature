Feature: login orangehrm

  Scenario: Login to homepage
    Given url of page
    When user enter username
    And user enter password
    Then user login successfully
