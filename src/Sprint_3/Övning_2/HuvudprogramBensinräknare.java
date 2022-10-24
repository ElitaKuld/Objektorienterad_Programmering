package Sprint_3.Övning_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HuvudprogramBensinräknare extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JLabel nutid = new JLabel("Ange mätarställning nu:");
    JLabel dåtid = new JLabel("Ange mätarställning för ett år sedan:");
    JLabel förbrukadBensin = new JLabel("Ange antal liter förbrukad bensin:");
    JTextField fieldNutid = new JTextField(10);
    JTextField fieldDåtid = new JTextField(10);
    JTextField fieldBensin = new JTextField(10);

    JLabel antalMil = new JLabel("Antal körda mil:");
    JLabel antalFörbrukadBensin = new JLabel("Antal liter bensin:");
    JLabel bensinPerMil = new JLabel("Förbrukning per mil:");

    HuvudprogramBensinräknare() {
        add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);
        northPanel.setLayout(new GridLayout(3, 2));
        southPanel.setLayout(new GridLayout(1,3));

        northPanel.add(nutid);
        northPanel.add(fieldNutid);
        northPanel.add(dåtid);
        northPanel.add(fieldDåtid);
        northPanel.add(förbrukadBensin);
        northPanel.add(fieldBensin);

        fieldNutid.addActionListener(this);
        fieldDåtid.addActionListener(this);
        fieldBensin.addActionListener(this);

        southPanel.add(antalMil);
        southPanel.add(antalFörbrukadBensin);
        southPanel.add(bensinPerMil);

        setSize(500,150);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double nutid = Double.parseDouble(fieldNutid.getText());
        double dåtid = Double.parseDouble(fieldDåtid.getText());
        double förbrukadBensin = Double.parseDouble(fieldBensin.getText());
        antalMil.setText("Antal körda mil: " + (nutid - dåtid));
        antalFörbrukadBensin.setText("Antal liter bensin: " + förbrukadBensin);
        bensinPerMil.setText("Förbrukning per mil: " + (förbrukadBensin / (nutid - dåtid)));
    }

    public static void main(String[] args) {
        HuvudprogramBensinräknare huvud = new HuvudprogramBensinräknare();
    }
}
/*Skriv programmet som visas på bilden, som frågar efter mätarställning nu, mätarställning för ett år
sedan och bensinförbrukning under året.
Låt var och en av ovanstående värden representeras av en JTextField med en JLabel bredvid.
När användaren har skrivit in värden i alla tre rutor, skriv ut antal körda mil, antal liter bensin som
förbrukades under året och förbrukningen per mil.
Scanner kan användas för parsning av doubles*/