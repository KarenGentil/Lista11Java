package lista11;

import java.util.Scanner;

public class Soma1A100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
