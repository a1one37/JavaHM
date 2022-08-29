package HomeW_4;

public class sample_of_HW_4 {
    public static void main(String[] args) {
        double income = 132100;
        double tax = 0.2;
        int limit = 100;
        int coefficient = ((int) income) / limit;
        coefficient = (coefficient + 2) % (coefficient + 1);
        double finalTax = (income - limit) * tax * coefficient;
        System.out.println("Налог = " + finalTax);

    }
}
