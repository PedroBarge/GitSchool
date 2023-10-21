import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Batalha Naval");
        //------------------------------------------------------------------//
        Scanner scnNaval = new Scanner(System.in);
        int row = 10;
        int column = 10;
        int[][] matrix = new int[row][column];
        int value = 0;

        //------------------------------------------------------------------//

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            if (value == 0) {
                value = 1;
            } else {
                value = 0;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                System.out.print(matrix[i][j]);
            }
        }

    }
}