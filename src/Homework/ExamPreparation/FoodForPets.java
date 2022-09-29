package Homework.ExamPreparation;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int days = Integer.parseInt(scan.nextLine());
        double food = Double.parseDouble(scan.nextLine());
        double foodTotalEaten = 0; // vsichkata izqdena hrana
        double biscuitTotal = 0; // vsichki izqdeni biskviti
        double totalDogEaten = 0; // total kuche
        double totalCatEaten = 0; // total kotka

        for (int i = 1; i < days; i++) {

            double foodTogetherEaten = 0; //nuliram dnevnata hrana.
            double biscuits = 0; // nuliram biskvitite

            int dogsFood = Integer.parseInt(scan.nextLine()); //chete kolko e izqlo kucheto
            int catsFood = Integer.parseInt(scan.nextLine()); // chete kolko e izqla kotkata

            foodTogetherEaten += (dogsFood + catsFood);  // izqdeno za edin den
            foodTotalEaten += foodTogetherEaten; // obshto izqdenata hrana
            totalDogEaten += dogsFood; // total na kucheto
            totalCatEaten += catsFood; // total na kotkata

            //BISKVITITE
            if (days % 2 == 0 && days != 0){
                biscuits = ( foodTogetherEaten * 0.1);  // 10% ot izqdenata hrana za denq
                biscuitTotal += biscuits; // obshto izqdeni biskviti
                foodTotalEaten += biscuits; // kum total izqdenata hrana dobavqm biskvitite
            }

            //На конзолата да се отпечатват четири реда:
            //•	"Total eaten biscuits: {количество изядени бисквитки}gr."
            //•	"{процент изядена храна}% of the food has been eaten."
            //•	"{процент изядена храна от кучето}% eaten from the dog."
            //•	"{процент изядена храна от котката}% eaten from the cat."
            //Количеството изядени бисквитки трябва да бъде закръглено до най – близкото
            // цяло число, а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.

        }

        double dogPer = (totalDogEaten / foodTotalEaten) * 100; // procent izqdena hrana na kucheto
        double catPer = (totalCatEaten / foodTotalEaten) * 100; // procent izqdena hrana na kotkata
        double totalEatenPer = (foodTotalEaten / food) * 100;

        System.out.printf("Total eaten biscuits: %d gr.\n", Math.round(biscuitTotal));
        System.out.printf("%.2f%% of the food has been eaten.\n", totalEatenPer);
        System.out.printf("%.2f%% eaten from the dog.\n", dogPer);
        System.out.printf("%.2f%% eaten from the cat.", catPer);


    }
}
