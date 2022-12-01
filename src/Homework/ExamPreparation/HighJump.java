package Homework.ExamPreparation;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        int currentHeight = height - 30;

        int totalJumps = 0;
        boolean failed = false;

        int counterFailed = 0;

        while (!failed) {
            int jump = scanner.nextInt();
            totalJumps++;

            if (jump <= currentHeight) {
                counterFailed++;
                if (counterFailed == 3) {
                    failed = true;
                }
            } else {
                if (currentHeight >= height) {
                    break;
                }
                currentHeight += 5;
                counterFailed = 0;
            }
        }

        if (!failed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumps);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumps);
        }

    }
}