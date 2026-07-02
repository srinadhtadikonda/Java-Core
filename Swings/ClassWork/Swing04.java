import javax.swing.*;
import java.awt.event.*;

class Swing04 {
    public static void main(String args[]) {

        JFrame f = new JFrame("Interest Calculator");

        JLabel l1 = new JLabel("Principal:");
        JLabel l2 = new JLabel("Rate (%):");
        JLabel l3 = new JLabel("Time (Years):");
        JLabel result = new JLabel("Result = ");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b1 = new JButton("Simple Interest");
        JButton b2 = new JButton("Compound Interest");

        l1.setBounds(30,30,100,25);
        t1.setBounds(140,30,100,25);

        l2.setBounds(30,70,100,25);
        t2.setBounds(140,70,100,25);

        l3.setBounds(30,110,100,25);
        t3.setBounds(140,110,100,25);

        b1.setBounds(20,160,140,30);
        b2.setBounds(170,160,160,30);

        result.setBounds(30,220,250,30);

        // Simple Interest Button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());

                double si = (p * r * t) / 100;

                result.setText("Simple Interest = " + si);
            }
        });

        // Compound Interest Button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());

                double amount = p * Math.pow((1 + r / 100), t);
                double ci = amount - p;

                result.setText("Compound Interest = " + String.format("%.2f", ci));
            }
        });

        f.setLayout(null);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(result);

        f.setSize(380,320);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
} 
