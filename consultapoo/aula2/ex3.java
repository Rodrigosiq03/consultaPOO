package aula2;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String args[]) {
        double precounit;
        double qntvenda;
        double valorvend;
        precounit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço unitario do produto: "));
        qntvenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade vendida: "));
        valorvend = precounit * qntvenda;
        JOptionPane.showMessageDialog(null, "O valor da comissão obtido foi " + valorvend * 0.05);

    }

}
