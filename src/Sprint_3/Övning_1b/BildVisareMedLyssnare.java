package Sprint_3.Övning_1b;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BildVisareMedLyssnare extends JFrame implements ActionListener {
    ImageIcon bild = new ImageIcon("C:\\Users\\46762\\Desktop\\Pumpor\\Bild1.jpg");
    ImageIcon bild2 = new ImageIcon("C:\\Users\\46762\\Desktop\\Pumpor\\Bild2.jpg");
    JLabel label = new JLabel(bild);
    JButton button = new JButton("Växla bild");

    BildVisareMedLyssnare() {
        JPanel panel = new JPanel();
        add(panel);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setIcon(bild2);
    }

    public static void main(String[] args) {
        BildVisareMedLyssnare visare = new BildVisareMedLyssnare();
    }
}
   /* Implementera ActionListener-interfacet och fixa så att din JLabel växlar bild vid knapptryckning.
(bara två bilder behövs till att börja med)
*/