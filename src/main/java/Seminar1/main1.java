package Seminar1;

import java.util.Arrays;

public class main1 {
    public static void main(String[] args) {
        /*
        Дан массив двоичных чисел, например [1,1,0,1,1,1],
        вывести максимальное количество подряд идущих 1.
         */
        int[] num1 = {1,1,0,1,1,1,1,1,1};
        System.out.println(Arrays.toString(num1));

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < num1.length-1; i++) {
            if (num1[i] == num1[i+1]){
                count ++;
                if (maxCount < count){
                    maxCount = count;
                }
            }
            else{count = 0;}
        }
        System.out.println(maxCount+1);
}}
