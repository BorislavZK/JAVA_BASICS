package Homework;

import java.util.Scanner;

public class FishTank_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int L = Integer.parseInt(scan.nextLine());
        int W = Integer.parseInt(scan.nextLine());
        int H = Integer.parseInt(scan.nextLine());
        double SP = Double.parseDouble(scan.nextLine());

        int tankVolume = L * W * H;
        double Liters = tankVolume / 1000.0;
        double Vol = SP / 100.0;
        double WaterNeeded = Liters * (1 - Vol);

        System.out.println(WaterNeeded);
    }
}
