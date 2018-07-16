
# language: es
  Característica: Resta

    @Resta
  Esquema del escenario: Resta
    Dado Hay un número <numero1>
    Cuando Resto <numero2>
    Entonces Debería tener <resultado>

    Ejemplos:
    | numero1 | numero2 | resultado |
    | 12      | 5       | 7         |
    | 20      | 5       | 15        |