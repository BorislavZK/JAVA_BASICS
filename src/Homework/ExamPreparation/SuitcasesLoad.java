package Homework.ExamPreparation;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double trunk = Double.parseDouble(scan.nextLine());
        String suitcases = scan.nextLine();
        int suitcaseCount = 0;
        int currentSuitcase = 0;
        int allSuitcases = 0;
        double suitcase10Addition = 0;

        while(!suitcases.equals("End")){
            currentSuitcase = Integer.parseInt(suitcases);
            allSuitcases += currentSuitcase;
            suitcaseCount ++;

            if (suitcaseCount % 3 == 0){
                suitcase10Addition = currentSuitcase * 0.10;
                allSuitcases += suitcase10Addition;
            }

            suitcases = scan.nextLine();
        }
    }
}
