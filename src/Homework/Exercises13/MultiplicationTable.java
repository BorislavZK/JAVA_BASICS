package Homework.Exercises13;

public class MultiplicationTable {
    public static void main(String[] args) {


        for (int x = 1; x <= 10 ; x++) {
            for (int y = 1; y <= 10 ; y++) {
                int product = y * x;

                System.out.printf("%d * %d = %d\n", y, x, product);

            }

        }
    }
}
