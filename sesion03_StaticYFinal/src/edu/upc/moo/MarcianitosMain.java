package edu.upc.moo;

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

import edu.upc.moo.movil.Marcianito;
import edu.upc.moo.movil.Nave;
import edu.upc.moo.gui.Ventana;
import java.awt.Color;

public class MarcianitosMain {
    
    public static final double TAMANYO_EJES_VISION = 10;
    public static final int ANCHO_VENTANA_PIXELS = 60;
    public static final int ALTO_VENTANA_PIXELS = 60;
    
    public static final double X_INICIAL_NAVE = 0;
    public static final double Y_INICIAL_NAVE = -9;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Marcianitos!", ANCHO_VENTANA_PIXELS,ALTO_VENTANA_PIXELS);
        
        Marcianito marcianito = new Marcianito(0,0);

        
        Marcianito otroMarcianito = new Marcianito(3,3);

        
        Nave nave = new Nave(X_INICIAL_NAVE, Y_INICIAL_NAVE);
        
        while(!ventana.isPulsadoEscape()) {
            marcianito.moverYDibujar(ventana);
            otroMarcianito.moverYDibujar(ventana);
            nave.moverYDibujar(ventana);
            ventana.actualizaFotograma();
        }
        
        ventana.cerrar();
        
        
    }
    
}
