package aula2;

import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String args[]) {
        int idade;
        int anos;
        int idademedias;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos vc tem? "));
        anos = 365;
        idademedias = idade * anos;
        JOptionPane.showMessageDialog(null, "A idade em dias que vc possui é " + idademedias);

    }

}
