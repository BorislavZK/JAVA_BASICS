package Homework.ExamPreparation;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        String movie = scan.nextLine();
        String hall = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double price = 0;


        switch (movie){
            case "A Star Is Born":
                if (hall.equals("normal")){
                    price = 7.50;
                } else if (hall.equals("luxury")){
                    price = 10.50;
                } else {
                    price = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (hall.equals("normal")){
                    price = 7.35;
                } else if (hall.equals("luxury")){
                    price = 9.45;
                } else {
                    price = 12.75;
                }
                break;
            case "Green Book":
                if (hall.equals("normal")){
                    price = 8.15;
                } else if (hall.equals("luxury")){
                    price = 10.25;
                } else {
                    price = 13.25;
                }
                break;
            case "The Favourite":
                if (hall.equals("normal")){
                    price = 8.75;
                } else if (hall.equals("luxury")){
                    price = 11.55;
                } else {
                    price = 13.95;
                }
                break;

            default:
                break;


        }

        System.out.printf("%s -> %.2f lv.", movie, price * tickets);


    }


}
