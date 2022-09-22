package Homework.ExamPreparation;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        String equipment = scan.nextLine();
        String discount = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double pricePerDay = 0;
        double totalPrice = 0;


        if (days < 1) {
            System.out.println("Days must be positive number!");

        } else if (!((city.equals("Varna")
                || city.equals("Burgas")
                || city.equals("Bansko")
                || city.equals("Borovets"))
                && (equipment.equals("noEquipment")
                || equipment.equals("withEquipment")
                || equipment.equals("noBreakfast")
                || equipment.equals("withBreakfast")))) {

            System.out.println("Invalid input!");

        } else {

            switch (city) {
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

            if (days > 7){
                days = days - 1;
            }



            totalPrice = pricePerDay * days;

            System.out.printf("The price is %.2flv! Have a nice time!",totalPrice);

        }
    }

}