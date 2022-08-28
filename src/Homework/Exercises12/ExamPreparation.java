package Homework.Exercises12;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int poorGradeLimit = Integer.parseInt(scan.nextLine());
        int poorGradeCounter = 0;
        boolean isFalse = false;
        double allGradesSum = 0;
        int gradeCounter = 0;
        String lastProblem = "";

        String input = scan.nextLine();
        while (!input.equals("Enough")) {

            int grade = Integer.parseInt(scan.nextLine());

            allGradesSum += grade;
            gradeCounter++;
            lastProblem = input;

            if (grade <= 4) {
                poorGradeCounter++;
            }

            if (poorGradeLimit == poorGradeCounter) {
                isFalse = true;
                break;
            }

            input = scan.nextLine();


        }

        double avgScore = allGradesSum / gradeCounter;


        if (isFalse) {
            System.out.printf("You need a break, %d poor grades.", poorGradeCounter);


        } else {

            System.out.printf("Average score: %.2f\n", avgScore);
            System.out.printf("Number of problems: %d\n", gradeCounter);
            System.out.printf("Last problem: %s\n", lastProblem);

        }
    }
}