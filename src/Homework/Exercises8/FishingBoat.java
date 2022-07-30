package Homework.Exercises8;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());
        double price = 0;


        //Цената зависи от сезона:
        //Цената за наем на кораба през пролетта е 3000 лв.
        //Цената за наем на кораба през лятото и есента е 4200 лв.
        //Цената за наем на кораба през зимата е 2600 лв.

        //От конзолата се четат точно три реда.
        //Бюджет на групата – цяло число в интервала [1…8000]
        //Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        //Брой рибари – цяло число в интервала [4…18]

        //Ако групата е до 6 човека включително – отстъпка от 10%.
        //Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //Ако групата е от 12 нагоре – отстъпка от 25%.
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.

        switch ("season") {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (fisherman <= 6){
            price = price - (price * 0.10 );

        }else if ( fisherman < 12){
            price = price - ( price * 0.25 );

        }else{

        }

        if ( fisherman % 2 == 0 && !season.equals("Autumn")){
            price = price - ( price * 0.05 );
        }

        if ( budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", budget - price );

        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget );
        }

        //Да се отпечата на конзолата един ред:
        //Ако бюджетът е достатъчен:
        //"Yes! You have {останалите пари} leva left."
        //Ако бюджетът НЕ Е достатъчен:
        //"Not enough money! You need {сумата, която не достига} leva."


    }
}
