package aula4;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = scan.next();
        int consulta = 1;

        if ((senha.length() == 4) && (senha.startsWith("A")) || (senha.startsWith("a"))) {
            for (int i = 1; i < senha.length(); i++) {
                if ((senha.charAt(i) == '1') || (senha.charAt(i) == '3') || (senha.charAt(i) == '5')
                        || (senha.charAt(i) == '7') || (senha.charAt(i) == '9')) {
                    consulta = 0;
                } else {
                }
            }
            if (consulta == 0) {
                System.out.println("Senha válida!!!");
            } else {
                System.out.println("Senha inválida!!!");
            }

        } else {
            System.out.println("Senha inválida!!!");
        }
        scan.close();
    }

}
