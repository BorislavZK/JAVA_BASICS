package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breads = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double breadPrice = 3.20;
        double eggsPrice = 4.35;
        double cookiesPrice = 5.40;
        double paintPrice = (eggs * 12) * 0.15;

        double total = (breads * breadPrice) + (eggs * eggsPrice) + (cookies * cookiesPrice) + paintPrice;

        System.out.printf("%.2f", total);

    }
}
