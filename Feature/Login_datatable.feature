Feature: login orange Hrm

  Scenario: register user
    Given url of page
    When user enter valid credentials

      | username  | Admin   |  #valid
      | password  | admin123|  #valid

    Then user should login page