package Sprint_4.Övning_4b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class VäderRapportSensor_Multicast extends JFrame implements ActionListener {
    JPanel basPanel = new JPanel(new BorderLayout());
    JPanel inputPanel = new JPanel(new GridLayout(2,2));
    JLabel stadLabel = new JLabel("Vilken stad befinner du dig i?");
    JLabel temperaturLabel = new JLabel("Vilken temperatur är det just nu?");
    JTextField stadField = new JTextField(10);
    JTextField temperaturField = new JTextField(10);
    JButton knappEnter = new JButton("Enter / Skicka din väderrapport");

    InetAddress toAdress = InetAddress.getByName("234.234.234.234");
    int toPort = 32335;
    MulticastSocket socket = new MulticastSocket();

    public VäderRapportSensor_Multicast() throws IOException {
        add(basPanel);
        this.setTitle("Väderrapport");
        basPanel.add(inputPanel, BorderLayout.NORTH);
        basPanel.add(knappEnter, BorderLayout.SOUTH);
        inputPanel.add(stadLabel);
        inputPanel.add(stadField);
        inputPanel.add(temperaturLabel);
        inputPanel.add(temperaturField);

        knappEnter.addActionListener(this);

        setSize(500,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == knappEnter) {
            String stad = stadField.getText();
            String temperatur = temperaturField.getText();
            byte[] data = ("Stad: " + stad + ", temperatur: " + temperatur).getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
            try {
                socket.send(packet);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            stadField.setText("");
            temperaturField.setText("");
        }
    }

    public static void main(String[] args) throws IOException {
        VäderRapportSensor_Multicast väder = new VäderRapportSensor_Multicast();
    }
}
/*Gör en multicast-variant av vädersystemet I uppgift 4a.
Låt varje sändarprogram bestå av ett litet Swingprogram där användaren skriver in stad och temp i två
JTextFields
När användaren trycker enter skickas stad och temp till mottagarprogrammet
Låt mottagaren också vara ett litet Swingprogram, som skriver ut sina mottagna meddelanden i en
JTextArea
Mottagaren ska lyssna till en multicast adress och kunna ta emot data från hela klassens sändare.*/