
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

public class Nave {
    float x, y;

    public Nave(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    void moverYDibujar(Ventana v) {
        if(v.isPulsadoDerecha() && x < 10) {
            x+=0.3;
        }
        if(v.isPulsadoIzquierda() && x > -10) {
            x-=0.3;
        }
        v.dibujaTriangulo(x-0.7, y-0.7, x, y+0.7, x+0.7, y-0.7, Color.WHITE);
    }
    
}
