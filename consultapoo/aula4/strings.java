package aula4;

import javax.swing.JOptionPane;

public class strings {
    public static void main(String[] args) {
        String n1, n2;
        boolean pinto, bucees;
        pinto = true;
        bucees = false;

        n1 = "rola";
        n2 = "pica";
        if (n1.equals(n2)) {
            JOptionPane.showMessageDialog(null, pinto);
        } else {
            JOptionPane.showMessageDialog(null, bucees);
        }
    }

}