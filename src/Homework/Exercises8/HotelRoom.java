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
                if (nights > 7 && nights < 14) {
                    studioTotal = studioPricePerNight * nights - (studioTotal * 0.05);
                    apartmentTotal = apartmentPricePerNight * nights;
                } else if (nights > 14) {
                    studioTotal = studioPricePerNight * nights - (studioTotal * 0.30);
                    apartmentTotal = apartmentPricePerNight * nights - (apartmentTotal * 0.20);

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
                    studioTotal = studioPricePerNight * nights - (studioTotal * 0.20);
                    apartmentTotal = apartmentPricePerNight * nights;
                }
                break;

            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                studioTotal = studioPricePerNight * nights;
                apartmentTotal = apartmentPricePerNight * nights;
                break;
        }

        System.out.printf("Apartment: %d lv.%n", apartmentTotal);
        System.out.printf("Studio: %d lv.", studioTotal);
    }
}


