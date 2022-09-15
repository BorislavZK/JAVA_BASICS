package Homework.ExamPreparation;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int controlMinutes = Integer.parseInt(scan.nextLine());
        int controlSeconds = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        int secondFor100Meters = Integer.parseInt(scan.nextLine());


        int controlMinToSecTotalTime = controlMinutes * 60 + controlSeconds;

        double decrease = length / 120;
        double timeDecrease = decrease * 2.5;

        double marinsTime = (length / 100) * secondFor100Meters - timeDecrease;

        if (marinsTime <= controlMinToSecTotalTime) {

            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", marinsTime);

        } else {

            System.out.printf("No, Marin failed! He was %.3f second slower.", marinsTime - controlMinToSecTotalTime);
        }


    }
}
