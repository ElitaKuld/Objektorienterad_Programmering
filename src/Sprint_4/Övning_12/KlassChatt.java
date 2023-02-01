package Sprint_4.Övning_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class KlassChatt {
    JFrame frame = new JFrame();
    JPanel basePanel = new JPanel(new BorderLayout());
    JTextArea chattArea = new JTextArea(10, 30);
    JScrollPane scroll = new JScrollPane(chattArea);
    JTextField inputField = new JTextField(10);
    JButton kopplaNerKnapp = new JButton("Koppla ner");

    private BufferedReader in;
    private PrintWriter out;
    String användareNamn;
    int portNumber = 12540;
    InetAddress adress = InetAddress.getLoopbackAddress();
    Socket socket;
    MultiWriter multiWriter;


    public KlassChatt() throws IOException {
        användareNamn = JOptionPane.showInputDialog(null, "Ange ditt chatt-alias");
        multiWriter = new MultiWriter();

        frame.add(basePanel);
        basePanel.add(kopplaNerKnapp, BorderLayout.NORTH);
        basePanel.add(scroll, BorderLayout.CENTER);
        basePanel.add(inputField, BorderLayout.SOUTH);
        inputField.addActionListener(listener);
        kopplaNerKnapp.addActionListener(listener);

        frame.setTitle(användareNamn + " chatt");
        chattArea.setEditable(false);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            socket = new Socket(adress, portNumber);
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(användareNamn + " : " + "UPPKOPPLAD");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String fromServer;

            while ((fromServer = in.readLine()) != null) {
                chattArea.append(fromServer + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ActionListener listener = new ActionListener() { // anonym klass
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == inputField) {
                try {
                    out.println(användareNamn + " : " + inputField.getText());
                    inputField.setText("");
                } catch (Exception exe) {
                    exe.printStackTrace();
                }
            }

            if (e.getSource() == kopplaNerKnapp) {
                out.println(användareNamn + " : " + "NEDKOPPLAD");
                inputField.removeActionListener(listener);
                kopplaNerKnapp.removeActionListener(listener);
            }
        }
    };

    public static void main(String[] args) throws IOException {
        KlassChatt chatt = new KlassChatt();
    }
}