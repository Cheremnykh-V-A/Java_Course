package Seminars.Seminar1;

import java.util.Arrays;

public class main2 {
    public static void main(String[] args) {
        /*
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему.
        */
        int[] num2 = {1,3,9,3,2,8,3,7};
        int val = 3;
        int start1 = 0;
        int end1 = num2.length-1;

        while (start1 < end1){
            int tmp;
            if (num2[start1] == val && num2[end1] != val) {
                tmp = num2[end1];
                num2[end1] = num2[start1];
                num2[start1] = tmp;
                end1 --;
            }
            else if(num2[end1] == val){
                end1 --;
            }

            start1 ++;
        }
        System.out.println(Arrays.toString(num2));
    }
}
