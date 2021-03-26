import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        System.out.println("...Début");

        JFrame window = new JFrame("Mon app");
        window.setSize(new Dimension(1200,800));

        //Panel
        JPanel panel1 = new JPanel(new GridLayout(2,1));
        panel1.setBackground(Color.yellow);
        window.add(panel1);

        //Jlabel
        JLabel label1 = new JLabel("");
        label1.setText("Cliquez pour commencer à gagner de l'argent.");
        label1.setFont(new Font("Copper Black", Font.BOLD, 35));
        label1.setSize(100,200);

        label1.setHorizontalAlignment(0);
        label1.setVerticalTextPosition(0);
        panel1.add(label1);

        //Button
        JButton button = new JButton("");
        button.setBackground(Color.red);
        button.addActionListener(new ButtonListenner(label1));
        button.setIcon(new ImageIcon("coin.png"));
        panel1.add(button);

        //Panel
        JPanel panel2 = new JPanel(new GridLayout(2,2));
        //panel1.add(panel2);

        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.pack();
        window.setVisible(true);

        System.out.println("Fin...");
    }
}
