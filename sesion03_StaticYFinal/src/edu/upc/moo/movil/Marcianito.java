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
public class Marcianito {
    public static final double SALTO_BAJADA = 0.5;
    public static final double VELOCIDAD_INICIAL = 0.3;
    
    private double x,y;
    
    private double velocidad;
    
    public Marcianito(double x, double y) {
        this.x = x;
        this.y = y;
        velocidad = VELOCIDAD_INICIAL;
    }
    
    public void moverYDibujar(Ventana ventana) {
        x += velocidad;
        if(x > MarcianitosMain.TAMANYO_EJES_VISION || x < -MarcianitosMain.TAMANYO_EJES_VISION) {
            velocidad = -velocidad;
            y -= SALTO_BAJADA;
        }
        
        ventana.dibujaCirculo(x, y, 1, Color.green);
        ventana.dibujaCirculo(x-0.3, y+0.3, 0.2, Color.BLACK);
        ventana.dibujaCirculo(x+0.3, y+0.3, 0.2, Color.BLACK);
    }
    
}
