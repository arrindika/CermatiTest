@Web
Feature: Register
  @Positive
  Scenario: User register with valid data
    Given User open Cermati Register Page
    When User input new email "woobla@gmail.com" on email text field
    And User input new password "P@ssw0rd" on new password text field
    And User input confirmation password "P@ssw0rd" on confirmation password text field
    And User input first name "Fani" on first name text field
    And User input last name "Kim" on last text field
    And User input phone number "082361861757" on phone number field
    And User input residence city "KOTA JAKARTA PUSAT" on residence city field
    And User click Register button
    Then User register complete and directed to account page
