package ex26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        double b = 5000.0;
        double APR = 12.0;
        double p = 100.0;
        double i = (APR/100)/365;
        Assertions.assertEquals(b, 5000.0);
        Assertions.assertEquals(APR, 12.0);
        Assertions.assertEquals(p, 100.0);
        Assertions.assertEquals(i, (APR/100)/365);
        System.out.print("It will take you " + Math.ceil(-(1.0/30.0)*Math.log(1+(b/p)*(1.0-Math.pow(1.0+i, 30)))/Math.log(1+i)) + " months to pay off this card.");
    }
}