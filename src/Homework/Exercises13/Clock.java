package Homework.Exercises13;

public class Clock {
    public static void main(String[] args) {


        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {

                System.out.printf("%02d:%02d\n", h,m);

            }

        }
    }
}
