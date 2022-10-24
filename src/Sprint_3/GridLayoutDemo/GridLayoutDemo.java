package Sprint_3.GridLayoutDemo;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("The frame");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        frame.add(panel);
        panel.add(new JLabel("Hej1"));
        panel.add(new JButton("Tryck här"));
        panel.add(new JLabel("Hej2"));
        panel.add(new JButton("och här"));
        panel.add(new JButton("och här med"));
        panel.add(new JButton("massa knappar"));
        frame.pack();
        frame.setLocation(900, 500);
        frame.setVisible(true);
    }
}