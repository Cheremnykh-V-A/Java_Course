package Homeworks.HomeworkSeminar5;

import java.util.*;

public class PhoneBook {
    /*
    Реализовать консольное приложение - телефонный справочник.
    У одной фамилии может быть несколько номеров.
    Пользователь может вводить команды:
    1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
    2: GET Ivanov - получить список всех номеров по фамилии
    3: REMOVE Ivanov - удалить все номера по фамилии
    4: LIST - Посмотреть все записи
    5: EXIT - Завершить программу

    Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
    .

    Пример взаимодействия (=> - это вывод на консоль):
    ADD Ivanov 8 800 555 35 35
    ADD Ivanov 8 800 100 10 10
    GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
    ADD Petrov 8 555 12 34
    LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
    REMOVE Ivanov
    LIST => Petrov = [8 555 12 34]
    GET NoName => Не найдена запись с фамилией "NoName"
    REMOVE NoName => Не найдена запись с фамилией "NoName"3
     */
    Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(lastName, numbers);
        }
    }

    public List<String> get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            System.out.println(phoneBook.get(lastName));
            return phoneBook.get(lastName);
        } else {
            System.out.println("Нет номеров для фамилии " + lastName);
            return null;
        }
    }

    public void remove(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.remove(lastName);
        } else {
            System.out.println("Нет номеров для фамилии " + lastName);
        }
    }

    public void list() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            List<String> numbers = entry.getValue();
            for (String number : numbers) {
                System.out.println(lastName + " " + number);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        boolean exit = false;
        while (!exit) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "ADD":
                    phoneBook.add(parts[1], parts[2]);
                    break;
                case "GET":
                    phoneBook.get(parts[1]);
                    break;
                case "REMOVE":
                    phoneBook.remove(parts[1]);
                    break;
                case "LIST":
                    phoneBook.list();
                    break;
                case "EXIT":
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильная команда");
                    break;
            }
        }

        scanner.close();
    }
}
