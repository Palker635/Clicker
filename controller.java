import javax.swing.*;
import java.awt.event.ActionEvent;

public class controller {
    view v;

    public controller() {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new view().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        controller c = new controller();
    }


            getButton7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            textPaneRight.setText("Score: " + (clickscore + 1));
        }
    });



}
