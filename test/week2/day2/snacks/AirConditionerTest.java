package week2.day2.snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    private AirConditioner airConditioner;

    @BeforeEach
    void setUp() {
        airConditioner = new AirConditioner();
    }

    @Test
    @DisplayName("Test air conditioner can be turned on")
    void testAirConditionerCanBeTurnedOn() {
        airConditioner.togglePower();
        assertTrue(airConditioner.isOn());
    }

    @Test
    @DisplayName("Test air conditioner can be turned off")
    void testAirConditionerCanBeTurnedOff() {
        airConditioner.togglePower();
        airConditioner.togglePower();
        assertFalse(airConditioner.isOn());
    }

    @Test
    @DisplayName("Test air conditioner temperature increases when on")
    void testTemperatureIncreases() {
        airConditioner.togglePower();
        airConditioner.setTemperature(20);
        airConditioner.increaseTemperature();
        assertEquals(21, airConditioner.getTemperature());
    }

    @Test
    @DisplayName("Test air conditioner temperature decreases when on")
    void testTemperatureDecreases() {
        airConditioner.togglePower();
        airConditioner.setTemperature(20);
        airConditioner.decreaseTemperature();
        assertEquals(19, airConditioner.getTemperature());
    }

    @Test
    @DisplayName("Test air conditioner temperature does not exceed thirty")
    void testTemperatureDoesNotExceedThirty() {
        airConditioner.togglePower();
        airConditioner.setTemperature(30);
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    @DisplayName("Test air conditioner temperature does not go below sixteen")
    void testTemperatureDoesNotGoBelowSixteen() {
        airConditioner.togglePower();
        airConditioner.setTemperature(16);
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    @DisplayName("Test air conditioner temperature cannot change while off")
    void testTemperatureCannotChangeWhileOff() {
        airConditioner.setTemperature(20);
        airConditioner.increaseTemperature();
        assertEquals(20, airConditioner.getTemperature());
    }
}
