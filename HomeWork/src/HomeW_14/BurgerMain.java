package HomeW_14;

class Burger {
    String bun;
    String meat;
    String cheese;
    String salad;
    String sauce;

}

public class BurgerMain {
    public static void main(String[] args) {
        Burger usualBurger = new Burger();
        usualBurger.bun = "Булочка";
        usualBurger.meat = "Мясо";
        usualBurger.cheese = "Сыр";
        usualBurger.salad = "Салат";
        usualBurger.sauce = "Майонез";

        Burger doubleMeatBurger = new Burger();
        doubleMeatBurger.bun = "Булочка";
        doubleMeatBurger.meat = "Двойное мясо";
        doubleMeatBurger.cheese = "Сыр";
        doubleMeatBurger.salad = "Салат";
        doubleMeatBurger.sauce = "Майонез";

        Burger dietBurger = new Burger();
        dietBurger.bun = "Булочка";
        dietBurger.meat = "Мясо";
        dietBurger.cheese = "Сыр";
        dietBurger.salad = "Салат";
        dietBurger.sauce = "(так как этот бургер диетический, то он идёт без майонеза)";


        System.out.println("Обычный бургер состоит из: " + usualBurger.bun + ", " + usualBurger.meat + ", " + usualBurger.cheese + ", " + usualBurger.salad + ", " + usualBurger.sauce + ". ");
        System.out.println("Диетический бургер состоит из: " + dietBurger.bun + ", " + dietBurger.meat + ", " + dietBurger.cheese + ", " + dietBurger.salad + ", " + dietBurger.sauce + ". ");
        System.out.println("Бургер с двойным мясом состоит из: " + doubleMeatBurger.bun + ", " + doubleMeatBurger.meat + ", " + doubleMeatBurger.cheese + ", " + doubleMeatBurger.salad + ", " + doubleMeatBurger.sauce + ". ");
    }

}
