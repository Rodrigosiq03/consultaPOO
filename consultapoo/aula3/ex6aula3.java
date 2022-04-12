package aula3;

import javax.swing.JOptionPane;

public class ex6aula3 {
    public static void main(String[] args) {
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número qualquer: "));
        if ((ano % 4 == 0 && ano % 100 > 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "É um ano bissexto");
        } else {
            JOptionPane.showMessageDialog(null, "Não é ano bissexto");
        }
    }

}
