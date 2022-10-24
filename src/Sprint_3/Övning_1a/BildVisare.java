package Sprint_3.Övning_1a;

import javax.swing.*;

public class BildVisare extends JFrame {

    JLabel label = new JLabel(new ImageIcon("C:\\Users\\46762\\Desktop\\Pumpor\\Bild4.jpg"));
    JButton button = new JButton("Växla bild");

    BildVisare() {
        JPanel panel = new JPanel();
        add(panel);
        panel.add(label);
        panel.add(button);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BildVisare visare = new BildVisare();
    }
}
   /* Gör ett program som innehåller en JLabel som visar upp en av dina bilder och en JButton med
texten ”Växla bild”
        Tips: En JLabel kan ta en ImageIcon som inparameter. ImageIcon tar en sträng (som betecknar
        sökvägen till bilden på din disk) som inparameter.*/