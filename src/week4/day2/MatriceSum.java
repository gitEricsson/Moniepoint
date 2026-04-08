package week4.day2;

public class MatriceSum {
    public static boolean sum(int[][] matrix) {
        int i = 0;
        int maxLength = matrix.length - 1;

        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        int sum = 0;

        while(i < matrix.length){
           int j = 0;
           int sumRow = 0;
           int sumCol = 0;


            while(j < matrix.length){
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];

                j++;
            }

            if(sumRow != sumCol) return false;
            if(i == 0) sum = sumRow;
            if (sum != sumRow) return false;

            if (matrix.length % 2 != 0){
                sumDiagonal1 += matrix[i][i];
                sumDiagonal2 += matrix[i][maxLength];
            }

            i++;
            maxLength--;
        }

        if (matrix.length % 2 != 0){
            if (sumDiagonal1 != sumDiagonal2) return false;
            if (sum != sumDiagonal1) return false;
        }

        return true;
    }
}
