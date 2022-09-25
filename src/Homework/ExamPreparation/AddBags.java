package Homework.ExamPreparation;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //От конзолата се четат 4 реда:
        //1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        //2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        //3.	Дни до пътуването – цяло число в диапазона [1…60]
        //4.	Брой багажи – цяло число в диапазона [1…10]

        //В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
        //•	повече от 30 дни - цената на багажа се оскъпява с 10%
        //•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
        //•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
        //Напишете програма, която пресмята колко ще трябва да заплати Мими, спрямо горните условия.

        double luggage20plus = Double.parseDouble(scan.nextLine());
        double kgLuggage;
        int daysToTrip = Integer.parseInt(scan.nextLine());
        double luggageCount = Double.parseDouble(scan.nextLine());

        double toTenKilo = luggage20plus * 0.2;
        double tenToTwentyKilo = luggage20plus * 0.5;





    }
}
