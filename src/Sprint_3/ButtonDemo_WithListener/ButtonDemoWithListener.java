package Sprint_3.ButtonDemo_WithListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemoWithListener extends JFrame implements ActionListener {
    JLabel label = new JLabel("Hej!");
    JButton button = new JButton("Tryck här");

    ButtonDemoWithListener() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        button.addActionListener(this);
        add(panel);
        panel.add(label);
        panel.add(button);
        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        if (label.getText().equalsIgnoreCase("Hej!"))
            label.setText("Hopp");
        else
            label.setText("Hej på dig!");
    }

    public static void main(String[] args) {
        ButtonDemoWithListener demo = new ButtonDemoWithListener();
    }
}