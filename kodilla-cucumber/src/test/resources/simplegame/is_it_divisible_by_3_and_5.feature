Feature:  Is it divide by 3 or 5

  Scenario Outline: If its divided by 3 then say Fizz if by 5 then say Buzz if both then FizzBuzz

    Given number is <number>
    When  is it divided by 3 or 5
    Then  I must say <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 17 | "None" |
      | 21 | "Fizz" |
      | 25 | "Buzz" |
      | 28 | "None" |