package Sprint_3.JFrame_Demo;

import javax.swing.*;

public class JFrameDemo extends JFrame {

    JFrameDemo() {
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDemo demo = new JFrameDemo();
    }
}