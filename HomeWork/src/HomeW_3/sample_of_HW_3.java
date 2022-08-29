package HomeW_3;

public class sample_of_HW_3 {
    public static void main(String[] args) {
        int width = 4;
        int height = 5;
        int length_of_parallelepiped = 12;

        int volume = width * height * length_of_parallelepiped;
        int length = 4 * (width + height + length_of_parallelepiped);

        System.out.println("Объем параллелепипеда = " + volume);
        System.out.println("Cуммарная длина всех сторон = " + length);

    }
}
