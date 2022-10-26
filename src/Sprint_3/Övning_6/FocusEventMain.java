package Sprint_3.Övning_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FocusEventMain extends JFrame {
    JButton knappA = new JButton();
    JButton knappB = new JButton();
    JTextArea areaFörsta = new JTextArea();

    FocusEventMain() {
        setLayout(new BorderLayout());
        add(knappA, BorderLayout.NORTH);
        add(knappB, BorderLayout.SOUTH);
        add(areaFörsta, BorderLayout.CENTER);
        addWindowListener(fönsterLyssnare); // registrera lyssnaren
        areaFörsta.addFocusListener(focusLyssnare);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    WindowAdapter fönsterLyssnare = new WindowAdapter() { // anonym klass
        @Override
        public void windowActivated(WindowEvent e) {
            areaFörsta.requestFocus();
        }
    }; // definitionen av den anonyma klassen ingår i initieringen av variabeln och skall avslutas med ett semikolon

    FocusListener focusLyssnare = new FocusListener() { // anonym klass
        @Override
        public void focusGained(FocusEvent e) {
            if (e.getComponent() == areaFörsta)
                areaFörsta.setBackground(Color.blue);
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (e.getComponent() == areaFörsta)
                areaFörsta.setBackground(Color.white);
        }
    };

    public static void main(String[] args) {
        FocusEventMain focus = new FocusEventMain();
    }
}
/*Konstruera en klass F som ärver JFrame.
Lägg till två knappar och ett textfält (kallat ”Första”)
Konstruera en lyssnare som gör att Första alltid hamnar i fokus när fönstret blir aktivt.
Tips: fönster har metoden requestFocus()
Konstruera sedan en lyssnare till Första som automatiskt gör komponentens bakgrundsfärg till blå
varje gång Första får fokus.*/