import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3, b4, b5;

    public BasicCalculator() {

        setTitle("Basic Calculator");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        l1 = new JLabel("Enter A:");
        l2 = new JLabel("Enter B:");
        l3 = new JLabel("Result:");

        // Text Fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        // Buttons
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");
        b5 = new JButton("Modulus");

        // Add Action Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        // Add Components
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        add(l3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1) {
                result = a + b;
            }
            else if (e.getSource() == b2) {
                result = a - b;
            }
            else if (e.getSource() == b3) {
                result = a * b;
            }
            else if (e.getSource() == b4) {

                if (b == 0) {
                    JOptionPane.showMessageDialog(this,
                            "Error: Division by zero is not allowed.");
                    return;
                }

                result = a / b;
            }
            else if (e.getSource() == b5) {

                if (b == 0) {
                    JOptionPane.showMessageDialog(this,
                            "Error: Modulus by zero is not allowed.");
                    return;
                }

                result = a % b;
            }

            l3.setText("Result: " + result);

        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numeric values.");
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Unexpected Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new BasicCalculator();
    }
}
