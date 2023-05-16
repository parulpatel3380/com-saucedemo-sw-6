Feature: Product Test
  As a user I want to login in into sauce-demo website.
  @sanity
  Scenario Outline: User Should verify That Six Products Are Displayed On Page
    Given   I am on homepage
    When I enter Username"<username>"
    And I enter Password"<password>"
    And I click on login button
    Then Verify products per page "<expected>"
    Examples:
      |username| password|expected|
      |standard_user | secret_sauce | 6 |