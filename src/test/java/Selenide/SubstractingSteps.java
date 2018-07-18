package Selenide;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.junit.Assert;

public class SubstractingSteps {

    int numOne = 0;
    int numTwo = 0;
    int res1 = 0;

    @Dado("^Hay un número (\\d+)$")
    public void hay_un_número(int num1) throws Exception {
        numOne = num1;
    }

    @Cuando("^Resto (\\d+)$")
    public void resto(int num2) throws Exception {
        numTwo = num2;
    }

    @Entonces("^Debería tener (\\d+)$")
    public void debería_tener(int res) throws Exception {
        res1 = numOne - numTwo;
        System.out.println(numOne +" - " + numTwo + " = " + res);
        Assert.assertEquals(res1,res);
    }



}
