package ejemplojuego;

import java.awt.Graphics;
import javax.swing.JComponent;

public class Celda extends JComponent implements Constantes {

    public int x = 0, y = 0; // crea las variables x, y con x=0 e y=0 que corresponden a la ubicación inicial
    public String tipo = "V";// crea un string de tipo vacio
    

    public Celda(int x, int y) {//llama por parametros a la posición x e y
        this.x = x;
        this.y = y;
        
    }

    public void cambiarTipo(String tipo) {//intercambia las posiciones del jugador
        this.tipo = tipo;

    }

    public String obtenerTipo() {//retorna al valor que corresponde la celda al cambiar de posicion
        return this.tipo;
    }

    @Override
    public void paintComponent(Graphics g) {//imagen o color que van a tener las celdas
        switch (this.tipo) {
            case TIPO_JUGADOR:
                g.drawImage(VACIO, x, y, this);
                g.drawImage(JUGADOR, x, y, null);
                break;
            case TIPO_ENEMIGO:
                g.drawImage(ENEMIGO, x, y, null);
                break;
            case TIPO_VACIO:
                g.drawImage(VACIO, x, y, null);
                break;
            case TIPO_PARED:
                g.drawImage(PARED, x, y, null);
                break;
        }

    }

}