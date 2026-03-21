package Snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaWahalaTest {
    private PizzaWahala pizzaWahala;
    private int numberOfPeople = 20;

    @BeforeEach
    public void setup() {
        pizzaWahala = new PizzaWahala();
    }

    @Test
    @DisplayName("Test getSlicesPerBox Function")
    public void testGetSlicesPerBoxFunction() {
        assertEquals(4, pizzaWahala.getSlicesPerBox("Sapa size"));
        assertEquals(6, pizzaWahala.getSlicesPerBox("Small Money"));
        assertEquals(8, pizzaWahala.getSlicesPerBox("Big boys"));
        assertEquals(12, pizzaWahala.getSlicesPerBox("Odogwu"));
    }

    @Test
    @DisplayName("Test getPricePerBox Function")
    public void testGetPricePerBoxFunction() {
        assertEquals(2500, pizzaWahala.getPricePerBox("Sapa size"));
        assertEquals(2900, pizzaWahala.getPricePerBox("Small Money"));
        assertEquals(4000, pizzaWahala.getPricePerBox("Big boys"));
        assertEquals(5200, pizzaWahala.getPricePerBox("Odogwu"));
    }

    @Test
    @DisplayName("Test calculateBoxes Function")
    public void testCalculateBoxesFunction() {
        assertEquals(5, pizzaWahala.calculateBoxes(numberOfPeople, "Sapa size"));
        assertEquals(4, pizzaWahala.calculateBoxes(numberOfPeople, "Small Money"));
        assertEquals(3, pizzaWahala.calculateBoxes(numberOfPeople, "Big boys"));
        assertEquals(2, pizzaWahala.calculateBoxes(numberOfPeople, "Odogwu"));
    }

    @Test
    @DisplayName("Test calculateLeftovers Function")
    public void testCalculateLeftoversFunction() {
        assertEquals(0, pizzaWahala.calculateLeftovers(numberOfPeople, "Sapa size"));
        assertEquals(4, pizzaWahala.calculateLeftovers(numberOfPeople, "Small Money"));
        assertEquals(4, pizzaWahala.calculateLeftovers(numberOfPeople, "Big boys"));
        assertEquals(4, pizzaWahala.calculateLeftovers(numberOfPeople, "Odogwu"));
    }

    @Test
    @DisplayName("Test calculatePrice Function")
    public void testCalculatePriceFunction() {
        assertEquals(12500, pizzaWahala.calculatePrice(numberOfPeople, "Sapa size"));
        assertEquals(11600, pizzaWahala.calculatePrice(numberOfPeople, "Small Money"));
        assertEquals(12000, pizzaWahala.calculatePrice(numberOfPeople, "Big boys"));
        assertEquals(10400, pizzaWahala.calculatePrice(numberOfPeople, "Odogwu"));
    }
}