package org.example;
import java.util.Arrays;

public class averageArray {

    public void countingAverage() {
        int[] myArray = new int[10];
        double average = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            average += myArray[i];

        }
        double result = average / myArray.length;

        System.out.println("Среднее арифметическое массива " + Arrays.toString(myArray) + " является " + result);

    }

    public static Object isSquare(int m, int n){
        Object[][] matrix = new Object[m][n];
        boolean isSquare = true;
//        int size = matrix.length;
//        for (int i = 0; i < size && isSquare; i++) {           2 вариант проверки
//            isSquare = size == matrix[i].length;
//
//        }
        if (m == n){
            System.out.println(isSquare + " это квадратная матрица!");
        }else {
            System.out.println(!isSquare + " это не квадратная матрица!");
        }


        return null;
    }
}
