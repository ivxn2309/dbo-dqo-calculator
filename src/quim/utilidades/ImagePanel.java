package quim.utilidades;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    private String urlImage;
    public ImagePanel(String urlImage) {
        super();
        this.urlImage = urlImage;
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        ImageIcon imagen = new ImageIcon(Toolkit.getDefaultToolkit().getImage(urlImage));
        g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
        this.setOpaque(false);
        super.paintComponent(g);
    } 
}
