package Homework;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int manHour = Integer.parseInt(scan.nextLine());

        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = (paint + (paint * 0.10)) * 14.50;
        double thinnerSum = thinner * 5.00;
        double bag = 0.40;
        double totalMaterial = nylonSum + paintSum + thinnerSum + bag;
        double manPrice = (totalMaterial * 0.30) * manHour;
        double Total = totalMaterial + manPrice;

        System.out.println(Total);

    }
}
