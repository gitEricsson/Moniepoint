package Snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest {
    private Functions functions;

    @BeforeEach
    public void setup(){
        functions = new Functions();
    }

    @Test
    @DisplayName("Test isEven Function Operation")
    public void testIsEvenFunction(){
        boolean trueResult = functions.isEven(2);
        assertTrue(result);

        boolean falseResult = functions.isEven(3);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test isEven Input Validation")
    public void testIsEvenIntegerValidation(){
        assertThrows(IllegalArgumentException.class, () -> {functions.isEven(3.4);
        });
    }
}
