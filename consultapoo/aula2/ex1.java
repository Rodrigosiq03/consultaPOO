package aula2;

import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String args[]) {
        // Declaração de variaveis
        double valorcotacao;
        double valorqnt;
        double qntdollar;
        valorcotacao = Double.parseDouble(JOptionPane.showInputDialog("O valor da cotação em dollar é "));
        valorqnt = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais você tem na carteira: "));
        qntdollar = valorqnt / valorcotacao;
        JOptionPane.showMessageDialog(null, "Você tem " + qntdollar + " dollares");

    }

}
