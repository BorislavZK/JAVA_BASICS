package Homework.ExamPreparation;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double trunk = Double.parseDouble(scan.nextLine());
        String suitcases = scan.nextLine();
        int suitcaseCount = 1;
        double currentSuitcase = 0;
        int allSuitcases = 0;
        double suitcase10Addition = 0;

        while(!suitcases.equals("End")){
            currentSuitcase = Double.parseDouble(suitcases);


            if ((suitcaseCount + 1) % 3 == 0){
                suitcase10Addition = currentSuitcase * 0.10;
                allSuitcases += suitcase10Addition;
            }

            allSuitcases += currentSuitcase;
            suitcaseCount ++;

            trunk -= allSuitcases;

            if ( allSuitcases > trunk){
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", suitcaseCount);
                break;
            }

            suitcases = scan.nextLine();
        }
    }
}
