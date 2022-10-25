package Sprint_3.Övning_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StenSaxPåse extends JFrame implements ActionListener {
    JPanel grundPanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel resultatPanel = new JPanel();

    JLabel användareLabel = new JLabel("Användaren");
    JButton användareSten = new JButton("Sten");
    JButton användareSax = new JButton("Sax");
    JButton användarePåse = new JButton("Påse");
    JLabel datorLabel = new JLabel("Datorn");
    JButton datorSten = new JButton("Sten");
    JButton datorSax = new JButton("Sax");
    JButton datorPåse = new JButton("Påse");

    JButton resultatButton = new JButton("Beräkna resultat");
    JTextArea resultatArea = new JTextArea("Ställningen:\n", 5, 30);
    JScrollPane scroll = new JScrollPane(resultatArea);

    StenSaxPåse() {
        add(grundPanel);
        grundPanel.setLayout(new BorderLayout());
        grundPanel.add(gamePanel, BorderLayout.NORTH);
        grundPanel.add(resultatPanel, BorderLayout.SOUTH);

        gamePanel.setLayout(new GridLayout(4, 2));
        gamePanel.add(användareLabel);
        gamePanel.add(datorLabel);
        gamePanel.add(användareSten);
        gamePanel.add(datorSten);
        gamePanel.add(användareSax);
        gamePanel.add(datorSax);
        gamePanel.add(användarePåse);
        gamePanel.add(datorPåse);

        användareSten.addActionListener(this);
        användareSax.addActionListener(this);
        användarePåse.addActionListener(this);

        resultatPanel.setLayout(new BorderLayout());
        resultatPanel.add(resultatButton, BorderLayout.NORTH);
        resultatPanel.add(scroll, BorderLayout.SOUTH);

        resultatButton.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == användareSten) {
            användareSten.setBackground(Color.GREEN);
            /*Container container = ((Container) e.getSource()).getParent();
            Component component = container.getComponent(0);
            container.getComponent(1).setBackground(Color.BLUE);*/
        }
    }

    public static void main(String[] args) {
        StenSaxPåse game = new StenSaxPåse();
    }
}
/*Skriv ett program som spelar Sten, sax, påse.
Gör ett program med 2 uppsättningar ”Sten, sax, påse”-knappar (en uppsättning för användaren och en
för datorn)
När användaren trycker på en knapp på sin sida, låt då datorn slumpmässigt välja en av sina knappar.
Låt de valda knapparna ändra färg för att markera att de valts
Sedan ska programmet avgöra vem som vann beroende på vilka knappar trycktes på och visa
meddelande om detta.
Låt programmet hålla reda på poängen och skriv ut ställningen efter varje spel.
*/