package lista11;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrimos = 0;

        for (int num = 2; num <= 100; num++) {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                totalPrimos++;
                System.out.println(num);
            }
        }
        System.out.println("Total de primos: " + totalPrimos);

    }
}
