package aula2;

import javax.swing.JOptionPane;

public class ex8 {
        public static void main(String args[]) {
                double eleitores;
                double votosbranco;
                double votosnull;
                double votosvalid;
                double conta1;
                double conta2;
                double conta3;
                double conta4;
                double conta5;
                double conta6;

                eleitores = Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                                "Digite a quantidade de eleitores que existem em seu município: "));
                votosbranco = Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                                "Digite o valor de votos em branco computados na eleição: "));
                votosnull = Double.parseDouble(
                                JOptionPane.showInputDialog(null, "Digite o valor registrado de votos nulos: "));
                votosvalid = Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                                "Digite a quantidade de votos válidos documentados na eleição: "));
                conta1 = votosbranco * 100;
                conta2 = conta1 / eleitores;
                conta3 = votosnull * 100;
                conta4 = conta3 / eleitores;
                conta5 = votosvalid * 100;
                conta6 = conta5 / eleitores;

                JOptionPane.showMessageDialog(null,
                                "A porcentagem de votos em branco foi de " + conta2
                                                + "%, a porcentagem de votos nulos foram de "
                                                + conta4
                                                + "% e a porcentagem de votos válidos desta eleição foram num total de "
                                                + conta6 + "%");

        }

}
