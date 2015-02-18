package edu.upc.moo.movil;


import edu.upc.moo.MarcianitosMain;
import edu.upc.moo.gui.Ventana;
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
    
    public static final double VELOCIDAD = 0.3;
    
    private double x, y;

    public Nave(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void moverYDibujar(Ventana v) {
        if(v.isPulsadoDerecha() && x < MarcianitosMain.TAMANYO_EJES_VISION) {
            x+=VELOCIDAD;
        }
        if(v.isPulsadoIzquierda() && x > -MarcianitosMain.TAMANYO_EJES_VISION) {
            x-=VELOCIDAD;
        }
        v.dibujaTriangulo(x-0.7, y-0.7, x, y+0.7, x+0.7, y-0.7, Color.WHITE);
    }
    
}
