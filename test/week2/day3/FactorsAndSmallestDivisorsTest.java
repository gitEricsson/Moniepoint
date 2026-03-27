package week2.day3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorsAndSmallestDivisorsTest {
    @Test
    @DisplayName("Test an array of factors is returned for an integer")
    public void testArrayOfFactors(){
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        factors.add(3);
        factors.add(6);
        factors.add(9);
        factors.add(18);
        assertEquals(factors, FactorsAndSmallestDivisors.arrayOfFactors(18));
    }

    @Test
    @DisplayName("Test an array of divisors is returned for an inte" +
            "ger")
    public void testArrayOfDivisors(){
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(2);
        factors.add(3);
        factors.add(3);
        assertEquals(factors, FactorsAndSmallestDivisors.arrayOfDivisors(18));
    }
}
