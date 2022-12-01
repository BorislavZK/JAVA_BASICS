package Homework.ExamPreparation;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();
        String pack = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double price = 0;


        switch (movie) {
            case "John Wick":
                if (pack.equals("Drink")) {
                    price = 12;
                } else if (pack.equals("Popcorn")) {
                    price = 15;
                } else {
                    price = 19;
                }
                break;

            case "Star Wars":
                if (pack.equals("Drink")) {
                    price = 18;
                } else if (pack.equals("Popcorn")) {
                    price = 25;
                } else {
                    price = 30;
                }

                if (tickets >= 4) {
                    price = price * 0.7;
                }
                break;

            case "Jumanji":
                if (pack.equals("Drink")) {
                    price = 9;
                } else if (pack.equals("Popcorn")) {
                    price = 11;
                } else {
                    price = 14;

                }

                if (tickets == 2) {
                    price = price * 0.85;
                }
                break;

            default:
                break;


        }


        System.out.printf("Your bill is %.2f leva.", price * tickets);
    }
}
