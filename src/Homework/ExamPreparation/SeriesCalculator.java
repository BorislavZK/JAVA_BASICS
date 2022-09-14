package Homework.ExamPreparation;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String tvSeries = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double episodeLengthNoAdv = Integer.parseInt(scan.nextLine());

        double totalAdv = episodeLengthNoAdv * 0.20;
        double episodeTotalPlusAd = episodeLengthNoAdv + totalAdv;
        double specialTimeEp = seasons * 10;

        double totalTime = episodeTotalPlusAd * episodes * seasons + specialTimeEp;


        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", tvSeries, totalTime);

    }
}

