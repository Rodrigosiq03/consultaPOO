package aula2;

import javax.swing.JOptionPane;

public class exemplo_aula {
    public static void main(String[] Args) {
        double primeirovalor;
        double segundovalor;
        double terceirovalor;
        primeirovalor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        segundovalor = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo valor: "));
        terceirovalor = primeirovalor + segundovalor;
        JOptionPane.showMessageDialog(null, "A soma é " + terceirovalor);

    }
}
