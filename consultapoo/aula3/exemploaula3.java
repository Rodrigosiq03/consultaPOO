package aula3;

import javax.swing.JOptionPane;

public class exemploaula3 {
    public static void main(String args[]) {
        int idade;
        int nasci;
        nasci = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu ano de nascimento"));
        idade = 2022 - nasci;
        String consulta = ((idade >= 16 && idade < 18) || (idade > 70)) ? "É OPCIONAL" : "É OBRIGATÓRIO";
        JOptionPane.showMessageDialog(null, consulta);
    }

}
