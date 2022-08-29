package Homework.Exercises12;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int steps = 0;


        while (steps < goal) {

            String input = scan.nextLine();

            if (input.equals("Going home")){

                int homeSteps = Integer.parseInt(scan.nextLine());
                steps += homeSteps;
                break;
            }
            steps += Integer.parseInt(input);

        }

        if (steps >= goal){
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", Math.abs(steps - goal));
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}
