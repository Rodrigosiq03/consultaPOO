package aula5;

import java.io.IOException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int contador = 0;
        for (int i = 1; i <= n + 1; i = i + 1) {
            if (n % i == 0) {
                System.out.println(n + " é divisivel por " + i);
                contador = contador + 1;
            }
        }
        if (contador > 2) {
            System.out.println(n + " foi divisivel " + contador + " vezes, por isso ele NAO É PRIMO");
        } else if (contador == 2) {
            System.out.println(n + " foi divisivel apenas " + contador + " vezes, por isso ELE É PRIMO");
        } else {
            System.out.println(n + " foi divisivel apenas " + contador + " vez, por isso ele NAO É  PRIMO");
        }
        scan.close();
    }

}
