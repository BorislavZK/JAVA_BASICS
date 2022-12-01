package Homework.ExamPreparation;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double hallRent = Double.parseDouble(scan.nextLine());


        double cakePrice = hallRent * 0.2;
        double juices = cakePrice * 0.55;
        double animator = hallRent / 3;

        double total = hallRent + cakePrice + juices + animator;

        System.out.println(total);


    }
}
