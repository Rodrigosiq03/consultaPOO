package aula3;

import javax.swing.JOptionPane;

public class ex3aula3 {
    public static void main(String args[]) {
        double n1;
        double n2;
        double n3;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um primeiro valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um segundo valor: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um terceiro valor: "));
        if (n2 < n1) {
            if (n3 < n1) {
                JOptionPane.showMessageDialog(null, "O maior valor entre todos os valores é: " + n1);
            }
        }
        if (n3 < n2) {
            if (n1 < n2) {
                JOptionPane.showMessageDialog(null, "O maior valor entre todos os valores é: " + n2);

            }
        }
        if (n1 < n3) {
            if (n2 < n3) {
                JOptionPane.showMessageDialog(null, "O maior valor entre todos os valores é: " + n3);
            }
        }

    }

}
