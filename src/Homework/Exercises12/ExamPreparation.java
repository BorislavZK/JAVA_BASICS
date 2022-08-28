package Homework.Exercises12;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int poorGradeLimit = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int poorGradeCounter = 0;
        boolean isFalse = false;
        double allGradesSum = 0;
        int gradeCounter = 0;
        String lastProblem = "";


        while (!input.equals("Enough")) {

            int grade = scan.nextInt();
            allGradesSum += grade;
            gradeCounter++;
            lastProblem = input;

            if (grade <= 4) {
                poorGradeCounter++;
            }
            double svgScore = allGradesSum / gradeCounter;
            if(poorGradeLimit == poorGradeCounter){
                isFalse = true;
                break;
            }

             if (isFalse){
                 // toi se e provalil
                 System.out.printf("%d", poorGradeCounter);

             }

        }
    }
}
