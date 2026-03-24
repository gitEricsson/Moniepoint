package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lcm {
    public int lcmResult(int... numbers){
        int[] lcmArray = Arrays.copyOf(numbers, numbers.length);

        int i = 2;
        ArrayList<Integer> dividendArray = new ArrayList<>();

        while(atLeastOneGreaterThanOne(lcmArray)) {
            int[] arrayBeforeLoop = Arrays.copyOf(lcmArray, lcmArray.length);

            for (int x = 0; x < lcmArray.length; x++) {
                int value = lcmArray[x];

                if (value % i != 0) continue;

                int divisionResult = value / i;
                lcmArray[x] = divisionResult;

            }

            if (!Arrays.equals(arrayBeforeLoop, lcmArray))  dividendArray.add(i);
            if (!atLeastOneDivisible(lcmArray, i)) i++;
        }

        return productOfArraysInteger(dividendArray);
    }

    public static boolean atLeastOneGreaterThanOne(int[] arr) {
        for (int value : arr) {
            if (value > 1) {
                return true;
            }
        }
        return false;
    }


    public int productOfArraysInteger(ArrayList<Integer> list) {
        int total = 1;
        for (int value : list) {
            total *= value;
        }
        return total;
    }

    public boolean atLeastOneDivisible(int[] arr, int i) {
        for (int value : arr) {
            if (value % i == 0) {
                return true;
            }
        }
        return false;
    }

}
