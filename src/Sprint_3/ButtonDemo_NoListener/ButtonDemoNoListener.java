package Sprint_3.ButtonDemo_NoListener;

import javax.swing.*;

public class ButtonDemoNoListener extends JFrame {
    JLabel label = new JLabel("Hej!");
    JButton button = new JButton("Tryck här");

    ButtonDemoNoListener() {
        JPanel panel = new JPanel();
        add(panel);
        panel.add(label);
        panel.add(button);
        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ButtonDemoNoListener demo = new ButtonDemoNoListener();
    }
}