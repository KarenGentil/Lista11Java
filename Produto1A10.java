package lista11;

import java.util.Scanner;

public class Produto1A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long produto = 1;
        for (int i = 1; i <= 10; i++) {
            produto *= i;
        }
        System.out.println("Produto: " + produto);

    }
}
