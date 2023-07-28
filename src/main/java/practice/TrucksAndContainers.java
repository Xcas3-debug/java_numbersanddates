package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t
        //  В каждый грузовик помещается максимум 12 контейнеров.
        // В каждый контейнер — не более 27 ящиков. Ящики, контейнеры и грузовики пронумерованы.

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
        Scanner vvod = new Scanner(System.in);
       //System.out.println("Количество ящиков:");
        //получение количество коробок от пользователя
        int boxes = vvod.nextInt();
        calcBoxes(boxes);

    }
    //------------------------------------------------------------------------
    public static void calcBoxes(int boxes) {
        int truckCount = 0;//truck грузовик
        int containerCount = 0;
        int maxBoxCount = 27;
        int maxContainer = 12;

        for (int i = 1; i <= boxes; i++) {
            if (i == 1) {
                truckCount = 1;
                containerCount = 1;
                System.out.println(" Грузовик: " + truckCount + "\n" +
                        "\tКонтейнер: " + containerCount);
            }
            System.out.println("\t\tЯщик: " + i);
            if (i % maxBoxCount == 0 && boxes % maxBoxCount != 0) {
                containerCount++;
                if (i % (maxBoxCount * maxContainer) == 0) {
                    truckCount++;
                    System.out.println("Грузовик: " + truckCount);
                }
                System.out.println("\tКонтейнер: " + containerCount);
            }
        }
        System.out.println("Необходимо:" + "\n" +
                "грузовиков - " + truckCount + " шт." + "\n" +
                "контейнеров - " + containerCount + " шт.");
    }

}
