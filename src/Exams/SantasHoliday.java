package Exams;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String rating = scan.nextLine();
        double price = 0;
        int discount = 0;


        switch (room) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (days < 10) {
                    discount = 30;
                } else if (days < 15) {
                    discount = 35;
                } else {
                    discount = 50;
                }
                break;

            case "president apartment":
                price = 35;
                if (days < 10) {
                    discount = 10;
                } else if (days < 15) {
                    discount = 15;
                } else {
                    discount = 20;
                }
                break;

        }

        double discountDiff = (100 - discount) / 100.00;
        int nights = days - 1;


        double totalPrice = (nights * price) * discountDiff;

        if(rating.equals("positive")){
            totalPrice *= 1.25;
        }else {
            totalPrice *= 0.9;
        }

        System.out.printf("%.2f", totalPrice);



    }
}
