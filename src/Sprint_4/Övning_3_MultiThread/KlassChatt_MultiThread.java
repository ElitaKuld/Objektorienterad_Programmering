package Sprint_4.Övning_3_MultiThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class KlassChatt_MultiThread {
    JFrame frame = new JFrame();
    JPanel basePanel = new JPanel(new BorderLayout());
    JTextArea chattArea = new JTextArea(10, 30);
    JScrollPane scroll = new JScrollPane(chattArea);
    JTextField inputField = new JTextField(10);
    JButton kopplaNerKnapp = new JButton("Koppla ner");
    InetAddress toAdress;
    int toPort;
    MulticastSocket socket;
    InetSocketAddress group;
    NetworkInterface netIf = NetworkInterface.getByName("wlan2");
    String användareNamn;
    KlassChattReceiver receiver;

    public KlassChatt_MultiThread(String användare, String chattAdress, int chattPort) throws IOException {
        användareNamn = användare;
        toAdress = InetAddress.getByName(chattAdress);
        toPort = chattPort;
        group = new InetSocketAddress(toAdress, toPort);
        socket = new MulticastSocket(toPort);

        socket.joinGroup(group, netIf);
        sendMessage("UPPKOPPLAD");
        receiver = new KlassChattReceiver(socket,chattArea);

        frame.add(basePanel);
        basePanel.add(kopplaNerKnapp, BorderLayout.NORTH);
        basePanel.add(scroll, BorderLayout.CENTER);
        basePanel.add(inputField, BorderLayout.SOUTH);
        inputField.addActionListener(listener);
        kopplaNerKnapp.addActionListener(listener);

        frame.setTitle("Sigruns chatt");
        chattArea.setEditable(false);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    ActionListener listener = new ActionListener() { // anonym klass
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ActionPerformed, is EventDispatchThread:"
                    + SwingUtilities.isEventDispatchThread()); // What does it do?

            if (e.getSource() == kopplaNerKnapp) {
                sendMessage("NEDKOPPLAD");
                try {
                    socket.leaveGroup(group, netIf);
                } catch (IOException ie) {
                    socket.close();
                    frame.dispose();
                    System.exit(0);
                }
            }

            if (e.getSource() == inputField) {
                sendMessage(inputField.getText());
                inputField.setText("");
            }
        }
    };

    public void sendMessage(String message) {
        byte[] dataToSend = (användareNamn + ": " + message).getBytes();
        DatagramPacket packet = new DatagramPacket(dataToSend, dataToSend.length, toAdress, toPort);
        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String namn = "Elita";
        KlassChatt_MultiThread chatt = new KlassChatt_MultiThread(namn, "234.235.236.237", 12540);
    }
}
/*Bygg ett grafiskt chattprogram där alla instanser av ditt program, som du kör på din dator, ska kunna
prata med varandra.
Programmet ska bestå av en JTextArea, ett JTextField och en JButton. När du skriver in en rad i din
JTextField och trycker enter ska din rad visas upp både i samma apps JTextArea och också i de andra
apparnas JTextAreor. JTextAreorna ska alltså lyssna på multicast-meddelanden från alla andra appar.
För att träna på trådar: gör lyssnande och sändande i separata trådar.
Knappen ska göra att vi kopplar ner oss från multicast-gruppen.
Använd multicastIP 234.235.236.237 och portnummer 12540.
I mån av tid: Om ni är flera som sitter på samma nätverk kan det eventuellt funka att chatta med
varandra från olika datorer, det beror på om nätverket tillåter multicast eller inte (och ni måste såklart
använda samma multicastIP och portnummer i chatten). Testa gärna att dela nätverk på mobilen och
koppla upp er på det, ibland funkar chattandet då. Hamachi, eller annat virtuellt nätverk, kan också
funka.*/