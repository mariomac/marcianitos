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
import java.util.HashSet;
import java.util.Random;

public class MarcianitosMain {
    
    public static final double TAMANYO_EJES_VISION = 10;
    public static final int ANCHO_VENTANA_PIXELS = 500;
    public static final int ALTO_VENTANA_PIXELS = 500;
    
    public static final double X_INICIAL_NAVE = 0;
    public static final double Y_INICIAL_NAVE = -9;

    public static final double Y_INICIAL_MARCIANOS = 9;

    public static final double ESPACIO_VERTICAL_ENTRE_MARCIANOS = 2;
    
    public static final int MARCIANOS_INICIALES = 15;
    
    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Marcianitos!", ANCHO_VENTANA_PIXELS,ALTO_VENTANA_PIXELS);
        
        HashSet<Marcianito> escuadron = new HashSet<Marcianito>();
        for(int i = 0 ; i < MARCIANOS_INICIALES ; i++) {
            escuadron.add(new Marcianito(
                            RND.nextDouble()*2*TAMANYO_EJES_VISION-TAMANYO_EJES_VISION,
                            Y_INICIAL_MARCIANOS + i * ESPACIO_VERTICAL_ENTRE_MARCIANOS));
        }
        
        Nave nave = new Nave(X_INICIAL_NAVE, Y_INICIAL_NAVE);
        
        while(!ventana.isPulsadoEscape()) {
            for(Marcianito m : escuadron) {
                m.moverYDibujar(ventana);
            }
            nave.moverYDibujar(ventana);
            ventana.actualizaFotograma();
        }
        
        ventana.cerrar();
        
        
    }
    
}
