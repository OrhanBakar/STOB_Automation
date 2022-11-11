@user
Feature: Verifying to Account Summary Page

  Background:
    Given the user is on the login page
    And User logins with username "username" and password "password"

  Scenario: Verify the title of the Account Summary page

    When the user is on the account summary page

    Then the user should be able to see "Zero - Account Summary" as title


  Scenario:Verify account types
    When the user is on the account summary page
    Then Account summary page should have the following titles

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario:Verify column names of Credit Accounts
    When  the user is on the account summary page
    Then the user should be able to see
      | Account     |
      | Credit Card |
      | Balance     |
