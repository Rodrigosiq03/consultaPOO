package aula2;

import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String args[]) {
        double salario;
        double reajuste;
        double valor1;
        double valor_final;
        salario = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário que realizaremos um reajuste: "));
        reajuste = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite em decimais (0 até 1) o valor do reajuste"));
        valor1 = salario * reajuste;
        valor_final = salario + valor1;
        JOptionPane.showMessageDialog(null, "O reajuste final é de: " + valor_final);

    }

}
