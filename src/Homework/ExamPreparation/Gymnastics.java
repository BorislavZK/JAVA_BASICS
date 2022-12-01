package Homework.ExamPreparation;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        String country = scan.nextLine();
        String type = scan.nextLine();

        double hard = 0;
        double show = 0;
        double grade = 0;

        switch (country) {
            case "Russia":
                if (type.equals("ribbon")) {
                    hard = 9.100;
                    show = 9.400;
                } else if (type.equals("hoop")) {
                    hard = 9.300;
                    show = 9.800;
                } else {
                    hard = 9.600;
                    show = 9.000;
                }
                break;

            case "Bulgaria":
                if (type.equals("ribbon")) {
                    hard = 9.600;
                    show = 9.400;
                } else if (type.equals("hoop")) {
                    hard = 9.550;
                    show = 9.750;
                } else {
                    hard = 9.500;
                    show = 9.400;
                }
                break;

            case "Italy":
                if (type.equals("ribbon")) {
                    hard = 9.200;
                    show = 9.500;
                } else if (type.equals("hoop")) {
                    hard = 9.450;
                    show = 9.350;
                } else {
                    hard = 9.700;
                    show = 9.150;
                }
                break;

            default:
                break;
        }


        grade = hard + show;
        double percent = ((20 - grade) / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.\n" +
                "%.2f%%", country, grade, type,  percent);
    }
}
