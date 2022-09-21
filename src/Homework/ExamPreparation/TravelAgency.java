package Homework.ExamPreparation;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        String equipment = scan.nextLine();
        String discount = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double pricePerDay = 0;
        int discountPercent = 0;

        switch (town) {
            case "Bansko":
            case "Borovets":

                if (equipment.equals("withEquipment")) {
                    pricePerDay = 100;
                    if (discount.equals("yes")) {
                        pricePerDay *= 0.9;
                    }

                } else {
                    pricePerDay = 80;
                    if (discount.equals("yes")) {
                        pricePerDay *= 0.95;
                    }
                }
                break;

            case "Varna":
            case "Burgas":

                if (equipment.equals("withBreakfast")) {
                    pricePerDay = 130;
                    if (discount.equals("yes")) {
                        pricePerDay *= 0.88;
                    }

                } else {
                    pricePerDay = 100;
                    if (discount.equals("yes")) {
                        pricePerDay *= 0.93;
                    }

                }

                break;
        }




    }
}
