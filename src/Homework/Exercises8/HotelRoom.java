package Homework.Exercises8;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;
        //double studioDiscount = 0.0;
        //double apartmentDiscount = 0.0;
        double studioTotal = 0.0;
        double apartmentTotal = 0.0;
//За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        switch ("month") {
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
                if (nights > 14){
                    studioTotal = studioPricePerNight * nights - (studioTotal * 0.20);
                    apartmentTotal = apartmentPricePerNight * nights;
                }
                break;

            case "July":
            case "August":
                studioTotal = studioPricePerNight * nights;
                apartmentTotal = apartmentPricePerNight * nights;
                break;

                //На първия ред: "Apartment: {цена за целият престой} lv."
                //На втория ред: "Studio: {цена за целият престой} lv."
        }

        System.out.printf("Apartment: %d lv.%n", apartmentTotal);
        System.out.printf("Studio: %d",studioTotal);

    }
}
