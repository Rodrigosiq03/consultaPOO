package aula2;

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String args[]) {
        double base;
        double altura;
        double area;
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para a base de um retangulo: "));
        altura = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite um valor agora para a altura deste mesmo retangulo: "));
        area = (base * altura);
        JOptionPane.showMessageDialog(null, "O valor da area deste traingulo é: " + area);

    }

}
