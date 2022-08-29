package HomeW_12;

import java.util.Scanner;

public class sample_of_HW_12 {
    public static void main(String[] args) {

        System.out.println("enter amount of lines");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println("enter amount of numbers in each line");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        int[][] twoDimArray = new int[m][n];
        System.out.println("");


        System.out.println("First matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("");
        System.out.println("Second matrix");
        int[][] twoDimArray2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
