package Sprint_3.Övning_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventMain extends JFrame {
    JButton theButton = new JButton("THE BUTTON");

    MouseEventMain() {
        add(theButton);
        theButton.addMouseListener(musLyssnare);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseAdapter musLyssnare = new MouseAdapter() { // anonym klass
        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getComponent() == theButton)
                theButton.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getComponent() == theButton)
                theButton.setBackground(Color.WHITE);
        }
    };

    public static void main(String[] args) {
        MouseEventMain mouse = new MouseEventMain();
    }
}
/*Gör ett program med en JButton.
Skriv en muslyssnare som kan kopplas till knappen.
Fixa så att knappens bakgrundsfärg blir röd varje gång man drar musen över knappen.
*/