package Seminars.Seminar2;

//public class seminar {
//    public static void main(String[] args) {
//        /*
//        Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1.
//         */
//        int n = 4;
//        String c1 = "A";
//        String c2 = "B";
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < n/2; i++) {
//            sb.append(c1).append(c2);
//        }
//        System.out.println(sb);
//    }
//}
//=============================================================================================================

//public class seminar {
//    public static void main(String[] args) {
////        Напишите метод, который сжимает строку.
////        Пример: вход aaaabbbcdd
//
//        String data = "aaaabbbcddd";
//        int counter = 1;
//        StringBuilder newData = new StringBuilder();
//
//        for (int i = 1; i < data.length(); i++) {
//            if(data.charAt(i - 1) == data.charAt(i)){
//                counter++;
//            }
//            else {
//                newData.append(data.charAt(i - 1));
//                if(counter > 1){
//                    newData.append(counter);
//                }
//                counter = 1;
//            }
//            if(i == data.length() - 1){
//                newData.append(data.charAt(i));
//                if(counter > 1){
//                    newData.append(counter);
//                }
//            }
//
//        }
//        System.out.println(newData);
//    }
//}

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class seminar {
    public static void main(String[] args) {
        /*
        Напишите метод, который составит строку,
        состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        /*
        Напишите метод, который вернет содержимое текущей папки в виде массива строк.
        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
        Обработайте ошибки с помощью try-catch конструкции.
        В случае возникновения исключения, оно должно записаться в лог-файл.
         */
        File file = new File("test.txt");
        StringBuilder text = createdString("test", 100);

        String pathProject = System.getProperty("user.dir");
        System.out.println("Текущая папка");
        System.out.println(pathProject);

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8))
        {
            osw.write(String.valueOf(text));
            System.out.println("Successfully written data to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder createdString(String str, int number){
        StringBuilder someStr = new StringBuilder();
        for (int i = 0; i < number; i++) {
            someStr.append(str);
        }
        return someStr;
    }




}
