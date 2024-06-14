import javax.swing.SwingUtilities;

import ui.Windows;

public class App {
    public static void main(String[] args) throws Exception {
        
        Runnable run = () -> new Windows("Mi ventana");
        SwingUtilities.invokeLater(run);
    }
}
