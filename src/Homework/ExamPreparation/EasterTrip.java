package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double pricePerNight = 0;

        switch (destination) {

            case "France":
                if (dates.equals("21-23")) {
                    pricePerNight = 30;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 35;
                } else {
                    pricePerNight = 40;
                }
                break;

            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerNight = 28;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 32;
                } else {
                    pricePerNight = 39;
                }
                break;

            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerNight = 32;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 37;
                } else {
                    pricePerNight = 43;
                }
                break;


        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, pricePerNight * nights);


    }
}
