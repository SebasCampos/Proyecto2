
package secondpro;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 */
public class MovimientoPreguntas {
    
    int x;
    int y;
    JPanel tablero;
    
    MovimientoPreguntas(JPanel miTab){
        this.x = 0;
        this.y = 0;
        this.tablero = miTab;
    }
    
    public void dibujar(Graphics g, int xi, int yi, String direccion){
        this.x = xi;
        this.y = yi;
        ImageIcon user = new ImageIcon(direccion);
        
    }

    
}
