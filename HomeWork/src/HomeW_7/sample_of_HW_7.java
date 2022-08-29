package HomeW_7;

public class sample_of_HW_7 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 4 && j != 4)
                    if (i == 0) {
                        System.out.println(j);
                    } else {
                        System.out.println(i + "" + j);
                    }

            }
        }

    }
}

