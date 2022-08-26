package Homework.Exercises11;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int goodGradesCount = 0;
        int poorGradesCount = 0;
        int gradeCount = 1;
        double allGradeSum = 0;

        while (goodGradesCount < 12) {

            if (poorGradesCount == 2) {
                break;
            }
            double currentGrade = Double.parseDouble(scan.nextLine());

            if (currentGrade < 4) {
                poorGradesCount++;
                continue;
            }
            goodGradesCount ++;
            gradeCount ++;
            allGradeSum += currentGrade;
        }
        double avgGrade =allGradeSum / goodGradesCount;

        if ( goodGradesCount >= 12){
            System.out.printf("%s graduated. Average grade: %.2f",name, avgGrade);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, gradeCount);
        }
    }
}
