package Exams;

import java.util.Scanner;

public class ChristmasGift {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int adults = 0;
        int kids = 0;
        int toys = 0;
        int sweaters = 0;


        while (!input.equals("Christmas")){

            int age = Integer.parseInt(input);

            //•	Всички до 16 (вкл.) години се считат за деца и ще получат играчка
            //•	Всички над 16 години се считат за възрастни и ще получат коледен пуловер
            //•	Цената на всяка играчка е 5 лв., а цената на един пуловер е 15 лв.

            if (age <= 16){
                kids ++;
            } else {
                adults ++;
            }

            input = scan.nextLine();

        }

        System.out.printf("Number of adults: %d\n", adults);
        System.out.printf("Number of kids: %d\n", kids);
        System.out.printf("Money for toys: %d\n", kids * 5);
        System.out.printf("Money for sweaters: %d", adults * 15);

        //Number of adults: {брой хора над 16 години}"
        //"Number of kids: {брой хора до 16 (вкл.) години}"
        //"Money for toys: {сумата за всички играчки}"
        //"Money for sweaters: {сума за всички пуловери}"
    }
}
