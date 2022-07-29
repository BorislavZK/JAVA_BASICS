package Homework.Exercises8;

import java.util.Scanner;
// Da se pregleda i da se razpishe i po drugiq nachin
public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int deg = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        String outfit = "";
        String shoes = "";

        if (10 <= deg && deg <= 18) {
            switch (time) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        } else if (18 < deg && deg <= 24) {
            switch (time) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }

        } else {
            switch (time) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;

            }


        }
        System.out.printf("It's %d degrees, get your %s and %s.", deg, outfit, shoes);

    }
}
