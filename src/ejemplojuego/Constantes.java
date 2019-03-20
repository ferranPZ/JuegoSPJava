package ejemplojuego;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public interface Constantes {
    public final String TITULO_APP = "Juego IA";
    
    public final int TAMANO_CELDA = 40;
     
    public final int CANTIDAD_FILAS_ESCENARIO = 10;
    public final int CANTIDAD_COLUMNAS_ESCENARIO = 15;
    
    public final int ANCHO_VENTANA  = (CANTIDAD_COLUMNAS_ESCENARIO * TAMANO_CELDA+40);
    public final int ALTO_VENTANA = (CANTIDAD_FILAS_ESCENARIO * TAMANO_CELDA+40);
    
    public final String TIPO_JUGADOR = "J";
    public final String TIPO_VACIO = "V";
    public final String TIPO_ENEMIGO = "E";
    public final String TIPO_PARED = "P";
    public final String TIPO_RECOMPENSA = "R";
    
 
    
    public final Color COLOR_VACIO = Color.GREEN;
    public final Color COLOR_JUGADOR = Color.BLUE;
    public final Color COLOR_ENEMIGO = Color.RED;
    
    public final Image JUGADOR = new ImageIcon("res/jugador.png").getImage();
    public final Image PARED = new ImageIcon("res/pared.png").getImage();
    public final Image VACIO = new ImageIcon("res/vacio.png").getImage();
    public final Image OBSTACULO = new ImageIcon("res/obstaculo.png").getImage();
    public final Image ENEMIGO = new ImageIcon("res/enemigo.png").getImage();
  
   
}