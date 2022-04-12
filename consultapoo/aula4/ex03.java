package aula4;

import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {
        String s, aparece;
        int a, b;
        s = JOptionPane.showInputDialog(null, "Digite qualquer coisa: ");
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um outro número: "));
        aparece = s.substring(a, b + 1);
        JOptionPane.showMessageDialog(null, "O que aparece para a string " + s + " é " + aparece);
    }

}
