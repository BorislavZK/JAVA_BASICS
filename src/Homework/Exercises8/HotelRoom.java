package Homework.Exercises8;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;
        double studioTotal = 0.0;
        double apartmentTotal = 0.0;

        switch (month) {
            case "May":
            case "October":
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
                if (nights > 7 && nights <= 14) {
                    studioTotal = studioPricePerNight * nights;
                    studioTotal = studioTotal * 0.95;
                    apartmentTotal = apartmentPricePerNight * nights;
                } else if (nights > 14) {
                    studioTotal = (studioPricePerNight * 0.7) * nights;
                    apartmentTotal = apartmentPricePerNight * nights;
                    apartmentTotal = apartmentTotal * 0.9;

                } else {
                    studioTotal = studioPricePerNight * nights;
                    apartmentTotal = apartmentPricePerNight * nights;

                }
                break;

            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                if (nights > 14) {
                    studioTotal = studioPricePerNight * nights;
                    studioTotal = studioTotal * 0.80;
                    apartmentTotal = apartmentPricePerNight * nights;
                    apartmentTotal = apartmentTotal * 0.9;
                } else {
                    studioTotal = studioPricePerNight * nights;
                    apartmentTotal = apartmentPricePerNight * nights;
                }
                break;

            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                studioTotal = studioPricePerNight * nights;
                apartmentTotal = apartmentPricePerNight * nights;
                if ( nights > 14 ){
                    apartmentTotal = apartmentPricePerNight * nights;
                    apartmentTotal = apartmentTotal * 0.9;

                }

                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentTotal);
        System.out.printf("Studio: %.2f lv.", studioTotal);
    }
}


