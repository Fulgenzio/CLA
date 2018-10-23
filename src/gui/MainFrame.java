package gui;
import enums.AlignmentsEnum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    public JFrame getFrame() {
        JFrame frame = new JFrame("CLA");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addPanel(frame);
        JButton newGameButton = new JButton("New Game");
        newGameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newGameButtonPressed(frame);
            }
        });
        JButton loadGameButton = new JButton("Load Game");
        loadGameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadGameButtonPressed(frame);
            }
        });
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quitButtonPressed(frame);
            }
        });
        frame.add(newGameButton);
        frame.add(loadGameButton);
        frame.add(quitButton);
        //frame.add(new JComboBox<>(AlignmentsEnum.getValuesArray()));
        frame.setLayout(new FlowLayout());
        frame.getContentPane();
        frame.setVisible(true);
        return frame;
    }

    private void newGameButtonPressed(JFrame frame){
        frame.setVisible(false);
        getCharacterCreationFrame(frame);
    }

    private void loadGameButtonPressed(JFrame frame) {}

    private void quitButtonPressed(JFrame frame){
        frame.dispose();
    }

    private JFrame getCharacterCreationFrame(JFrame inheritFrame) {
        JFrame charCreationFrame = new JFrame("Character Creation");
        charCreationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        charCreationFrame.setSize(inheritFrame.getSize());
        charCreationFrame.setLayout(new FlowLayout());
        addPanel(charCreationFrame);
        charCreationFrame.add(new JComboBox<>(AlignmentsEnum.getValuesArray()));
        charCreationFrame.setVisible(true);
        return charCreationFrame;
    }

    private void addGrid(JFrame frame, int rows, int columns) {
        frame.setLayout(new GridLayout(rows, columns));
    }

    private void addPanel(JFrame frame) {
        frame.add(new JPanel());
    }

}
