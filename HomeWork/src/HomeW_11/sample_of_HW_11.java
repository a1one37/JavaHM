package HomeW_11;

import java.util.Arrays;


public class sample_of_HW_11 {
    public static void main(String[] args) {

        int[] firstArr = new int[7];
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(firstArr);

        int[] secondArr = new int[7];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(secondArr);
        System.out.print(Arrays.toString(firstArr));
        System.out.println("");
        System.out.print(Arrays.toString(secondArr));

        int matches = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) matches++;
        }
        System.out.println("");
        System.out.println("Совпадений: " + matches);


    }
}
