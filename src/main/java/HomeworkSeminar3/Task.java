package HomeworkSeminar3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task {
    /*
        Пусть дан произвольный список целых чисел.
        1) Найти максимальное значение
        2) Найти минимальное значение
        3) Найти среднее значение
        4) Нужно удалить из него чётные числа
         */
    public static void main(String[] args) {
        // 1. Создание списка:
        Random random = new Random();
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("Список: " + integers);

        // 2. Поиск максимального значения:
        int max = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > max){
                max = integers.get(i);
            }
        }
        System.out.println("Максимальное значение = " + max);

        // 3. Поиск минимального значения:
        int min = max;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < min){
                min = integers.get(i);
            }
        }
        System.out.println("Минимальное значение = " + min);

        // 4. Удаление из списка чётных чисел:
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0){
                integers.remove(i);
                i--;
            }
        }
        System.out.println("Список без чётных чисел: " + integers);
    }


}
