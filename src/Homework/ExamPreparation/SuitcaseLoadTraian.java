package Homework.ExamPreparation;
import java.util.Scanner;

public class SuitcaseLoadTraian {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double capacity = Double.parseDouble(scanner.nextLine());
            String input = scanner.nextLine();
            int counter = 0;
            boolean freeSpace = true;

            while (!input.equals("End")) {
                double suitcase = Double.parseDouble(input);
                counter++;
                if (counter % 3 == 0) {
                    suitcase *= 1.1;
                }
                if (capacity < suitcase) {
                    System.out.printf("No more space!%n");
                    freeSpace = false;
                    counter--;
                    break;
                }

                capacity -= suitcase;
                input = scanner.nextLine();
            }
            if (freeSpace) {
                System.out.println("Congratulations! All suitcases are loaded!");
            }
            System.out.printf("Statistic: %d suitcases loaded.", counter);
        }
    }
}
