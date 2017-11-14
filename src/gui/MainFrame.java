package gui;
import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public JFrame getFrame(String title, int width, int height, FrameOperationsEnum operation) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        switch (operation.getValue()) {
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

    public void addGrid(JFrame frame, int rows, int columns) {
        frame.setLayout(new GridLayout(rows, columns));
    }

    public void addButtons(JFrame frame, int btnNumber) {
        for (int i = 0; i <= btnNumber; i++) {
            frame.add(JButton);
        }
    }
}
