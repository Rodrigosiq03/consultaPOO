package aula3;

import javax.swing.JOptionPane;

public class ex5aula3 {
    public static void main(String[] args) {
        int margem;
        margem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 a 12"));
        switch (margem) {
            case 1:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Janeiro, \ncom 31 dias");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Fevereiro, \ncom 30 dias");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Março, com \n31 dias");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Abril, \ncom 30 dias");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Maio, \ncom 31 dias");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Junho, \ncom 30 dias");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Julho, \ncom 31 dias");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Agosto, \ncom 31 dias");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Setembro, \ncom 30 dias");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Outubro, \ncom 31 dias");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Novembro, \ncom 30 dias");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Este númeroi corresponde ao mês de Dezembro, \ncom 31 dias");
                break;
        }
        if ((margem == 0) || (margem > 12)) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
