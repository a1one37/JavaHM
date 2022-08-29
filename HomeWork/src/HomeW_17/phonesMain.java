package HomeW_17;


interface Smartphones {
    void call();

    void sms();

    void internet();
}

interface Linux {
    void downloadUpdate();
}

interface Ios {
    void downloadUpdate();
}

class Android implements Smartphones, Linux {
    String phoneNumber;
    String phoneOperator;
    double moneyTariff;

    Android(String phoneNumber, String phoneOperator, double moneyTariff) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneNumber;
        this.moneyTariff = moneyTariff;

    }

    @Override
    public void call() {
        System.out.println("Чтобы позвонить кому-то с карточки оператора " + phoneOperator + " вам надо пополнить баланс на сумму " + moneyTariff + " и вставить номер " + phoneNumber);
    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }

    public void downloadUpdate() {
        System.out.println("Чтобы скачать обновление на смартфоне с операционкой Линукс, зайди в настройки и перейдите во вкладку об Устройстве -> обновления");
    }
}

class Iphone implements Smartphones, Ios {

    String phoneNumber;
    String phoneOperator;
    double moneyTariff;

    Iphone(String phoneNumber, String phoneOperator, double moneyTariff) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneNumber;
        this.moneyTariff = moneyTariff;

    }

    @Override
    public void call() {
        System.out.println("Чтобы позвонить кому-то с карточки оператора " + phoneOperator + " вам надо пополнить баланс на сумму " + moneyTariff + " и вставить номер " + phoneNumber);
    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }

    public void downloadUpdate() {
        System.out.println("Чтобы скачать обновление на смартфоне с операционкой Ios, зайди в настройки и перейдите во вкладку об Apple id -> последние обновления");
    }
}


public class phonesMain {
    public static void main(String[] args) {
        Iphone iphone13 = new Iphone("+380581930168", "KyivStar", 80);
        iphone13.call();
        iphone13.downloadUpdate();
        System.out.println(" ");
        Android xiaomi = new Android("+380662763184", "Vodafone", 123.4);
        xiaomi.call();
        xiaomi.downloadUpdate();
    }
}