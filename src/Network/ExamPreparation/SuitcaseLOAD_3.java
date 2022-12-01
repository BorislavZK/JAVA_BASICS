package Network.ExamPreparation;

import java.util.Scanner;

public class SuitcaseLOAD_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double capacity = Double.parseDouble(scan.nextLine());
        int counter = 1;

        while(true){
            String input = scan.nextLine();

            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }

            double suitcaseVol = Double.parseDouble(input);

            if (counter % 3 == 0) {
                System.out.println("in");
                suitcaseVol += suitcaseVol * 0.1;
            }

            if (capacity < suitcaseVol) {
                System.out.println("No more space!");
                System.out.println("Capacity: "+capacity);
                System.out.println("SuitcaseVolume: "+suitcaseVol);
                break;
            }

            capacity -= suitcaseVol;
            counter++;
        }

        System.out.printf("Statistic: %d suitcases loaded.\n", counter-1);

        scan.close();
    }
}
