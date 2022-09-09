package Homework.Exercises14;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jury = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalGrades = 0;
        int countGrades =0;

        while(!input.equals("Finish")){
            String presentationName = input;
            double sumCurrentPresentationGrade = 0;
            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                countGrades++;
                sumCurrentPresentationGrade +=grade;
            }
             totalGrades += sumCurrentPresentationGrade;

            System.out.printf("%s - %.2f.\n", presentationName, sumCurrentPresentationGrade / jury);

            input = scan.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalGrades / countGrades );


    }
}
