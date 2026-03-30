package week3.day1;

public class SlidingWindow {
    public int[] greatestSum(int[] nums, int k) {
        int max = 0;
        int[] resultArray = new int[k];

        for(int i = 0; i <= nums.length - k; i++){

            int[] possibleResultArray = new int[k];
            int sum= 0;
            int j = 0;
            while (k > j){
                sum += nums[i + j];
                possibleResultArray[j] = nums[i + j];

                j++;
            }

            if (i == 0 || sum > max){
                max = sum;
                resultArray = possibleResultArray;
            }
        }

return resultArray;
    }
}
