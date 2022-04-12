package aula5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= n1; i++) {
            fatorial = i * fatorial;
        }
        System.out.println("O fatorial de " + n1 + " é " + fatorial);

        scan.close();

    }

}
