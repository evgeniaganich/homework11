import java.time.LocalDate;

public class Main {

    public static void isYearLeap(int year) {
        if (year <= 0) {
            System.out.println("Некорректное значение года");
            return;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void getClientOSAndDeviceYear(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear <= 0) {
            System.out.println("Некорректное значение года");
            return;
        }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Не удается идентифицировать операционную систему");
            return;
        }

        if (clientDeviceYear < currentYear) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear >= currentYear) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }

    public static void getDeliveryTime(int distance) {
        if (distance < 0) {
            System.out.println("Некорректно указано расстояние");
            return;
        }
        int time = 0;
        for (int i = 0; i < distance; i += 40) {
            time = time + 1;
        }
        System.out.println("Потребуется дней: " + time);
    }


    public static void main(String[] args) {

        //task 1

        int year = 2020;
        isYearLeap(year);

        //task 2

        int clientDeviceYear = 2019;
        int clientOS = 1;
        getClientOSAndDeviceYear(clientOS, clientDeviceYear);

        //task3

        int distance = 68;
        getDeliveryTime(distance);


    }
}