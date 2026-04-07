package week4.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortAlgorithmTest {
    private SortAlgorithm sortAlgorithm;

    @BeforeEach
    public void setUp() {
        sortAlgorithm = new SortAlgorithm();
    }

    @Test
    @DisplayName("Should return a sorted array")
    public void sortArrayTest() {
        int[] arr = {1, 9, 4, 7, 3};
        int[] arrSorted = {1, 3, 4, 7, 9};
        assertEquals(Arrays.toString(arrSorted), Arrays.toString(sortAlgorithm.sortArray(arr)));
    }
}
