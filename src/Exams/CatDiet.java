package Exams;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //От конзолата се прочитат 5 реда:
        //•	Процент на мазнините - цяло число в интервала [0…100]
        //•	Процент на протеините - цяло число в интервала [0…100]
        //•	Процент на въглехидратите - цяло число в интервала [0…100]
        //•	Общ брой калории - цяло число в интервала [1000…15000]
        //•	Процент на съдържанието на вода - цяло число в интервала [0…100]

         int fatsPer = Integer.parseInt(scan.nextLine());
         int proteinsPer = Integer.parseInt(scan.nextLine());
         int carbsPer = Integer.parseInt(scan.nextLine());
         int totalCalories = Integer.parseInt(scan.nextLine());
         int waterPer = Integer.parseInt(scan.nextLine());



        //(60 % от  2500) / 9 = 166.6 - общите грамове от мазнини
        double totalFats = ((totalCalories / 100.00) * fatsPer) / 9;

        //(25 % от  2500) / 4 = 156.25 - общите грамове от протеини
        double totalProteins = ((totalCalories / 100.00) * proteinsPer) / 4;

        //(15 % от 2500) / 4 = 93.75 - общите грамове от въглехидрати
        double totalCarbs = ((totalCalories / 100.00) * carbsPer) / 4;

        //Теглото на храната = 166.6 + 156.25 + 93.75 = 416.6 грама
        double totalFoodWeight = totalFats + totalProteins + totalCarbs;

        //Калории за един грам храна = 2500 / 416.6 = 6 калории
        double caloriesOneGramFood = totalCalories / totalFoodWeight;

        //60% от тези 6 калории са вода => остават 100% - 60% = 40 %
        double waterInFood = 100 - waterPer;


        double calories = (caloriesOneGramFood / 100) * waterInFood;

        //В един грам от този тип хранене има
        //40% от 6 = 2.4 калории

        System.out.printf("%.4f", calories);




        
    }
}
