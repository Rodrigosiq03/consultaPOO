package aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula2 extends JFrame {
    private static JLabel directionsLabel = new JLabel("Digita qlqr coisa ae prc kkkk");
    private static JLabel outputLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Clica aekkkkkkk");

    public static void main(String arsg[]) throws Exception {
        JFrame tela = new JFrame();
        tela.setSize(400, 400);
        tela.setVisible(true);
        tela.setTitle("Testezin");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.setLayout(new FlowLayout());
        tela.getContentPane().add(directionsLabel);
        tela.getContentPane().add(nameBox);
        tela.getContentPane().add(nameBox);
        tela.getContentPane().add(outputLabel);
        tela.getContentPane().add(nameButton);

        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(e);
            }
        });

    }

    public static void buttonClick(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "ta funcionandokkkkkkk", "salvelek", JOptionPane.INFORMATION_MESSAGE);
    }

}
