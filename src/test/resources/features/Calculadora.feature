@calculadora
Feature: Calculadora

  Scenario Outline: Realizar operaciones
    Given un navegador con la calculadora online
    When el usuario ingrese la operacion "<operacion>" y presione click en el boton =
    Then el usuario debería obtener el resultado <resultado>
    Examples:
    | operacion | resultado |
    | 5+5      | 10        |
    | 20-10     | 10        |


