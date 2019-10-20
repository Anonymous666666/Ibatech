package HW2;

import java.util.Random;
import java.util.Scanner;

public class Shooting {
    public static void printMatrix(char[][] matrix)
    {
        for(int i=0; i<=matrix[0].length; i++) {
            System.out.printf(" %d |", (i));
        }

        System.out.println();

        for(int i=0; i<matrix.length; i++) {

            System.out.printf(" %d |", (i+1));

            for(int j=0; j<matrix[0].length; j++) {

                System.out.printf(" %c |",matrix[i][j]);

            }

            System.out.println();
        }
    }

    //SHOOTS MARK
    private static void fillMatrixWithSlash(char[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = '-';
            }
        }
    }



    public static void main(String[] args) {

        char[][] matrix = new char[5][5];

        Scanner s = new Scanner(System.in);

        fillMatrixWithSlash(matrix);

       Random r = new Random();
        int random_row = r.nextInt(4);
        int random_column = r.nextInt(4);


        System.out.println("All set. Get ready to rumble!");

        while (true) {
            System.out.print("Guess row : ");
            int row = s.nextInt() - 1;
            if (row < 0 || row > matrix.length - 1) {
                System.out.println("Row is out of range !");
                continue;
            }
            System.out.print("Guess column : ");
            int column = s.nextInt() - 1;

            if (column < 0 || column > matrix[0].length - 1) {
                System.out.println("Column is out of range !");
                continue;
            }

            if (row == random_row && column == random_column) {
                System.out.println("You have won !");
                matrix[row][column] = '*';
                printMatrix(matrix);
                break;
            }

            matrix[row][column] = 'x';
            printMatrix(matrix);

        }
    }
}
