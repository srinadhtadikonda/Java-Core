import java.lang.*;
import javax.swing.*;
class Swing01 extends JFrame 
{
    public Swing01() 
    {
        setTitle("Swing01");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel("Hello, Swing!");
        add(label1);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
 public   class Main
    {
    public static void main(String[] args) 
    {
        new Swing01();
    }
}
