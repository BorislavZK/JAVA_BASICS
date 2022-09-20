package Homework.ExamPreparation;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String termOfContract = scan.nextLine();
        String typeOfContract = scan.nextLine();
        String mobileInternet = scan.nextLine();
        int monthsForPayment = Integer.parseInt(scan.nextLine());

        double pricePerMonth = 0;


        switch (typeOfContract) {
            case "Small":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 9.98;
                } else {
                    pricePerMonth = 8.58;
                }
                break;

            case "Middle":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 18.99;
                } else {
                    pricePerMonth = 17.09;
                }
                break;

            case "Large":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 25.98;
                } else {
                    pricePerMonth = 23.59;
                }
                break;

            case "ExtraLarge":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 35.99;
                } else {
                    pricePerMonth = 31.79;
                }
                break;

            default:
                break;

        }

    }
}
