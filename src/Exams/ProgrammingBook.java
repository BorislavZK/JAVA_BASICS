package Exams;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double pricePerPage = Double.parseDouble(scan.nextLine());
        double priceCover = Double.parseDouble(scan.nextLine());
        int percentDiscount = Integer.parseInt(scan.nextLine());
        double designerFee = Double.parseDouble(scan.nextLine());
        int percentTeam = Integer.parseInt(scan.nextLine());

        double moneyForPrint = pricePerPage * 899 + ( priceCover * 2);
        double discountDiff = (100 - percentDiscount) / 100.00;
        double moneyWithDiscount = moneyForPrint * discountDiff;
        double moneyForPayment = moneyWithDiscount + designerFee;
        double teamPercent = (100 - percentTeam) / 100.0;
        double totalMoney = moneyForPayment * teamPercent;


        System.out.printf("Avtonom should pay %.2f BGN.", totalMoney);

    }
}
