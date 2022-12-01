package Exams;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int processors = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int workingDays = Integer.parseInt(scan.nextLine());


        int workingHours = workers * workingDays * 8;
        double processorsReady = Math.floor(workingHours / 3.00);


        if (processors > processorsReady) {
            double processorsLost = processors - processorsReady;
            double moneyLost = processorsLost * 110.10;
            System.out.printf("Losses: -> %.2f BGN", moneyLost);
        } else {
            double processorsOver = processorsReady - processors;
            double moneyProfit = processorsOver * 110.10;
            System.out.printf("Profit: -> %.2f BGN", moneyProfit);
        }

        //•	Първи ред – броят процесори, които трябва да се изработят – цяло число в интервала [1...500 000]
        //•	Втори ред – броят служители – цяло число в интервала [1...1000]
        //•	Трети ред – работните дни – цяло число в интервала [1...1000]
    }
}
