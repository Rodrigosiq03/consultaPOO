package aula4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite duas palavras e separe-as por um espaço: ");
        String palavra1 = scan.next();
        String palavra2 = scan.nextLine();

        System.out.println(String.format("A primeira palavra é %s e a segunda palavra é %s ", palavra1, palavra2));

        scan.close();

    }

}
