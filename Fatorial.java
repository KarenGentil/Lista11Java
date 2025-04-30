package lista11;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        long fatorial = 1;

        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
