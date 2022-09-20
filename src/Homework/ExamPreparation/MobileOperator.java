package Homework.ExamPreparation;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String termOfContract = scan.nextLine();
        String typeOfContract = scan.nextLine();
        String mobileInternet = scan.nextLine();
        int monthsForPayment = Integer.parseInt(scan.nextLine());
        double totalSum = 0;

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

        if ("yes".equals(mobileInternet)) {
            if (pricePerMonth <= 10) {
                pricePerMonth += 5.50;
            } else if (pricePerMonth <= 30) {
                pricePerMonth += 4.35;
            } else {
                pricePerMonth += 3.85;
            }
        }

        totalSum = pricePerMonth * monthsForPayment;

        if (termOfContract.equals("two")){
            totalSum = totalSum * 0.9625;
        }

        System.out.printf("%.2f lv.",totalSum);



    }
}
