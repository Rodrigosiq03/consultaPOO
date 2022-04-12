package aula5;

import javax.swing.JOptionPane;

public class exemplofor {
    public static void main(String[] args) {
        double nota1, nota2;
        for (int contador = 1; contador <= 5; contador = contador + 1) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua primeira nota: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua segunda nota: "));
            JOptionPane.showMessageDialog(null, "Média: " + (nota1 + nota2) / 2);
            contador = contador++;
        }

    }

}
