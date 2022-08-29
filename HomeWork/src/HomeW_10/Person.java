package HomeW_10;

import static HomeW_10.Person.personInfo;

public class Person {
    public static void main(String[] args) {
        personInfo("Ilya", "Kyiv", "06629857295");
        personInfo("Nikita", "Dnipro", "0509280581");
        personInfo("Jhon", "New-York", "0509258479");
    }

    public static String personInfo(String name, String city, String number) {
        System.out.println("Позвонить гражданину " + name + " из города " + city + " можно по номеру " + number);
        return "Позвонить гражданину " + name + " из города " + city + " можно по номеру " + number;
    }
}

