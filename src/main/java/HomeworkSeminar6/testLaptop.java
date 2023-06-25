package HomeworkSeminar6;

import java.util.*;

public class testLaptop {
    public static void main(String[] args) {
        Notebooks msi = new Notebooks();
        msi.setModel("MSI Modern 14 C5M-011XRU");
        msi.setColor("Black");
        msi.setPrice(41100);
        msi.setRamSize(8);
        msi.setVideoCard("AMD Radeon RX Vega 7");

        Notebooks asus = new Notebooks();
        asus.setModel("ASUS VivoBook 14 X415");
        asus.setColor("Grey");
        asus.setPrice(74805);
        asus.setRamSize(8);
        asus.setVideoCard("Intel Iris Xe Graphics");

        Notebooks hp = new Notebooks();
        hp.setModel("HP 14s-fq0023ur");
        hp.setColor("Black");
        hp.setPrice(39655);
        hp.setRamSize(4);
        hp.setVideoCard("AMD Radeon Vega 2");

        Notebooks lenovo = new Notebooks();
        lenovo.setModel("Lenovo IdeaPad 3 15ADA05");
        lenovo.setColor("Grey");
        lenovo.setPrice(30822);
        lenovo.setRamSize(4);
        lenovo.setVideoCard("AMD Radeon Graphics");

        Notebooks acer = new Notebooks();
        acer.setModel("Acer Aspire 5 A517-53-743Z");
        acer.setColor("Grey");
        acer.setPrice(86400);
        acer.setRamSize(16);
        acer.setVideoCard("Intel Iris Xe Graphics");

        HashSet<Notebooks> notebooksSet = new HashSet<Notebooks>(Arrays.asList(msi, asus, hp, lenovo, acer));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр для поиска, где:\n1 - цена; \n2 - цвет; " +
                "\n3 - оперативная память; \n4 - показать все модели; \n5 - выход;");

        int operation = scanner.nextInt();

        if (operation == 1){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите максимальную цену: ");
            int maxPriceRequest = scanner1.nextInt();

            for (Notebooks price: notebooksSet){
                if (price.getPrice() <= maxPriceRequest){
                    System.out.println(price.printInfo());
                }
            }
        }

        if (operation == 2){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите цвет: ");
            String colorRequest = scanner2.nextLine();

            for (Notebooks color: notebooksSet){

                if (color.getColor().equalsIgnoreCase(colorRequest.toLowerCase())) {
                    System.out.println(color.printInfo());
                }
            }
        }

        if (operation == 3){
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Введите размер оперативной памяти: ");
            int ramRequest = scanner3.nextInt();

            for (Notebooks ramSize: notebooksSet){
                if (ramSize.getRamSize() == ramRequest){
                    System.out.println(ramSize.printInfo());
                }
            }
        }

        if (operation == 4){
            for (Notebooks note: notebooksSet){
                System.out.println(note.printInfo());
            }
        }

        if (operation == 5){
            System.out.println("Всего хорошего!");
        }

    }
}
