package HomeW_13;

public class sample_of_HW_13 {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 2, 2};
        int sumNumber = 5;


        if (findSum(arr, sumNumber)) {
            System.out.println("Пара чисел к числу " + sumNumber + " найдена!");
        } else {
            System.out.println("Пара чисел к числу " + sumNumber + " не найдена(");
        }
    }


    static boolean findSum(int[] arr, int sumNumber) {

        for (int k : arr) {
            for (int i : arr) {
                if (k + i == sumNumber) {
                    System.out.println("Пара чисел которые в сумме дают " + sumNumber + " являются " + k + " и " + i);

                    return true;
                }
            }
        }

        return false;
    }
}
