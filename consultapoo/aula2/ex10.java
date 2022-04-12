package aula2;

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String args[]) {
        double precofabrica;
        double distribuidor;
        double impostos;
        double precofinal;
        precofabrica = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite o preço de fábrica de um novo carro"));
        distribuidor = precofabrica * 0.28;
        impostos = precofabrica * 0.45;
        precofinal = precofabrica + distribuidor + impostos;
        JOptionPane.showMessageDialog(null, "O preço final desse novo carro seri de " + precofinal);

    }

}
