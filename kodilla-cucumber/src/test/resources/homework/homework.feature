Feature: Is it divisible?
  Those numbers are divisible by five or three.

  Scenario Outline: The number is or isn't divisible
    Given <number>
    When I ask if it is 3 or 5 divisible
    Then Should return a result <result>
    Examples:
      | number | result     |
      | 3      | "Fizz"     |
      | 6      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 20     | "FizzBuzz" |
      | 40     | "FizzBuzz" |
      | 4      | "None"     |
      | 7      | "None"     |