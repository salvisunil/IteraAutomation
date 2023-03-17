Feature: Registration
  As a User
  I want to register on the website
  so that i can access the service

  Scenario:  Register on the website
    Given  I am on Home page
    Then I click on Signup page
    When I fill in the Registration page
    And I submit the form
    Then I should see a success message

