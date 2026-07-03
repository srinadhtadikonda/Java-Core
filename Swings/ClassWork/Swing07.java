import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentResult extends JFrame implements ActionListener {

    JLabel[] lbl = new JLabel[14];
    JTextField[] txt = new JTextField[14];
    JButton resultBtn, clearBtn, quitBtn;

    public StudentResult() {

        setTitle("Student Result System");
        setSize(400, 600);
        setLayout(new GridLayout(15, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String labels[] = {
                "SNO", "SNAME", "SCLASS", "SSEC",
                "M1", "M2", "M3", "M4", "M5", "M6",
                "Total", "Average", "Grade", "Pass/Fail"
        };

        for (int i = 0; i < 14; i++) {
            lbl[i] = new JLabel(labels[i]);
            txt[i] = new JTextField();

            // Make output fields read-only
            if (i >= 10) {
                txt[i].setEditable(false);
            }

            add(lbl[i]);
            add(txt[i]);
        }

        resultBtn = new JButton("RESULT");
        clearBtn = new JButton("CLEAR");
        quitBtn = new JButton("QUIT");

        resultBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        quitBtn.addActionListener(this);

        add(resultBtn);
        add(clearBtn);
        add(quitBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resultBtn) {

            try {

                int m1 = Integer.parseInt(txt[4].getText());
                int m2 = Integer.parseInt(txt[5].getText());
                int m3 = Integer.parseInt(txt[6].getText());
                int m4 = Integer.parseInt(txt[7].getText());
                int m5 = Integer.parseInt(txt[8].getText());
                int m6 = Integer.parseInt(txt[9].getText());

                int total = m1 + m2 + m3 + m4 + m5 + m6;
                double avg = total / 6.0;

                txt[10].setText(String.valueOf(total));
                txt[11].setText(String.format("%.2f", avg));

                if (m1 < 35 || m2 < 35 || m3 < 35 ||
                    m4 < 35 || m5 < 35 || m6 < 35) {

                    txt[12].setText("NIL");
                    txt[13].setText("FAIL");

                } else if (avg > 60) {

                    txt[12].setText("A");
                    txt[13].setText("PASS");

                } else if (avg >= 45) {

                    txt[12].setText("B");
                    txt[13].setText("PASS");

                } else {

                    txt[12].setText("C");
                    txt[13].setText("PASS");
                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this,
                        "Please enter valid marks.");
            }

        } else if (e.getSource() == clearBtn) {

            for (int i = 0; i < 14; i++) {
                txt[i].setText("");
            }

        } else if (e.getSource() == quitBtn) {

            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new StudentResult();
    }
}
