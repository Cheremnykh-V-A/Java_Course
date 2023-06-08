package main.java.HomeworkSeminar1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        Задать одномерный массив и найти в нем минимальный и максимальный элементы
        */
        int size = 10;
        int[] someArray = new int[size];
        Random random = new Random();
        int maxBound = 100;
        int minValue = maxBound;
        int maxValue = 0;

        for (int i = 0; i < someArray.length ; i++) {
            someArray[i] = random.nextInt(maxBound);
            if (someArray[i] < minValue){
                minValue = someArray[i];
            }
            if (someArray[i] > maxValue){
                maxValue = someArray[i];
            }

        }
        System.out.println(Arrays.toString(someArray));
        System.out.println();
        System.out.printf("Минимальный элемент массива = %d", minValue);
        System.out.println();
        System.out.printf("Максимальный элемент массива = %d", maxValue);
    }
}
