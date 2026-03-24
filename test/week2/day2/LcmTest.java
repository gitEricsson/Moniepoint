package week2.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LcmTest {

    private Lcm lcm;

    @BeforeEach
    public void setup() {
        lcm = new Lcm();
    }

    @Test
    @DisplayName("Test the LCM return Value is accurate")
    public void testLcm() {
        assertEquals(300, lcm.lcmResult(50, 20, 30));
    }

}
