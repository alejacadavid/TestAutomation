
Feature: Buscar una palabra en Google

  Scenario: Usuario busca una palabra

    Given un navegador con www.google.com
    When la palabra "cucumber" es ingresada en el campo de búsqueda
    Then el top 15 debe ser mostrado

