package lista11;

import java.util.Scanner;

public class Divisiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                contador++;
                System.out.println(i);
            }
        }
        System.out.println("Total divisíveis por 3: " + contador);

    }
}
