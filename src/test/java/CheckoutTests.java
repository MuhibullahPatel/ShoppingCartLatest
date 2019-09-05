package test.java;

import main.java.Checkout;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutTests {

    @Test
    public void shouldReturnZeroWhenNothingIsScanned(){

        int expectedTotal = 0;

        Checkout checkout = new Checkout();
        int actualTotal = checkout.total();

        assertEquals(expectedTotal, actualTotal);
    }

}
