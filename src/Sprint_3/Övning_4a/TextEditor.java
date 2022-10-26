package Sprint_3.Övning_4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;
import java.util.Scanner;

public class TextEditor extends JFrame {
    JPanel grundPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JLabel namnLabel = new JLabel("Filnamn:");
    JTextField namnField = new JTextField(10);
    JButton öppnaButton = new JButton("Öppna");
    JButton sparaButton = new JButton("Spara");
    JButton skrivUtButton = new JButton("Skriv ut");
    JButton avslutaButton = new JButton("Avsluta");

    JTextArea textArea = new JTextArea(20, 50);
    JScrollPane scroll = new JScrollPane(textArea);

    Scanner scan = new Scanner(System.in);

    TextEditor() {
        MyActionListener lyssnare = new MyActionListener();
        add(grundPanel);
        grundPanel.setLayout(new BorderLayout());
        grundPanel.add(northPanel, BorderLayout.NORTH);
        grundPanel.add(southPanel, BorderLayout.SOUTH);

        northPanel.setLayout(new FlowLayout());
        northPanel.add(namnLabel);
        northPanel.add(namnField);
        northPanel.add(öppnaButton);
        northPanel.add(sparaButton);
        northPanel.add(skrivUtButton);
        northPanel.add(avslutaButton);

        southPanel.add(scroll);

        namnField.addActionListener(lyssnare);
        öppnaButton.addActionListener(lyssnare);
        sparaButton.addActionListener(lyssnare);
        skrivUtButton.addActionListener(lyssnare);
        avslutaButton.addActionListener(lyssnare);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == avslutaButton) {
                System.out.println("Du avslutade programmet.");
                System.exit(0);
            }
            if (e.getSource() == öppnaButton) {
                String filNamnÖppna = namnField.getText();
                String rad;
                try (BufferedReader reader = new BufferedReader(new FileReader(filNamnÖppna))) {
                    while ((rad = reader.readLine()) != null) {
                        textArea.append(rad + "\n");
                    }
                } catch (FileNotFoundException exception) {
                    System.out.println("Filen kunde inte hittas");
                    exception.printStackTrace();
                    System.exit(0);
                } catch (IOException exception) {
                    System.out.println("Det gick inte att läsa fil");
                    exception.printStackTrace();
                    System.exit(0);
                } catch (Exception exception) {
                    System.out.println("Något gick fel");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }
            if (e.getSource() == sparaButton) {
                String filNamnSkrivaUt = namnField.getText();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filNamnSkrivaUt, true))) {
                    writer.write(textArea.getText());
                    writer.newLine();
                } catch (FileNotFoundException exception) {
                    System.out.println("Filen kunde inte hittas");
                    exception.printStackTrace();
                    System.exit(0);
                } catch (IOException exception) {
                    System.out.println("Det gick inte att skriva till fil");
                    exception.printStackTrace();
                    System.exit(0);
                } catch (Exception exception) {
                    System.out.println("Något gick fel");
                    exception.printStackTrace();
                    System.exit(0);
                }
            }
            if (e.getSource() == skrivUtButton) {
                try {
                    textArea.print();
                } catch (PrinterException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
    }
}
/*Bygg en TextEditor.
När användaren trycker på ”Öppna” ska den fil som skrivits in i JTextField-rutan öppnas och
innehållet ska visas i stora textytan.
När användaren trycker ”Spara” ska texten i stora textrutan sparas ner till det filnamn som anges i
JTextField-rutan.
När användaren trycker ”Skriv” ska textrutans print-funktion anropas.
När användaren trycker ”Avsluta” ska programmet avslutas.*/