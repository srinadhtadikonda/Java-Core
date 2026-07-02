import javax.swing.*;

class Swing02 {
    public static void main(String args[]) {
        JFrame J = new JFrame("My App");

        JLabel jlb1 = new JLabel("India");
        jlb1.setBounds(100, 100, 100, 30);

        J.setLayout(null);   // Disable layout manager
        J.add(jlb1);

        J.setSize(400, 500);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setVisible(true);
    }
}