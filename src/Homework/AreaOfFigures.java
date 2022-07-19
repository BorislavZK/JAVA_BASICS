package Homework;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
