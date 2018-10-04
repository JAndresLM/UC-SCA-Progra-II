package datos_class5;

import java.util.Random;

public class DATOS_Class5 {

    public static void printMatrix(int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                System.out.print(" ["+matrix[row][column]+"]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] initMatrix(int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                Random randomInstance = new Random();
                int number = randomInstance.nextInt(100);
                matrix[row][column] = number;
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        int[][] myMatrix = {
            {1, 2, 3, 10},
            {4, 5, 6},
            {7, 12,9, 12},
            {8,13,17, 15, 58, 85},
        };
        int[][] randomMatrix = new int[4][5];
        randomMatrix = initMatrix(randomMatrix);
        printMatrix(randomMatrix);  
    }
}
