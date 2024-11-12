import java.awt.*;
import javax.swing.*;
import java.io.File;

class test {
    public static void main(String[] args) throws Exception {
        // Der Pfad zur Schriftart-Datei auf deinem Computer
        File fontFile = new File("src/Minecraft/Minecraft-Regular.otf");

        // Font wird aus der lokalen Datei geladen
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        font = font.deriveFont(Font.PLAIN, 16);

        // Registriere die Schriftart im Grafik-Umfeld
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        // Erstelle ein JLabel, um die Schriftart anzuzeigen
        JLabel l = new JLabel("The quick brown fox jumped over the lazy dog. 0123456789");
        l.setFont(font);


    }
}

