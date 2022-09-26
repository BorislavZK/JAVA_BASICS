package Homework.ExamPreparation;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double luggage20plus = Double.parseDouble(scan.nextLine());  //1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        double kgLuggage = Double.parseDouble(scan.nextLine());  //2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        int daysToTrip = Integer.parseInt(scan.nextLine());  //3.	Дни до пътуването – цяло число в диапазона [1…60]
        int luggageCount = Integer.parseInt(scan.nextLine());   //4.	Брой багажи – цяло число в диапазона [1…10]

        double toTenKilo = luggage20plus * 0.2;
        double tenToTwentyKilo = luggage20plus * 0.5;
        double price = 0.0;

        if (kgLuggage > 20) {
            price = luggage20plus;
        } else if (kgLuggage >= 10 ) {
            price = tenToTwentyKilo;
        } else {
            price = toTenKilo;
        }

        if (daysToTrip > 30) {
            price = price * 1.1;
        } else if (daysToTrip >= 7) {
            price = price * 1.15;

        } else {
            price = price * 1.4;
        }


        double total = price * luggageCount;

        System.out.printf("The total price of bags is: %.2f lv.", total);

    }
}
