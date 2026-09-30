import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener 
{

    JLabel l1, l2, l3;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextFieldExample() {

        JFrame f = new JFrame();

        // Labels
        l1 = new JLabel("First Number:");
        l1.setBounds(50, 20, 100, 20);

        l2 = new JLabel("Second Number:");
        l2.setBounds(50, 70, 100, 20);

        l3 = new JLabel("Result:");
        l3.setBounds(50, 120, 100, 20);

        // Text Fields
        tf1 = new JTextField();
        tf1.setBounds(150, 20, 100, 20);

        tf2 = new JTextField();
        tf2.setBounds(150, 70, 100, 20);

        tf3 = new JTextField();
        tf3.setBounds(150, 120, 100, 20);
        tf3.setEditable(false);

        // Buttons
        b1 = new JButton("+");
        b1.setBounds(70, 170, 60, 40);

        b2 = new JButton("-");
        b2.setBounds(150, 170, 60, 40);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Add components
        f.add(l1);
        f.add(tf1);

        f.add(l2);
        f.add(tf2);

        f.add(l3);
        f.add(tf3);

        f.add(b1);
        f.add(b2);

        // Frame settings
        f.setSize(320, 280);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int c = 0;

        if (e.getSource() == b1) {
            c = a + b;
        }
        else if (e.getSource() == b2) {
            c = a - b;
        }

        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
