package quim;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import quim.gui.MainFrame;

public class Main {

    static boolean loading = true;
    static boolean loadFinish = false;

    public static void main(String[] args) throws InterruptedException {
        loading = true;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Invocación de ventana principal
        java.awt.EventQueue.invokeLater(() -> {
            try {
                MainFrame main = new MainFrame();
                loading = false;
                sleep(10);
                main.setVisible(true);
            }
            catch (IOException | InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
