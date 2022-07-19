package Homework;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pen = Double.parseDouble(scan.nextLine());
        double marker = Double.parseDouble(scan.nextLine());
        double cleaner = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double penPrice = pen * 5.80;
        double markerPrice = marker * 7.20;
        double cleanerPrice = cleaner * 1.20;
        double priceAll = penPrice + markerPrice + cleanerPrice;
        double priceWithDiscount = priceAll * (discount / 100);
        double TotalPrice = priceAll - priceWithDiscount;

        System.out.println(TotalPrice);



    }
}
