package week2.day1.snacks;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {
    private String validState;
    private String invalidState;

    @BeforeEach
    void setUp() {
        validState = "Lagos";
        invalidState = "London";
    }

    @Test
    @DisplayName("Test that a valid Nigerian state returns the correct geo-political zone")
    void testThatValidStateReturnsCorrectZone() {
        GeoPoliticalZone result = GeoPoliticalZone.getZoneByState(validState);
        assertEquals(GeoPoliticalZone.SOUTH_WEST, result);
    }

    @Test
    @DisplayName("Test that an invalid state name throws an illegal argument exception")
    void testThatInvalidStateThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> GeoPoliticalZone.getZoneByState(invalidState));
    }

    @Test
    @DisplayName("Test that state lookup is case insensitive")
    void testThatStateLookupIsCaseInsensitive() {
        GeoPoliticalZone result = GeoPoliticalZone.getZoneByState("KADUNA");
        assertEquals(GeoPoliticalZone.NORTH_WEST, result);
    }
}