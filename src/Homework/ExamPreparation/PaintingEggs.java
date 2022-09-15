package Homework.ExamPreparation;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String size = scan.nextLine();
        String color = scan.nextLine();
        int part = Integer.parseInt(scan.nextLine());

        double price = 0;
        double expenses = 0;
        double totalPrice = 0;

        if (size.equals("Large")) {

            switch (color) {
                case "Red":
                    price = 16;
                    break;

                case "Green":
                    price = 12;
                    break;

                case "Yellow":
                    price = 9;
                    break;

                default:
                    break;

            }
        } else if (size.equals("Medium")) {

            switch (color) {
                case "Red":
                    price = 13;
                    break;

                case "Green":
                    price = 9;
                    break;

                case "Yellow":
                    price = 7;
                    break;

                default:
                    break;

            }
        } else if (size.equals("Small")) {

            switch (color) {
                case "Red":
                    price = 9;
                    break;

                case "Green":
                    price = 8;
                    break;

                case "Yellow":
                    price = 5;
                    break;

                default:
                    break;

            }
        }

        totalPrice = price * part;
        expenses = totalPrice * 0.35;

        System.out.printf("%.2f leva.", totalPrice - expenses);


    }
}
