package aula2;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String args[]) {
        double valor1;
        double valor2;
        double valor3;
        double valor4;
        double resultado;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um segundo valor: "));
        valor3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um terceiro valor: "));
        valor4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um quarto valor: "));
        resultado = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3) + (valor4 * valor4);
        JOptionPane.showMessageDialog(null, resultado);

    }
}
