package Exams;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int peoples = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        int transport = Integer.parseInt(scan.nextLine());
        int museum = Integer.parseInt(scan.nextLine());

        int nightPrice = 20;
        double transportPrice = 1.6;
        int museumPrice = 6;

        double nightsPerPerson = nights * nightPrice;
        double transportPerPerson = transport * transportPrice;
        double museumPerPerson = museum * museumPrice;
        double totalPerPerson = nightsPerPerson + transportPerPerson + museumPerPerson;
        double totalGroup = peoples * totalPerPerson;
        double totalPlusExpenses = totalGroup * 1.25;

        System.out.printf("%.2f", totalPlusExpenses);

    }
}
