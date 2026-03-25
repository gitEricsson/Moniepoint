package week1.snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week1.snacks.ArrayKata;

import static org.junit.jupiter.api.Assertions.*;

class ArrayKataTest {

    private ArrayKata arrayKata;

    @BeforeEach
    public void setup() {
        arrayKata = new ArrayKata();
    }

    @Test
    @DisplayName("Test maximum value in array of integers is returned")
    void testMaximumValueInArrayIsReturned() {
        int[] numbers = {1, 5, 3, 9, 2};
        assertEquals(9, arrayKata.maximumIn(numbers));
    }

    @Test
    @DisplayName("Test maximumIn returns zero for empty array")
    void testMaximumInReturnsZeroForEmptyArray() {
        int[] numbers = {};
        assertEquals(0, arrayKata.maximumIn(numbers));
    }

    @Test
    @DisplayName("Test minimum value in array of integers is returned")
    void testMinimumValueInArrayIsReturned() {
        int[] numbers = {4, 2, 8, 1, 6};
        assertEquals(1, arrayKata.minimumIn(numbers));
    }

    @Test
    @DisplayName("Test sum of all elements in array is calculated correctly")
    void testSumOfElementsIsCalculatedCorrectly() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, arrayKata.sumOf(numbers));
    }

    @Test
    @DisplayName("Test only even numbers are summed in array")
    void testSumOfEvenNumbersIsCalculatedCorrectly() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(12, arrayKata.sumOfEvenNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test only odd numbers are summed in array")
    void testSumOfOddNumbersIsCalculatedCorrectly() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(9, arrayKata.sumOfOddNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test array containing both minimum and maximum is returned")
    void testArrayOfMinimumAndMaximumIsReturned() {
        int[] numbers = {10, 2, 30, 4, 5};
        int[] expected = {2, 30};
        assertArrayEquals(expected, arrayKata.maximumAndMinimumOf(numbers));
    }

    @Test
    @DisplayName("Test count of odd numbers in array is returned")
    void testCountOfOddNumbersIsCorrect() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3, arrayKata.noOfOddNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test count of even numbers in array is returned")
    void testCountOfEvenNumbersIsCorrect() {
        int[] numbers = {2, 4, 6, 7, 9};
        assertEquals(3, arrayKata.noOfEvenNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test new array containing only even numbers is returned")
    void testArrayOfEvenNumbersIsReturned() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, arrayKata.evenNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test new array containing only odd numbers is returned")
    void testArrayOfOddNumbersIsReturned() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, arrayKata.oddNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test array of square numbers is returned")
    void testArrayOfSquareNumbersIsReturned() {
        int[] numbers = {2, 3, 4};
        int[] expected = {4, 9, 16};
        assertArrayEquals(expected, arrayKata.squareNumbersIn(numbers));
    }

    @Test
    @DisplayName("Test evenNumbersIn returns empty array when no even numbers exist")
    void testEvenNumbersInReturnsEmptyArrayWhenNoneExist() {
        int[] numbers = {1, 3, 5};
        int[] expected = {};
        assertArrayEquals(expected, arrayKata.evenNumbersIn(numbers));
    }
}