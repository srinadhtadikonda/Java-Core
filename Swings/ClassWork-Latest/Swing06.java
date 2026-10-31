import javax.swing.*;
class Swing01 extends JFrame
{
    public Swing01()
    {
        setTitle("Interest Calculator");
        setSize(300, 325);
        setLayout(null);
        JLabel label1 = new JLabel("Principal Amount:");
        label1.setBounds(20, 20, 150, 20);
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 20, 100, 20);
        add(label1);
        add(textField1);

        JLabel label2 = new JLabel("Rate of Interest:");
        label2.setBounds(20, 60, 150, 20);
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 60, 100, 20);
        add(label2);
        add(textField2);

        JLabel label3 = new JLabel("Time (in years):");
        label3.setBounds(20, 100, 150, 20);
        JTextField textField3 = new JTextField();
        textField3.setBounds(150, 100, 100, 20);
        add(label3);
        add(textField3);
        
        JButton btn1=new JButton("Simple");
        btn1.setBounds(20, 140, 100, 30);
        add(btn1);

        JButton btn2=new JButton("Compound");
        btn2.setBounds(150, 140, 100, 30);
        add(btn2);

        JButton btn3=new JButton("Clear");
        btn3.setBounds(20, 180, 100, 30);
        add(btn3);

        JButton btn4=new JButton("Exit");
        btn4.setBounds(150, 180, 100, 30);
        add(btn4);

        JLabel label4 = new JLabel("Payable:");
        label4.setBounds(20, 220, 150, 20);
        add(label4);
        JLabel label5=new JLabel();
        label5.setBounds(150, 220, 100, 20);
        add(label5);
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
