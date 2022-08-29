package HomeW_16;

import java.util.Scanner;

enum DrinksNames {
    COFFEE, TEA, LEMONADE, MOJITO, SODA, COCA_COLA
}


class Drinks {


    public static final int COFFE_price = 75;
    public static final int TEA_price = 40;
    public static final int LEMONADE_price = 85;
    public static final int MOJITO_price = 110;
    public static final int SODA_price = 23;
    public static final int COCA_COLA_price = 15;

    private final int price;

    private Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void makingCoffee() {

        System.out.println("Вы выбрали кофе! Чашка кофе стоит: " + COFFE_price + "₴");


    }

    public static void makingTea() {
        System.out.println("Вы выбрали чай! Чашка чая стоит: " + TEA_price + "₴");


    }

    public static void makingLemonade() {
        System.out.println("Вы выбрали лимонад! Чашка лимонада стоит: " + LEMONADE_price + "₴");


    }

    public static void makingMojito() {
        System.out.println("Вы выбрали мохито! Чашка мохито стоит: " + MOJITO_price + "₴");


    }

    public static void makingSoda() {
        System.out.println("Вы выбрали газировку! Чашка газировки стоит: " + SODA_price + "₴");


    }

    public static void makingCola() {
        System.out.println("Вы выбрали колу! Чашка колы стоит: " + COCA_COLA_price + "₴");


    }

}

public class drinksMachine {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("Menu:\n\nCOFFE\nTEA\nLEMONADE\nMOJITO\nSODA\nCOCA_COLA");
        String drinksChoice = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Впишите латиницей какой напиток вы желаете: \n");

        drinksChoice = sc.next().toUpperCase();
        DrinksNames drinksNames = DrinksNames.valueOf(drinksChoice);
        int price = 0;


        switch (drinksNames) {


            case COFFEE -> {
                Drinks.makingCoffee();
                price = Drinks.COFFE_price;
                break;
            }
            case TEA -> {
                Drinks.makingTea();
                price = Drinks.TEA_price;
                break;
            }
            case LEMONADE -> {
                Drinks.makingLemonade();
                price = Drinks.LEMONADE_price;
                break;
            }
            case COCA_COLA -> {
                Drinks.makingCola();
                price = Drinks.COCA_COLA_price;
                break;
            }
            case MOJITO -> {
                Drinks.makingMojito();
                price = Drinks.MOJITO_price;
                break;
            }
            case SODA -> {
                Drinks.makingSoda();
                price = Drinks.SODA_price;
                break;
            }
            default -> {
                System.out.print("Такого напитка нет в наличие!");
                break;
            }

        }
        System.out.print("Какое кол-во такого напитка вы хотите?\n");
        Scanner sc2 = new Scanner(System.in);
        int quantity_of_drinks = sc2.nextInt();
        int totalPrice = quantity_of_drinks * price;

        System.out.println("Вы заказали " + quantity_of_drinks + " " + drinksChoice + " по цене " + price + " за кружку, итого с Вас: " + totalPrice);
        System.out.println("Вы бы хотели заказать что-то ещё?");
        do {
            Scanner sc3 = new Scanner(System.in);
            String answer = sc3.nextLine();


            if (answer.equals("нет") || answer.equals("НЕТ") || answer.equals("Нет") || answer.equals("не")) {
                System.out.println("Хорошо, спасибо за заказ, с Вас: " + totalPrice + "₴," + " хорошего дня)");
                break;
            } else {
                //   без понятия как можно сделать 2 выбор
            }
        }
        while (true);


    }

}




