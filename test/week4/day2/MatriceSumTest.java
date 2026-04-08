package week4.day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatriceSumTest {
    @Test
    @DisplayName("Test should return true for equal sum across rows, columns and diagonals")
    public void testEquivalentSumAcross3x3RowsColumnsAndDiagonals() {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        assertTrue(MatriceSum.sum(matrix));
    }

    @Test
    @DisplayName("Test should return true for equal sum across rows, columns and diagonals")
    public void testEquivalentSumAcross4x4RowsColumnsAndDiagonals() {
        int[][] matrix = {
                {16,   2,   3,  13},
                {5,  11,  10,   8},
                {9,   7,   6,  12},
                {4,  14,  15,   1}

        };

        assertTrue(MatriceSum.sum(matrix));
    }

    @Test
    @DisplayName("Test should return false for unequal sum across rows, columns and diagonals")
    public void testFalseSumAcross4x4RowsColumnsAndDiagonals() {
        int[][] matrix = {
                {13,   2,   3,  13},
                {5,  11,  10,   8},
                {9,   7,   6,  12},
                {4,  14,  15,   1}

        };

        assertFalse(MatriceSum.sum(matrix));
    }
}
