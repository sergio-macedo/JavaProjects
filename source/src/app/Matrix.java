package app;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int negNumber = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] < 0 ){
                    negNumber++;
                }
            }
        }
        System.out.println("Main diagonal");
        for (int i = 0; i < n ; i++){
            System.out.print(matrix[i][i]+ " ");

        }
        System.out.println("the amount of negative numbers inside the matrix is" + negNumber);

        sc.close();

    }
}
