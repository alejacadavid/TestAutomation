$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Customer.feature");
formatter.feature({
  "name": "Automated End2End Tests",
  "description": "  Description: The purpose of this feature is to test End 2 End integration.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Customer"
    }
  ]
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "name": "place the order",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "customer"
      ]
    },
    {
      "cells": [
        "Lakshay"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Customer"
    }
  ]
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"Lakshay\" personal details on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
});