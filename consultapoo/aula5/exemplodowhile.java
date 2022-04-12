package aula5;

import javax.swing.JOptionPane;

public class exemplodowhile {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        int contador = 1;
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua primeira nota: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua segunda nota: "));
            JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
            contador = contador++;
        } while (contador <= 5);

    }

}
