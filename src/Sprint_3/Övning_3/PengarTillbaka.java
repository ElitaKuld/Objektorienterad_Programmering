package Sprint_3.Övning_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PengarTillbaka extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JPanel översta = new JPanel();
    JPanel mittersta = new JPanel();
    JPanel nedersta = new JPanel();

    JLabel pris = new JLabel("Pris på vara:");
    JLabel betalt = new JLabel("Du betalar:");
    JTextField fieldPris = new JTextField(10);
    JTextField fieldBetalt = new JTextField(10);
    JTextArea areaResultat = new JTextArea("Du ska få tillbaka följande valörer:\n", 5, 30);

    JCheckBox valör1000 = new JCheckBox("1000", false);
    JCheckBox valör500 = new JCheckBox("500", false);
    JCheckBox valör200 = new JCheckBox("200", false);
    JCheckBox valör100 = new JCheckBox("100", false);
    JCheckBox valör50 = new JCheckBox("50", false);
    JCheckBox valör20 = new JCheckBox("20", false);
    JCheckBox valör10 = new JCheckBox("10", false);
    JCheckBox valör5 = new JCheckBox("5", false);
    JCheckBox valör2 = new JCheckBox("2", false);
    JCheckBox valör1 = new JCheckBox("1", false);

    JButton buttonVäxel = new JButton("Beräkna växel");

    PengarTillbaka() {
        add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(översta, BorderLayout.NORTH);
        panel.add(mittersta, BorderLayout.CENTER);
        panel.add(nedersta, BorderLayout.SOUTH);

        översta.setLayout(new GridLayout(2, 2));
        översta.add(pris);
        översta.add(fieldPris);
        översta.add(betalt);
        översta.add(fieldBetalt);

        mittersta.setLayout(new FlowLayout());
        mittersta.add(valör1000);
        mittersta.add(valör500);
        mittersta.add(valör200);
        mittersta.add(valör100);
        mittersta.add(valör50);
        mittersta.add(valör20);
        mittersta.add(valör10);
        mittersta.add(valör5);
        mittersta.add(valör2);
        mittersta.add(valör1);

        nedersta.setLayout(new BorderLayout());
        nedersta.add(buttonVäxel, BorderLayout.CENTER);
        JScrollPane scroll = new JScrollPane(areaResultat);
        nedersta.add(scroll, BorderLayout.SOUTH);

        buttonVäxel.addActionListener(this);

        fieldPris.addActionListener(this);
        fieldBetalt.addActionListener(this);

        valör1000.addActionListener(this);
        valör500.addActionListener(this);
        valör200.addActionListener(this);
        valör100.addActionListener(this);
        valör50.addActionListener(this);
        valör20.addActionListener(this);
        valör10.addActionListener(this);
        valör5.addActionListener(this);
        valör2.addActionListener(this);
        valör1.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int price = Integer.parseInt(fieldPris.getText());
        int amount = Integer.parseInt(fieldBetalt.getText());
        int växel = geVäxel(price, amount);
        int antal;

        if (e.getSource() == buttonVäxel) {
            if (valör1000.isSelected()) {
                antal = växel / 1000;
                areaResultat.append(antal + " 1000-lappar\n");
                växel = växel % 1000;
            }
            if (valör500.isSelected()) {
                antal = växel / 500;
                areaResultat.append(antal + " 500-lappar\n");
                växel = växel % 500;
            }
            if (valör200.isSelected()) {
                antal = växel / 200;
                areaResultat.append(antal + " 200-lappar\n");
                växel = växel % 200;
            }
            if (valör100.isSelected()) {
                antal = växel / 100;
                areaResultat.append(antal + " 100-lappar\n");
                växel = växel % 100;
            }
            if (valör50.isSelected()) {
                antal = växel / 50;
                areaResultat.append(antal + " 50-lappar\n");
                växel = växel % 50;
            }
            if (valör20.isSelected()) {
                antal = växel / 20;
                areaResultat.append(antal + " 20-lappar\n");
                växel = växel % 20;
            }
            if (valör10.isSelected()) {
                antal = växel / 10;
                areaResultat.append(antal + " 10-kronor\n");
                växel = växel % 10;
            }
            if (valör5.isSelected()) {
                antal = växel / 5;
                areaResultat.append(antal + " 5-kronor\n");
                växel = växel % 5;
            }
            if (valör2.isSelected()) {
                antal = växel / 2;
                areaResultat.append(antal + " 2-kronor\n");
                växel = växel % 2;
            }
            if (valör1.isSelected()) {
                antal = växel;
                areaResultat.append(antal + " 1-kronor\n");
            }
            areaResultat.append("\n");
        }
    }

    public int geVäxel(int price, int amount) {
        return amount - price;
    }

    public static void main(String[] args) {
        PengarTillbaka pengar = new PengarTillbaka();
    }
}