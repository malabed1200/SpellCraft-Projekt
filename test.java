import java.awt.*;
import javax.swing.*;
import java.io.File;

class test {
    public static void main(String[] args) throws Exception {
        // Der Pfad zur Schriftart-Datei auf deinem Computer
        File fontFile = new File("src/Minecraft/Minecraft-Regular.otf");


        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        font = font.deriveFont(Font.PLAIN, 16);

        // Registriere die Schriftart im Grafik-Umfeld
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment()





    }
}

