import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                result.append(i).append("\t");
            }
        }
        System.out.print(result);
    }

    private static boolean checkPrime(int number) {
        boolean check = true;
        if (number <= 1) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
        }
        return check;


    }
}
