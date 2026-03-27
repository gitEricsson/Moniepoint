package week2.day3;

import java.util.ArrayList;

public class FactorsAndSmallestDivisors {

    public static ArrayList<Integer> arrayOfFactors(int number){
        int count = 2;
        ArrayList<Integer> factors = new ArrayList<>();

        while(count <= number){
            if(number % count == 0){
                factors.add(count);
            }
            count++;
        }
        return factors;
    }

    public static ArrayList<Integer> arrayOfDivisors(int number){
        int count = 2;
        ArrayList<Integer> factors = new ArrayList<>();

        while(count <= number){
            if(number % count != 0){
            count++;
            continue;
            }

            number /= count;
            factors.add(count);
        }
        return factors;
    }


}
