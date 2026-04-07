package week4.day1;

import week4.day1.exceptions.InvalidDivisor;

public class Division {

    public static int divide(int dividend, int divisor) {
        if (divisor < 1) throw new InvalidDivisor("Divisor cannot be less than 1");

        boolean negative = false;
        if (dividend < 0) {
            dividend = -dividend;
            negative = true;
        };

        int count = 0;
        while (true){
            int result = dividend - divisor;
            if (result < 0) {
                break;

            }

            if (result > 0) {
                dividend = result;
                count++;
            }

        }

        System.out.println(count);

        if (negative) {return -count;}
        return count;
    }
}
