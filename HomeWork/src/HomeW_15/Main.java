package HomeW_15;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class account {

    private String name;
    private String date;
    private String male;
    private String phone;
    static String secondName;
    static String weight;
    static String pressure;
    static String steps_per_day;

    LocalDate personBirthday = LocalDate.of(2005, 8, 4);
    LocalDate localDate = LocalDate.of(2022, 8, 16);
    long age = ChronoUnit.YEARS.between(personBirthday, localDate);

    public account(String name, String date, String male, String phone, String secondName, String weight, String pressure, String steps_per_day) {
        this.name = name;
        this.date = date;
        this.male = male;
        this.phone = phone;
        this.secondName = secondName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps_per_day = steps_per_day;


    }

    public account printAccountInfo() {
        System.out.print("Имя пользователя: " + name + "\nДата рождения пользователя: " + date + "\nПол пользователя: " + male + "\nНомер телефона пользователя: " + phone + "\nФамилия пользователя: " + secondName + "\nАес пользователя: " + weight + "\nДавление пользователя: " + pressure + "\nКоличество пройденных за день шагов пользователя: " + steps_per_day + "\nВозраст: " + age + "\n");
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }


    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSteps_per_day() {
        return steps_per_day;
    }

    public void setSteps_per_day(String steps_per_day) {
        this.steps_per_day = steps_per_day;
    }

}


public class Main {
    public static void main(String[] args) {
        new account("Illya", "04.08.2005", "male", "+380662763184", "Martynov", "75 kg", "30", "5000").printAccountInfo();
        System.out.println("");
        System.out.println("------------------------------- New User -----------------------------------------------");
        System.out.println("");
        new account("Misha", "23.02.1967", "male", "+380672957501", "Popov", "90 kg", "23", "1373").printAccountInfo();
        System.out.println("");
        System.out.println("------------------------------- New User -----------------------------------------------");
        System.out.println("");
        account Piter = new account("Piter", "19.05.1998", "female", "+380509275817", "Kulik", "120 kg", "45", "13000");
        Piter.printAccountInfo();
        System.out.println("");
        System.out.println("------------------------------- Remade User (Piter) -----------------------------------------------");
        System.out.println("");
        Piter.setdate("15.10.2001");
        Piter.setPhone("+380572859183");
        Piter.setSteps_per_day("4000");
        Piter.printAccountInfo();
    }

}

