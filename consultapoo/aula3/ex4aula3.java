package aula3;

import javax.swing.JOptionPane;

public class ex4aula3 {
    public static void main(String args[]) {
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor de 1 a 7: "));
        if (num1 == 1) {
            JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Domingo");
        } else {
            if (num1 == 2) {
                JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Segunda-feira");
            } else {
                if (num1 == 3) {
                    JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Terça-feira ");
                } else {
                    if (num1 == 4) {
                        JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Quarta-feira");
                    } else {
                        if (num1 == 5) {
                            JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Quinta-feira");
                        } else {
                            if (num1 == 6) {
                                JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Sexta-feira");
                            } else {
                                if (num1 == 7) {
                                    JOptionPane.showMessageDialog(null, "O número digitado equivale ao dia de Sábado");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
