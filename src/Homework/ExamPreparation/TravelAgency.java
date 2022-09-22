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
        double totalPrice = 0;


        //На конзолата се отпечатва 1 ред:
        //•	Когато потребителят е въвел всички данни правилно, отпечатваме:
        //"The price is {цената, форматирана до втория знак}lv! Have a nice time!"
        //•	Ако потребителят е въвел по-малко от 1 ден за престой, отпечатваме:
        //"Days must be positive number!"
        //•	Когато при въвеждането на града или вида на пакета се въведат невалидни данни, отпечатваме: "Invalid input!"

        if (days < 0){
            System.out.println("Days must be positive number!");
            return;
        }


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

        totalPrice = pricePerDay * days;


        if (town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas")
                || equipment.equals("withEquipment") || equipment.equals("withBreakfast")
                || equipment.equals("noEquipment") || equipment.equals("noBreakfast")) {

            System.out.printf("The price is %.2dlv! Have a nice time!");

        }




    }
}
