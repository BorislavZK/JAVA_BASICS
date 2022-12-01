package Homework.ExamPreparation;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //От конзолата първо се чете един ред:
        //•	Брой филми, които си е набелязала Деси – цяло число в интервала [1…20]
        //За всеки филм се прочитат два отделни реда:
        //•	Име на филма – текст
        //•	Рейтинг на филма - реално число в интервала [1.00…10.00]


        int n = Integer.parseInt(scan.nextLine());
        String movie = "";
        double rating = 0;

        double minRating = 10000000;
        double maxRating = -1000000;
        double totalRating = 0;

        String movieMax = "";
        String movieMin = "";


        for (int i = 1; i <= n; i++) {

            movie = scan.nextLine();
            rating = Double.parseDouble(scan.nextLine());

            totalRating += rating;

            if (rating > maxRating) {
                maxRating = rating;
                movieMax = movie;
            }

            if (rating < minRating) {
                minRating = rating;
                movieMin = movie;
            }


        }

        System.out.printf("%s is with highest rating: %.1f\n", movieMax, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", movieMin, minRating);
        System.out.printf("Average rating: %.1f", totalRating / n);


    }
}
