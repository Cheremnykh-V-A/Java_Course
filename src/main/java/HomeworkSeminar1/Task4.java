package HomeworkSeminar1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*
        Написать метод, которому на вход подается одномерный массив и число n
        (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.
         */
        int[] someArray = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        int temp;
        int len = someArray.length - 1;
        if (n < 0){
            for (int i = 0; i < -n; i++) {
                temp = someArray[0];
                System.arraycopy(someArray, 1, someArray, 0, len);
                someArray[len] = temp;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                temp = someArray[len];
                System.arraycopy(someArray, 0, someArray, 1, len);
                someArray[0] = temp;
            }
        }


        System.out.println(Arrays.toString(someArray));
    }
}
