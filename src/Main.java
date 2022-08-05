public class Main {
    public static void main(String[] args) {

       task3_1();
       task3_2();
       task3_3();
       task3_4();
       task3_5();
       task3_6();
       task3_7();

    }
    public static void task3_1() { // выполнение задания 3.1

        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            default:
                System.out.println("Такая операционная система не обнаружена.");
        }
    }
    public static void task3_2() { // выполнение задания 3.2

        int clientOS = 1;
        int clientDeviceYear = 2010;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        }

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task3_3() { // выполнение задания 3.3

        int year = 2021;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " год не является високосным.");
            }
            else {
                System.out.println(year + " год является високосным.");
            }
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task3_4() { // выполнение задания 3.4

        int deliveryDistance = 15;
        int deliveryTime = 3;

        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void task3_5() { // выполнение задания 3.5

        int monthNumber = 25;

        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Данный месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }

    public static void task3_6(){ // выполнение задания 3.6

        int age = 18;
        int salary = 50_000;
        int creditLimit = 0;

        if (age >= 23) {
            creditLimit = salary * 3;
        }
        else {
            creditLimit = salary * 2;
        }

        if (salary >= 80_000){
            creditLimit *= 1.5;
        }
        else if (salary >= 50_000){
            creditLimit *= 1.2;
        }

        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + creditLimit + " рублей.");
    }

    public static void task3_7(){ // выполнение задания 3.7

        int age = 20;
        int salary = 70_000;
        int wantedSum = 300_000;
        double paymentMax = salary * 0.5;
        double baseRate = 10.0;
        int monthCredit = 12;

        if (age < 23) {
            baseRate += 1.0;
        }
        else if (age < 30) {
            baseRate += 0.5;
        }

        if (salary > 80_000) {
            baseRate -= 0.7;
        }

        baseRate /= 100;

        double paymentCredit = (wantedSum + wantedSum * baseRate) / monthCredit;

        if (paymentMax > paymentCredit){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) paymentMax + " рублей. Платеж по кредиту " + (int) paymentCredit + " рублей. Одобрено.");
        }
        else{
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) paymentMax + " рублей. Платеж по кредиту " + (int) paymentCredit + " рублей. Отказано.");
        }
    }
}