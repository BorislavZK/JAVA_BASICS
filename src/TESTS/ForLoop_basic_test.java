package TESTS;

public class ForLoop_basic_test {
    public static void main(String[] args) {


        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 || i == 1) {
                System.out.println(i);
            }

        }
    }
}
