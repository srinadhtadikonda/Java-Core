import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargestOfThree extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b1;

    public LargestOfThree() {

        setTitle("Largest of Three Numbers");
        setSize(350, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter First Number:");
        t1 = new JTextField(10);

        l2 = new JLabel("Enter Second Number:");
        t2 = new JTextField(10);

        l3 = new JLabel("Enter Third Number:");
        t3 = new JTextField(10);

        b1 = new JButton("Find Largest");
        b1.addActionListener(this);

        l4 = new JLabel("Result: ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(l4);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());

            int largest;

            if (a >= b && a >= c)
                largest = a;
            else if (b >= a && b >= c)
                largest = b;
            else
                largest = c;

            l4.setText("Largest Number: " + largest);

            JOptionPane.showMessageDialog(this,
                    "Largest Number is: " + largest);

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new LargestOfThree();
    }
}
