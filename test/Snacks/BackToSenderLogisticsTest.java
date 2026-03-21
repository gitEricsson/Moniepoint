package Snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderLogisticsTest {
    private BackToSenderLogistics logistics;

    @BeforeEach
    public void setup() {
        logistics = new BackToSenderLogistics();
    }

    @Test
    @DisplayName("Test calculateRiderWage Function")
    public void testCalculateRiderWageFunction() {
        assertEquals(9000, logistics.calculateRiderWage(25));
        assertEquals(16000, logistics.calculateRiderWage(55));
        assertEquals(21250, logistics.calculateRiderWage(65));
        assertEquals(45000, logistics.calculateRiderWage(80));
    }
}