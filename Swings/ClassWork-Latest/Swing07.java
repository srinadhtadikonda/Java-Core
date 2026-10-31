
import javax.swing.*;
import java.awt.event.*;

class Swing01 extends JFrame
{
    public Swing01()
    {
        setTitle("Interest Calculator");
        setSize(300, 325);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Principal Amount:");
        label1.setBounds(20, 20, 130, 20);
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 20, 100, 20);
        add(label1);
        add(textField1);

        JLabel label2 = new JLabel("Rate of Interest:");
        label2.setBounds(20, 60, 130, 20);
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 60, 100, 20);
        add(label2);
        add(textField2);

        JLabel label3 = new JLabel("Time (in years):");
        label3.setBounds(20, 100, 130, 20);
        JTextField textField3 = new JTextField();
        textField3.setBounds(150, 100, 100, 20);
        add(label3);
        add(textField3);

        JButton btn1 = new JButton("Simple");
        btn1.setBounds(20, 140, 100, 30);
        add(btn1);

        JButton btn2 = new JButton("Compound");
        btn2.setBounds(150, 140, 100, 30);
        add(btn2);

        JButton btn3 = new JButton("Clear");
        btn3.setBounds(20, 180, 100, 30);
        add(btn3);

        JButton btn4 = new JButton("Exit");
        btn4.setBounds(150, 180, 100, 30);
        add(btn4);

        JLabel label4 = new JLabel("Payable:");
        label4.setBounds(20, 220, 100, 20);
        add(label4);

        JLabel label5 = new JLabel();
        label5.setBounds(150, 220, 120, 20);
        add(label5);

        // Simple Interest ActionListener
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double p = Double.parseDouble(textField1.getText());
                    double r = Double.parseDouble(textField2.getText());
                    double t = Double.parseDouble(textField3.getText());

                    double si = (p * r * t) / 100;
                    double amount = p + si;

                    label5.setText(String.format("%.2f", amount));
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null,
                        "Please enter valid numbers!");
                }
            }
        });

        // Compound Interest ActionListener
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double p = Double.parseDouble(textField1.getText());
                    double r = Double.parseDouble(textField2.getText());
                    double t = Double.parseDouble(textField3.getText());

                    double amount = p * Math.pow(1 + r / 100, t);

                    label5.setText(String.format("%.2f", amount));
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null,
                        "Please enter valid numbers!");
                }
            }
        });

        // Clear ActionListener
        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                label5.setText("");
            }
        });

        // Exit ActionListener
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

public class Main
{
    public static void main(String args[])
    {
        new Swing01();
    }
}
