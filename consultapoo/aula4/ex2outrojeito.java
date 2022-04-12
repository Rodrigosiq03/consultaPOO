package aula4;

import javax.swing.JOptionPane;

public class ex2outrojeito {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(null, "Digite uma senha: ");
        if (senha.length() == 4) {
            if ((senha.charAt(0) == 'a') || (senha.charAt(0) == 'A')) {
                boolean contemImpar = false;
                for (int posicao = 1; posicao < senha.length() && !contemImpar; posicao++) {
                    int numero = Integer.parseInt(senha.substring(posicao, posicao + 1));
                    if (numero % 2 == 1) {
                        contemImpar = true;
                    }
                }
                if (contemImpar) {
                    JOptionPane.showMessageDialog(null, "Bem vindo!!", "SENHA VÁLIDA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há números ímpares!!", "SENHA INVÁLIDA",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não inicia com a ou A", "SENHA INVÁLIDA",
                        JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "senha nao possui 4 caracteres", "Senha Inválida!",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

}
