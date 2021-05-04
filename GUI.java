import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JButton button1;
    private JButton button6;
    private JButton button5;
    private JButton button2;
    private JButton button4;
    private JButton button3;
    public JTextPane textPane1;
    private JButton button7;

    String clickscore;

    public GUI() {
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            textPane1.setText("Score: " + (clickscore + 1));



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().textPane1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}