Feature: Login Test
  As a user I want to login in into sauce-demo website.
  @smoke
  Scenario Outline: User Should login Successfully With Valid Credentials
    Given   I am on Homepage
    When I enter username"<username>"
    And I enter password"<password>"
    And I click on Login button
    Then Verify the text "<expected>"
    Examples:
      |username| password|expected|
      |standard_user | secret_sauce | Products  |