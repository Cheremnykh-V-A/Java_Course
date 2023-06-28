package Seminars.Seminar1;

import java.util.Arrays;

public class main3 {
    public static void main(String[] args) {
        /*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         */
        String str1 = "Добро пожаловать на курс по Java";
        String [] lst1 = str1.split(" ");
        System.out.println(Arrays.toString(lst1));

        for (int i = lst1.length - 1; i >= 0; i--) {
            System.out.print(lst1[i] + " ");
        }
    }
}
