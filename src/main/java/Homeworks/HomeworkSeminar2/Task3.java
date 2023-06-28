package Homeworks.HomeworkSeminar2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    /*
    Дана json-строка (можно сохранить в файл и читать из файла)
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    Написать метод(ы), который распарсит json и, используя StringBuilder,
    создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
    Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
     */
    public static void main(String[] args) throws Exception {
        String[] arrData = ReadLineFromFile("C:/Users/User/Desktop/Учеба/Java_Course/Java_GB/src/main/java/HomeworkSeminar2/DataForTask3.txt");
        for (int i = 0; i < arrData.length; i++) {
            System.out.println(getQuery(arrData[i]));
        }
    }

    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size += 1;
        }
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;
    }

    public static StringBuilder getQuery(String line){
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}
