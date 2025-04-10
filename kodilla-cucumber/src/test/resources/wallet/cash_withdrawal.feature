Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario Outline: Not enough money in wallet
    Given I have deposited $<cashIn> in my wallet
    When I request $<cashOut>
    Then Money can't be dispensed because there is $<cashIn>
    Examples:
      | cashIn  | cashOut |
      | 0 | 50 |
      | 25 | 26 |