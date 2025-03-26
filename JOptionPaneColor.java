import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

public class JOptionPaneColor {
    public static void main(String args[]) {
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(191, 161, 98));// Fondo del JOptionPane
        UI.put("Panel.background", new ColorUIResource(191, 161, 98));// Fondo del Panel donde va las letras
        UI.put("Label.font", new Font("Arial", Font.BOLD, 20));// Tipo Letra de Mensaje
        UI.put("Button.font", new Font("Arial", Font.BOLD, 20));// Tipo Letra sobre Boton
        UI.put("Label.foreground", Color.BLUE);// Color de Letras en Mensaje
        UI.put("Button.foreground", Color.BLUE);// Color de Letras de Boton
        UI.put("Button.background", Color.YELLOW);// Color de Fondo de Boton

        JOptionPane.showMessageDialog(null, "Mensaje", "Colores en JOptionPane", JOptionPane.INFORMATION_MESSAGE);
    }

}
