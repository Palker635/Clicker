import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    view v;
    int clickscore = 0;
    int clickbonus = 0;

    public controller() {

        v = new view();
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(v.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700, 500));
        frame.pack();
        frame.setVisible(true);



        v.getButton7().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickscore = clickscore + clickbonus + 1;
                v.getTextPaneRight().setText("Score: " + clickscore);
                System.out.println(clickscore);
            }
        });


    }


    public static void main(String[] args) {
        controller c = new controller();
    }

}
