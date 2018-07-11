Feature: SUbstracting

  @example1
  Scenario Outline: substracting
  Given There are a number <number1>
  When I substract <number2>
  Then I should have <result>

  Examples:
    | number1 | number2 | result |
    |    12 |   5 |    7 |
    |    20 |   5 |   15 |