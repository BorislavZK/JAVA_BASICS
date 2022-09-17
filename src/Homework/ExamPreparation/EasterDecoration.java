package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int clients = Integer.parseInt(scan.nextLine());
        int itemsCounter = 0;
        double total = 0;
        double totalAmount = 0;
        String item = "";

        for (int i = 1; i <= clients; i++) {
            itemsCounter = 0;
            total = 0;

            item = scan.nextLine();

            while (!item.equals("Finish")) {
                itemsCounter++;
                switch (item) {

                    case "basket":
                        total += 1.50;
                        break;
                    case "wreath":
                        total += 3.80;
                        break;
                    case "chocolate bunny":
                        total += 7.0;
                        break;
                }

                item = scan.nextLine();

            }
            if (itemsCounter % 2 == 0) {
                total = total * 0.80;
            }
            totalAmount += total;
            System.out.printf("You purchased %d items for %.2f leva.\n", itemsCounter, total);


        }

        System.out.printf("Average bill per client is: %.2f leva.", totalAmount / clients);


    }
}
