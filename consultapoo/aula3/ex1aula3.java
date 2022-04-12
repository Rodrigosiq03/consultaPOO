package aula3;

import javax.swing.JOptionPane;

public class ex1aula3 {
    public static void main(String args[]) {
        int n1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qualquer valor: "));
        if (n1 > 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é positivo");
        }
        if (n1 == 0) {
            JOptionPane.showMessageDialog(null, "O valor digitado é neutro");
        }
        if (n1 < 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é negativo");
        }

    }

}
