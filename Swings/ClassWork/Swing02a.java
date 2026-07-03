import java.lang.*;
import javax.swing.*;
import java.awt.*;
class Swings02a.java
{
    public static void main(String args[])
    {
        JFrame j=new JFrame("MyApp");
        j.setLayout(null);
        j.setVisible(true);
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jb1=new JLabel("INDIA");
        jb1.setBounds(100,100,300,100);
        j.add(jb1);
        
        JLabel jb2=new JLabel("INDIA");
        jb2.setBounds(100,100,300,200);
        j.add(jb2);
        
    }
}
