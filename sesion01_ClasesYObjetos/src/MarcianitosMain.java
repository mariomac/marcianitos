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

import java.awt.Color;

public class MarcianitosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Marcianitos!", 500,500);
        Marcianito marcianito = new Marcianito(0,0);

        
        Marcianito otroMarcianito = new Marcianito(3,3);

        
        Nave nave = new Nave(0,-9);
        
        while(!ventana.isPulsadoEscape()) {
            marcianito.moverYDibujar(ventana);
            otroMarcianito.moverYDibujar(ventana);
            nave.moverYDibujar(ventana);
            ventana.actualizaFotograma();
        }
        
        ventana.cerrar();
        
        
    }
    
}
