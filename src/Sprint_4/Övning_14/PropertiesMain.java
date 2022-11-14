package Sprint_4.Övning_14;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain extends JFrame {

    PropertiesMain() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/Sprint_4/Övning_14/PropertiesMain.properties"));
            //properties.loadFromXML(new FileInputStream("src/Sprint_4/Övning_14/PropertiesMain.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String message = properties.getProperty("message", "Hello world!");
        JLabel label = new JLabel(message, JLabel.CENTER); // placering av texten på en label
        add(label);
        label.setOpaque(true);
        String fontName = properties.getProperty("fontName", "Serif");
        String fontStyle = properties.getProperty("fontStyle", "PLAIN");
        int ifFontStyle;
        if (fontStyle.equals("BOLD")) {
            ifFontStyle = Font.BOLD;
        } else if (fontStyle.equals("ITALIC")) {
            ifFontStyle = Font.ITALIC;
        } else ifFontStyle = Font.PLAIN;

        int fontSize = Integer.parseInt(properties.getProperty("fontSize", "24"));
        label.setFont(new Font(fontName, ifFontStyle, fontSize));
        setSize(500,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PropertiesMain prop = new PropertiesMain();
    }
}
/*Konstruera ett eget litet Swing-program som läser in olika värden från en properties-fil. Låt
programmet åtminstone läsa in sin storlek och ett meddelande att skriva ut.
*/