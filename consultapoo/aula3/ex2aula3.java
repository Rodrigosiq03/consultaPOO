package aula3;

import javax.swing.JOptionPane;

public class ex2aula3 {
    public static void main(String args[]) {
        double a;
        double b;
        double c;
        double delta;
        double xunico;
        double x1;
        double x2;
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor qualquer para a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor qualquer para b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor qualquer para c: "));
        if (a != 0) {
            delta = (b * b) - 4 * (a * c);
            if (delta > 0) {
                x1 = (b * -1) + Math.sqrt(delta) / 2 * a;
                x2 = (b * -1) - Math.sqrt(delta) / 2 * a;
                JOptionPane.showMessageDialog(null, "O valor da primeira raiz é: " + String.format("%.2f", x1));
                JOptionPane.showMessageDialog(null, "O valor da segunda raiz é: " + String.format("%.2f", x2));
            } else if (delta == 0) {
                xunico = (b * -1) + Math.sqrt(delta) / 2 * a;
                JOptionPane.showMessageDialog(null, "O valor da unica raiz é: " + String.format("%.2f", xunico));
            } else {
                JOptionPane.showMessageDialog(null, "Não existem raizes para essa expressão :(");
            }
        } else {

            JOptionPane.showMessageDialog(null, "A expressão não é de segundo grau!");
        }

    }

}
