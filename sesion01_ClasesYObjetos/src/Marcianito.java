
import java.awt.Color;

/*------------------------------------------------------------------------------
 * Este código está distribuido bajo una licencia del tipo BEER-WARE.
 * -----------------------------------------------------------------------------
 * Mario Macías Lloret escribió este archivo. Teniendo esto en cuenta,
 * puedes hacer lo que quieras con él: modificarlo, redistribuirlo, venderlo,
 * etc, aunque siempre deberás indicar la autoría original en tu código.
 * Además, si algún día nos encontramos por la calle y piensas que este código
 * te ha sido de utilidad, estás obligado a invitarme a una cerveza (a ser
 * posible, de las buenas) como recompensa por mi contribución.
 * -----------------------------------------------------------------------------
 */
public class Marcianito {
    double x,y;
    
    double velocidad;
    
    Marcianito(double x, double y) {
        this.x = x;
        this.y = y;
        velocidad = -0.3f;
    }
    
    void moverYDibujar(Ventana ventana) {
        x += velocidad;
        if(x > 10 || x < -10) {
            velocidad = -velocidad;
            y -= 0.5;
        }
        
        ventana.dibujaCirculo(x, y, 1, Color.green);
        ventana.dibujaCirculo(x-0.3, y+0.3, 0.2, Color.BLACK);
        ventana.dibujaCirculo(x+0.3, y+0.3, 0.2, Color.BLACK);
    }
    
}
