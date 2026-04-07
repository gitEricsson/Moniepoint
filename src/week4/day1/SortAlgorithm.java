package week4.day1;

import java.util.Arrays;

public class SortAlgorithm {
    public int[] sortArray(int[] arr) {
         while (!sortCheck(arr)){
         for (int i = 1; i < arr.length; i++){
             if (arr[i] < arr[i-1]){
                 arr[i] = arr[i-1] + arr[i];
                 arr[i-1] =  arr[i] - arr[i-1];
                 arr[i] =  arr[i] - arr[i-1];

             }
         }
         }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public boolean sortCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }

        return true;
    }
}
