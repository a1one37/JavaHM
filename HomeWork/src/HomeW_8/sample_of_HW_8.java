package HomeW_8;

import java.util.Scanner;

public class sample_of_HW_8 {
    public static void main(String[] args) {

        for (int attempt = 1; attempt < 12; attempt++) {
            Scanner sc = new Scanner(System.in);
            int personalNumber = sc.nextInt();
            int hiddenNumber = (int) Math.round(Math.random() * 10);
            System.out.println("Загаданный номер = " + hiddenNumber);

            if (hiddenNumber == personalNumber) {
                System.out.println("Поздравляю, вы угадали с " + attempt + " попытки");
                break;
            } else {
                System.out.println("Не угадали, попробуйте ещё раз(");
            }

        }

    }
}
