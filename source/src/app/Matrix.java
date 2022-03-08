package app;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the dimensions of the matrix with it's lines and columns.");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[n][m];
        sc.nextLine();
        int negNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("type the next element of the matrix");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("find a number and its neighbors at the matrix");
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (number == matrix[i][j]) {
                    System.out.println("position " + i +"," + j);

                    if(j > 0){
                        System.out.println("left: " + matrix[i][j - 1]);
                    }
                    if(i > 0) {
                        System.out.println("up: " + matrix[i - 1][j]);
                    }
                    if(j < matrix[i].length - 1 ) {
                        System.out.println("right: " + matrix[i][j + 1]);

                    }
                    if(i < matrix.length - 1) {
                        System.out.println("down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }

}