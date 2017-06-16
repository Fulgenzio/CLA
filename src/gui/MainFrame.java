package gui;
import javax.swing.JFrame;
import java.awt.*;

public class MainFrame {
    public JFrame getFrame(String title, int width, int height, String operations) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        switch (operations) {
            case "close": {
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;
            }
            case "hide": {
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                break;
            }
            case "nothing": {
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                break;
            }
        }
        return frame;
    }

    public JFrame addGrid(JFrame frame, int rows, int columns) {
        frame.setLayout(new GridLayout(rows, columns));
        return frame;
    }

    
}
