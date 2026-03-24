package week2.day2.snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void setup() {
        bike = new Bike();
    }

    @Test
    @DisplayName("Test Bike can be turned on")
    public void testBikeTurnedOn() {
        bike.turnBikeOn();
        assertTrue(bike.isBikeOn());
    }

    @Test
    @DisplayName("Test Bike can be turned off")
    public void testBikeTurnedOff() {
        bike.turnBikeOff();
        assertFalse(bike.isBikeOn());
    }

    @Test
    @DisplayName("Test Bike accelerates in increment of 1 in Gear 1")
    public void testBikeAcceleratesInIncrementOf1InGear1() {
        assertEquals(16, bike.accelerateBike(15));
    }

    @Test
    @DisplayName("Test Bike accelerates in increment of 2 in Gear 2")
    public void testBikeAcceleratesInIncrementOf2InGear2() {
        assertEquals(26, bike.accelerateBike(24));
    }

    @Test
    @DisplayName("Test Bike accelerates in increment of 3 in Gear 3")
    public void testBikeAcceleratesInIncrementOf3InGear3() {
        assertEquals(38, bike.accelerateBike(35));
    }

    @Test
    @DisplayName("Test Bike accelerates in increment of 4 in Gear 4")
    public void testBikeAcceleratesInIncrementOf4InGear4() {
        assertEquals(48, bike.accelerateBike(44));
    }

    @Test
    @DisplayName("Test Bike decelerates in decrement of 1 in Gear 1")
    public void testBikeDeceleratesInDecrementOf1InGear1() {
        assertEquals(14, bike.deccelerateBike(15));
    }

    @Test
    @DisplayName("Test Bike decelerates in decrement of 2 in Gear 2")
    public void testBikeDeceleratesInDecrementOf2InGear2() {
        assertEquals(22, bike.deccelerateBike(24));
    }
    @Test
    @DisplayName("Test Bike decelerates in decrement of 3 in Gear 3")
    public void testBikeDeceleratesInDecrementOf3InGear3() {
        assertEquals(32, bike.deccelerateBike(35));
    }
    @Test
    @DisplayName("Test Bike decelerates in decrement of 4 in Gear 4")
    public void testBikeDeceleratesInDecrementOf4InGear4() {
        assertEquals(40, bike.deccelerateBike(44));
    }
}
