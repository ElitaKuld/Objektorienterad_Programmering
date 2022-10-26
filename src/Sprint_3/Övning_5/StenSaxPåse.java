package Sprint_3.Övning_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StenSaxPåse extends JFrame implements ActionListener {
    JPanel grundPanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel resultatPanel = new JPanel();
    int användarePoäng = 0;
    int datorPoäng = 0;

    JLabel användareLabel = new JLabel("Användaren");
    JButton användareSten = new JButton("Sten");
    JButton användareSax = new JButton("Sax");
    JButton användarePåse = new JButton("Påse");
    JLabel datorLabel = new JLabel("Datorn");
    JButton datorSten = new JButton("Sten");
    JButton datorSax = new JButton("Sax");
    JButton datorPåse = new JButton("Påse");

    JTextArea resultatArea = new JTextArea("Ställningen:\n", 15, 30);
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

        resultatPanel.add(scroll, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final int STEN = 0, SAX = 1, PÅSE = 2;
        int valAnvändare = 0;
        if (e.getSource() == användareSten) {
            valAnvändare = STEN;
            användareSten.setBackground(Color.GREEN);
            användareSax.setBackground(Color.LIGHT_GRAY);
            användarePåse.setBackground(Color.LIGHT_GRAY);
        } else if (e.getSource() == användareSax) {
            valAnvändare = SAX;
            användareSax.setBackground(Color.GREEN);
            användareSten.setBackground(Color.LIGHT_GRAY);
            användarePåse.setBackground(Color.LIGHT_GRAY);
        } else if (e.getSource() == användarePåse) {
            valAnvändare = PÅSE;
            användarePåse.setBackground(Color.GREEN);
            användareSten.setBackground(Color.LIGHT_GRAY);
            användareSax.setBackground(Color.LIGHT_GRAY);
        }

        int valDator = (int) (Math.random() * 3);
        if (valDator == STEN) {
            datorSten.setBackground(Color.CYAN);
            datorSax.setBackground(Color.LIGHT_GRAY);
            datorPåse.setBackground(Color.LIGHT_GRAY);
        } else if (valDator == SAX) {
            datorSax.setBackground(Color.CYAN);
            datorSten.setBackground(Color.LIGHT_GRAY);
            datorPåse.setBackground(Color.LIGHT_GRAY);
        } else {
            datorPåse.setBackground(Color.CYAN);
            datorSten.setBackground(Color.LIGHT_GRAY);
            datorSax.setBackground(Color.LIGHT_GRAY);
        }

        if (valAnvändare == valDator) {
            resultatArea.append("Ingen har vunnit denna gång. Det är jämnt.\n");
        } else if (valAnvändare == STEN && valDator == SAX) {
            användarePoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
        } else if (valAnvändare == STEN && valDator == PÅSE) {
            datorPoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
        } else if (valAnvändare == SAX && valDator == STEN) {
            datorPoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
        } else if (valAnvändare == SAX && valDator == PÅSE) {
            användarePoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
        } else if (valAnvändare == PÅSE && valDator == STEN) {
            användarePoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
        } else if (valAnvändare == PÅSE && valDator == SAX) {
            datorPoäng++;
            resultatArea.append("Användare VS Dator     " + användarePoäng + " - " + datorPoäng + "\n");
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