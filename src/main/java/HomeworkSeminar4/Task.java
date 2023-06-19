package HomeworkSeminar4;

import java.util.*;

public class Task {
    /*
    Реализовать консольное приложение, которое:
    1. Принимает от пользователя и “запоминает” строки.
    2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    3. Если введено revert, удаляет предыдущую введенную строку из памяти.
    4. Если введено exit, то программа завершается

    > - ввод в консоль (stdin), < - вывод на консоль (stdout)
    > java
    > python
    > c#
    > print
    < [c#, python, java]
    > revert
    > print
    < [python, java]
    > revert
    > revert
    > print
    < []
    > revert -> throw new NoSuchElementException
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("print")) {
                for (int i = strings.size() - 1; i >= 0; i--) {
                    System.out.println(strings.get(i));
                }
                if (strings.size() < 1){
                    System.out.println("Список пуст!");
                }
            } else if (input.equals("revert")) {
                if (strings.size() > 0) {
                    strings.remove(strings.size() - 1);
                } else {
                    System.out.println("Удалять больше нечего!");
                }
            } else if (input.equals("exit")) {
                System.out.println("Программа завершена");
                break;
            } else {
                strings.add(input);
            }
        }

        scanner.close();

    }
}
