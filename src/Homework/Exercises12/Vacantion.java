package Homework.Exercises12;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double vacantionPrice = Double.parseDouble(scan.nextLine());
        double moneyOnHand = Double.parseDouble(scan.nextLine());
        int spendDaysCount = 0;
        boolean isFaild = false;
        int allDays = 0;

        while (moneyOnHand < vacantionPrice) {
            String action = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            allDays++;

            switch (action) {
                case "spend":
                    spendDaysCount++;
                    moneyOnHand -= sum;

                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    break;

                case "save":
                    spendDaysCount = 0;
                    moneyOnHand += sum;
                    break;
            }

            if (spendDaysCount == 5) {
                isFaild = true;
                break;
            }


        }

        if (isFaild) {
            System.out.printf("You can't save the money.You can't save the money.\n" +
                    "%d", allDays);

        } else {
            System.out.printf("You saved the money for %d days.", allDays);
        }

    }
}
