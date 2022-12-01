package Homework.ExamPreparation;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String etap = scan.nextLine();
        String ticketType = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        String picture = scan.nextLine();

        int trophyPhoto = 40;

        double totalPrice = 0;
        double price = 0;

        boolean flag = false;


        switch (etap) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    price = 55.50;
                } else if (ticketType.equals("Premium")) {
                    price = 105.20;
                } else {
                    price = 118.90;
                }
                break;

            case "Semi final":
                if (ticketType.equals("Standard")) {
                    price = 75.88;
                } else if (ticketType.equals("Premium")) {
                    price = 125.22;
                } else {
                    price = 300.40;
                }
                break;

            case "Final":
                if (ticketType.equals("Standard")) {
                    price = 110.10;
                } else if (ticketType.equals("Premium")) {
                    price = 160.66;
                } else {
                    price = 400;
                }
                break;

            default:
                break;
        }

        totalPrice = tickets * price;

        if (totalPrice > 2500 && totalPrice <= 4000) {
            totalPrice = totalPrice * 0.9;

        } else if (totalPrice > 4000) {
            trophyPhoto = 0;
            totalPrice = totalPrice * 0.75;
        }

        if (picture.equals("Y")) {
            totalPrice = totalPrice + (tickets * trophyPhoto);
        }

        System.out.printf("%.2f", totalPrice);

    }
}
