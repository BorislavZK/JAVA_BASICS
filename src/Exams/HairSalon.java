package Exams;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int target = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        double totalIncome = 0;
        boolean flag = false;


        while (!input.equals("closed")) {

            double price = 0;

            String secondOperation = scan.nextLine();

            switch (input) {
                case "haircut":
                    if (secondOperation.equals("mens")) {
                        price = 15;
                    } else if (secondOperation.equals("ladies")) {
                        price = 20;
                    } else {
                        price = 10;
                    }
                    break;

                case "color":
                    if (secondOperation.equals("touch up")) {
                        price = 20;
                    } else {
                        price = 30;
                    }
                    break;
            }

            totalIncome += price;


            if (totalIncome >= target) {
                System.out.println("You have reached your target for the day!");
                flag = true;
                break;
            }

            input = scan.nextLine();

        }

        if(!flag){
            System.out.printf("Target not reached! You need %.0flv. more.\n", target-totalIncome);
        }



        System.out.printf("Earned money: %.0flv.", totalIncome);

        //•	На първия ред:
        //o	Ако Деси е успяла да постигне целта за деня:
        //"You have reached your target for the day!"
        //o	Ако Деси не е успяла да постигне целта за деня:
        //"Target not reached! You need {колко пари не и достигат, за да стигне целта}lv. more."
        //•	На втория ред:
        //	"Earned money: {парите, които е спечелила за деня}lv."


    }
}
