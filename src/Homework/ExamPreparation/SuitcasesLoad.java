package Homework.ExamPreparation;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        boolean freeSpace = true;
        int counter = 0;

        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);
            counter++;


            if (counter % 3 == 0) {
                suitcase = suitcase + (suitcase * 0.1);
            }

            if (capacity < suitcase) {
                System.out.printf("No more space!%n");
                freeSpace = false;
                counter--;
                break;
            }

            capacity -= suitcase;
            input = scan.nextLine();
        }

        if (freeSpace) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);


    }
}
