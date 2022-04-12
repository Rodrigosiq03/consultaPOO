package aula2;

import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String args[]) {
        int idadeano;
        int idademes;
        int idadedias;
        int tt;
        int tt2;
        int tt3;
        idadeano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos vc tem: "));
        idademes = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite quantos meses vc tem além dos anos ditos: "));
        idadedias = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite quantos dias também, alem dos anos e meses: "));
        tt = idadeano * 365;
        tt2 = idademes * 30;
        tt3 = tt + tt2 + idadedias;
        JOptionPane.showMessageDialog(null, "Sua em idade total em dias é " + tt3);

    }

}
