package edu.upc.moo.movil;


import edu.upc.moo.MarcianitosMain;
import edu.upc.moo.gui.Ventana;
import edu.upc.moo.util.GestorObjetos;
import java.awt.Color;
import java.util.HashSet;

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

public class Nave implements ObjetoMovil {
    
    public static final double VELOCIDAD = 0.3;
    
    private double x, y;
    
    private HashSet<Disparo> disparos;
    
    public Nave(double x, double y) {
        this.x = x;
        this.y = y;
        disparos = new HashSet<>();
    }
    
    public void moverYDibujar(Ventana v) {
        if(v.isPulsadoDerecha() && x < MarcianitosMain.TAMANYO_EJES_VISION) {
            x+=VELOCIDAD;
        }
        if(v.isPulsadoIzquierda() && x > -MarcianitosMain.TAMANYO_EJES_VISION) {
            x-=VELOCIDAD;
        }
        if(v.isPulsadoEspacio()) {
            disparos.add(new Disparo(this.x, this.y));
        }
        for(Disparo d : disparos) {
            d.moverYDibujar(v);
        }
        v.dibujaTriangulo(x-0.7, y-0.7, x, y+0.7, x+0.7, y-0.7, Color.WHITE);
    }
    
}
