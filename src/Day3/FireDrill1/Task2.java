package Day3.FireDrill1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        char[][] arrayOfArrays = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'X'}
        };

        for (char[] row : arrayOfArrays){
            for (char col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (char[] row : arrayOfArrays){
            for (char col : row){
                if (col == 'X') System.out.print(1 + " ");
                if (col == 'O') System.out.print(0 + " ");

            }
            System.out.println();
        }
    }
}