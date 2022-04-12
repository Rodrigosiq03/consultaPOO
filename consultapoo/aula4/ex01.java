package aula4;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println(String.format("Olá %s. Seu sobrenome é %s", nome, sobrenome));

        scan.close();
    }

}
