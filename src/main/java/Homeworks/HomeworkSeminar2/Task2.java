package Homeworks.HomeworkSeminar2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task2 {
    /*
    Реализуйте алгоритм сортировки пузырьком числового массива,
    результат после каждой итерации запишите в лог-файл.
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("LogForTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Bubble Sort");

        int[] array = {5, 1, 25, 4, 6, 3};
        System.out.println(Arrays.toString(array));
        int[] array2 = bubbleSorting(array);
        System.out.println(Arrays.toString(array2));

    }

    public static int[] bubbleSorting(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
