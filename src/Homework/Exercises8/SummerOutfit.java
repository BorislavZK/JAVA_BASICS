package Homework.Exercises8;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int deg = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        //10 <= deg <= 18

        if (deg >= 10 && deg <= 18 ){
        switch (time){
            case "Мorning":
                System.out.printf("It's %.2d degrees, get your Sweatshirt and Sneakers. ", deg );
                break;
            case "Afternoon":
                System.out.printf("It's %.2d degrees, get your Shirt and Moccasins. ", deg );
                break;

        }

    }
}
