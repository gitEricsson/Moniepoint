package snacks;

public class ArrayKata {

    public int maximumIn(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0];
        for (int number : array) {
            if (number > max) max = number;
        }
        return max;
    }

    public int minimumIn(int[] array) {
        if (array.length == 0) return 0;
        int min = array[0];
        for (int number : array) {
            if (number < min) min = number;
        }
        return min;
    }

    public int sumOf(int[] array) {
        int total = 0;
        for (int number : array) {
            total += number;
        }
        return total;
    }

    public int sumOfEvenNumbersIn(int[] array) {
        int total = 0;
        for (int number : array) {
            if (number % 2 == 0) total += number;
        }
        return total;
    }

    public int sumOfOddNumbersIn(int[] array) {
        int total = 0;
        for (int number : array) {
            if (number % 2 != 0) total += number;
        }
        return total;
    }

    public int[] maximumAndMinimumOf(int[] array) {
        if (array.length == 0) return new int[]{};
        return new int[]{minimumIn(array), maximumIn(array)};
    }

    public int noOfOddNumbersIn(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 != 0) count++;
        }
        return count;
    }

    public int noOfEvenNumbersIn(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) count++;
        }
        return count;
    }

    public int[] evenNumbersIn(int[] array) {
        int[] result = new int[noOfEvenNumbersIn(array)];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                result[index] = number;
                index++;
            }
        }
        return result;
    }

    public int[] oddNumbersIn(int[] array) {
        int[] result = new int[noOfOddNumbersIn(array)];
        int index = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                result[index] = number;
                index++;
            }
        }
        return result;
    }

    public int[] squareNumbersIn(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        return result;
    }
}