package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack strings;

    @BeforeEach
    public void setUp() {
        strings = new Stack();
    }

    @Test
    @DisplayName("Stack should be empty")
    public void newStack_isEmptyTest() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addElement_stackIsNotEmptyTest() {
        assertTrue(strings.isEmpty());

        strings.push("G-Strings");

        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushOneElement_popOneElement_stackIsEmptyTest() {
        strings.push("G-Strings");
        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushTwoElements_popOneElement_stackIsNotEmptyTest() {
        strings.push("G-Strings");
        strings.push("A-Strings");

        assertFalse(strings.isEmpty());

        String popped = strings.pop();
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushX_popReturnsXTest() {
        strings.push("G-Strings");

        assertEquals("G-Strings", strings.pop());
    }

    @Test
    public void pushXYZ_popReturnsZYXTest() {
        strings.push("G-Strings");
        strings.push("A-Strings");
        strings.push("D-Strings");

        assertEquals("D-Strings", strings.pop());
        assertEquals("A-Strings", strings.pop());
        assertEquals("G-Strings", strings.pop());
    }
}