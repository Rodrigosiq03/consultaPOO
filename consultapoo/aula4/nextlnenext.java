package aula4;

import java.util.Scanner;

public class nextlnenext {
    public static void main(String[] args) {
        Scanner pica = new Scanner(System.in);
        System.out.println("digite a primeira string: ");
        String s1 = pica.next();
        System.out.println("digite outra: ");
        String s2 = pica.nextLine();
        System.out.println("digitw mais uma: ");
        String s3 = pica.next();

        System.out.println(String.format("s1 = %s\ns2 = %s\ns3 = %s", s1, s2, s3));
        pica.close();
    }

}
