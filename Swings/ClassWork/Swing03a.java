import javax.swing.*;
import java.awt.event.*;

class Swing03 {
    public static void main(String args[]) {

        JFrame f = new JFrame("Rectangle Area Calculator");

        JLabel l1 = new JLabel("Length:");
        JLabel l2 = new JLabel("Breadth:");
        JLabel result = new JLabel("Area = ");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton b = new JButton("Calculate");

        // Set positions
        l1.setBounds(30, 30, 80, 25);
        t1.setBounds(120, 30, 100, 25);

        l2.setBounds(30, 70, 80, 25);
        t2.setBounds(120, 70, 100, 25);

        b.setBounds(70, 120, 120, 30);

        result.setBounds(30, 170, 200, 25);

        // Button click event
        b.addActionListener((ActionEvent e) -> {
            int length = Integer.parseInt(t1.getText());
            int breadth = Integer.parseInt(t2.getText());
            
            int area = length * breadth;
            
            result.setText("Area = " + area);
        });

        f.setLayout(null);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(300, 280);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
