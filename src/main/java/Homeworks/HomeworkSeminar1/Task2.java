package Homeworks.HomeworkSeminar1;

public class Task2 {
    public static void main(String[] args) {
        /*
        Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        int [][] someArray = new int[5][5];

        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                someArray[i][i] = 1;
                someArray[i][someArray.length - 1 - i] = 1;

                System.out.printf("%d", someArray[i][j]);

            }
            System.out.println();
        }

    }
}
