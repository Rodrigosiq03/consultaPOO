package aula4;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner saaaaaaaaaaaaas = new Scanner(System.in);
        System.out.println("Digite seu nome desgraçado: ");
        String nome = saaaaaaaaaaaaas.next();
        System.out.println("Digite sua idade filhadaputa: ");
        int idade = saaaaaaaaaaaaas.nextInt();
        System.out.println("Digite seu peso gordao: ");
        double peso = saaaaaaaaaaaaas.nextDouble();

        System.out.println(String.format("Me chamo %s, tenho %d anos e peso %.2f", nome, idade, peso));
        saaaaaaaaaaaaas.close();
    }

}
