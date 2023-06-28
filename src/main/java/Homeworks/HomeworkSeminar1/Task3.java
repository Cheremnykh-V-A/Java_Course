package Homeworks.HomeworkSeminar1;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
    /*
    В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     */
        LocalDateTime now = LocalDateTime.now();
        Calendar calendar = new GregorianCalendar();
        System.out.println(now);
        System.out.println(calendar);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12){
            System.out.println("Доброе утро, " + name + "!");
        }
        else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
        && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18){
            System.out.println("Добрый день, " + name + "!");
        }
        else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
        && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23){
            System.out.println("Добрый вечер, " + name + "!");
        }
        else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
        && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5){
            System.out.println("Доброй ночи, " + name + "!");
        }

    }
}
