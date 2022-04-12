package aula2;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String args[]) {
        double num;
        double ant;
        double suc;
        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor qualquer: "));
        ant = num - 1;
        suc = num + 1;
        JOptionPane.showMessageDialog(null, "O antecessor do valor digitado é " + ant + " e o seu sucessor é " + suc);

    }

}
