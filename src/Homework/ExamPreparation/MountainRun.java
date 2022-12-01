package Homework.ExamPreparation;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine()); //Рекордът в секунди
        double distance = Double.parseDouble(scan.nextLine()); //Разстоянието в метри
        double timeInSeconds = Double.parseDouble(scan.nextLine()); //Времето в секунди

        double timeForClimbing = distance * timeInSeconds;
        double delay = Math.floor((distance / 50)) * 30;

        double totalTime = timeForClimbing + delay;

        if (record > totalTime) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(record - totalTime));
        }


    }
}
