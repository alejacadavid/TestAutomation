$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Calculadora.feature");
formatter.feature({
  "name": "Calculadora",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Realizar operaciones",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "un navegador con la calculadora online",
  "keyword": "Given "
});
formatter.step({
  "name": "el usuario ingrese la operacion \"\u003coperacion\u003e\" y presione click en el boton \u003d",
  "keyword": "When "
});
formatter.step({
  "name": "el usuario debería obtener el resultado \u003cresultado\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "operacion",
        "resultado"
      ]
    },
    {
      "cells": [
        "5+5",
        "10"
      ]
    },
    {
      "cells": [
        "20-10",
        "10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Realizar operaciones",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "un navegador con la calculadora online",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingrese la operacion \"5+5\" y presione click en el boton \u003d",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario debería obtener el resultado 10",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar operaciones",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "un navegador con la calculadora online",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingrese la operacion \"20-10\" y presione click en el boton \u003d",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario debería obtener el resultado 10",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.uri("./src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user can search any keyword",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.openGoogleSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a keyword selenide is entered in input field",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.enterKeyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "top 10 matches should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.topTenMatchesShouldBeShown(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("./src/test/resources/features/GoogleSearchJ8.feature");
formatter.feature({
  "name": "Buscar una palabra en Google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Usuario busca una palabra",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "un navegador con www.google.com",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la palabra \"cucumber\" es ingresada en el campo de búsqueda",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el top 15 debe ser mostrado",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.uri("./src/test/resources/features/Substrac.feature");
formatter.feature({
  "name": "Resta",
  "description": "",
  "keyword": "Característica"
});
formatter.scenarioOutline({
  "name": "Resta",
  "description": "",
  "keyword": "Esquema del escenario"
});
formatter.step({
  "name": "Hay un número \u003cnumero1\u003e",
  "keyword": "Dado "
});
formatter.step({
  "name": "Resto \u003cnumero2\u003e",
  "keyword": "Cuando "
});
formatter.step({
  "name": "Debería tener \u003cresultado\u003e",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "numero1",
        "numero2",
        "resultado"
      ]
    },
    {
      "cells": [
        "12",
        "5",
        "7"
      ]
    },
    {
      "cells": [
        "20",
        "5",
        "15"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Resta",
  "description": "",
  "keyword": "Esquema del escenario"
});
formatter.step({
  "name": "Hay un número 12",
  "keyword": "Dado "
});
formatter.match({
  "location": "SubstractingSteps.hay_un_número(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Resto 5",
  "keyword": "Cuando "
});
formatter.match({
  "location": "SubstractingSteps.resto(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Debería tener 7",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SubstractingSteps.debería_tener(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Resta",
  "description": "",
  "keyword": "Esquema del escenario"
});
formatter.step({
  "name": "Hay un número 20",
  "keyword": "Dado "
});
formatter.match({
  "location": "SubstractingSteps.hay_un_número(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Resto 5",
  "keyword": "Cuando "
});
formatter.match({
  "location": "SubstractingSteps.resto(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Debería tener 15",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SubstractingSteps.debería_tener(int)"
});
formatter.result({
  "status": "passed"
});
});