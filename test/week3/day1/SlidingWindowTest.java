package week3.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlidingWindowTest {
    private SlidingWindow slidingWindow;

    @BeforeEach
    public void setUp()
    {
        slidingWindow = new SlidingWindow();
    }

    @Test
    @DisplayName("Test should return the 3 highest 3 consecutive array sum")
    public void shouldReturnHighest3ConsecutiveArraySum() {
        int[] array1 = new int[]{1, 5, 6, 9, 3, 2};
        int[] array1Result = new int[]{5, 6, 9};
        assertEquals(Arrays.toString(array1Result), Arrays.toString(slidingWindow.greatestSum(array1, 3)));

        int[] array2 = new int[]{4, 2, 10, 23, 3, 1, 0, 20};
        int[] array2Result = new int[]{ 23, 3, 1, 0, 20};
        assertEquals(Arrays.toString(array2Result), Arrays.toString(slidingWindow.greatestSum(array2, 5)));

        int[] array3 = new int[]{2, 1, 5, 1, 3, 2};
        int[] array3Result = new int[]{1, 5};
        assertEquals(Arrays.toString(array3Result), Arrays.toString(slidingWindow.greatestSum(array3, 2)));

        int[] array4 = new int[]{-5, -2, -3, -4, -1};
        int[] array4Result = new int[]{-2, -3};
        assertEquals(Arrays.toString(array4Result), Arrays.toString(slidingWindow.greatestSum(array4, 2)));

        int[] array5 = new int[]{7, 8, 9};
        int[] array5Result = new int[]{7, 8, 9};
        assertEquals(Arrays.toString(array5Result), Arrays.toString(slidingWindow.greatestSum(array5, 3)));

        int[] array6 = new int[]{3, 1, 4, 1, 5, 9};
        int[] array6Result = new int[]{9};
        assertEquals(Arrays.toString(array6Result), Arrays.toString(slidingWindow.greatestSum(array6, 1)));

        int[] array7 = new int[]{1, 2, 3, 4, 5};
        int[] array7Result = new int[]{3, 4, 5};
        assertEquals(Arrays.toString(array7Result), Arrays.toString(slidingWindow.greatestSum(array7, 3)));

        int[] array8 = new int[]{9, 8, 7, 6, 5};
        int[] array8Result = new int[]{9, 8, 7};
        assertEquals(Arrays.toString(array8Result), Arrays.toString(slidingWindow.greatestSum(array8, 3)));
    }
}
