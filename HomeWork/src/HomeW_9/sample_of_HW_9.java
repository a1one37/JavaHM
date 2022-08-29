package HomeW_9;

import java.util.Arrays;

public class sample_of_HW_9 {
    public static void main(String[] args) {
        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];
        double sumFirstTeam = 0;
        double sumSecondTeam = 0;
        //------------------------------------- First Team -----------------------------------------------
        for (int i = 0; i < firstTeam.length; i++) {

            int min = 18;
            int max = 40;
            max -= min;
            firstTeam[i] = (int) (Math.random() * ++max) + min;
            sumFirstTeam += firstTeam[i];
        }
        System.out.println("возраст людей в первой команде = " + Arrays.toString(firstTeam));
        System.out.println("средний возраст людей в первой команде = " + sumFirstTeam);


        //------------------------------------- Second Team -----------------------------------------------
        for (int j = 0; j < secondTeam.length; j++) {
            int min = 18;
            int max = 40;
            max -= min;
            secondTeam[j] = (int) (Math.random() * ++max) + min;
            sumSecondTeam += secondTeam[j];

        }
        System.out.println("возраст людей во второй команде" + Arrays.toString(secondTeam));
        System.out.println("средний возраст людей в первой команде = " + sumSecondTeam);


    }


}
