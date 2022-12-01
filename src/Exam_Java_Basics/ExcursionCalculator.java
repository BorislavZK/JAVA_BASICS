package Exam_Java_Basics;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int peoples = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;


        switch (season){
            case "spring":
                if (peoples <= 5){
                    price = 50.00;
                }else{
                    price = 48.00;
                }
                break;

            case "summer":
                if (peoples <= 5){
                    price = 48.50;
                }else{
                    price = 45.00;
                }
                break;

            case "autumn":
                if (peoples <= 5){
                    price = 60.00;
                }else{
                    price = 49.50;
                }
                break;

            case "winter":
                if (peoples <= 5){
                    price = 86.00;
                }else{
                    price = 85.00;
                }
                break;

            default:
                break;
        }


        double totalPrice = peoples * price;

        if (season.equals("summer")){
            totalPrice *= 0.85;
        }else if ( season.equals("winter")){
            totalPrice *= 1.08;
        }


        System.out.printf("%.2f leva.", totalPrice);





    }


}
