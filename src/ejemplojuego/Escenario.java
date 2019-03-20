package ejemplojuego;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

public class Escenario extends JComponent implements Constantes {

    public Celda[][] c;
    public int filaJugador = 1;
    public int columnaJugador = 1;
    public Jugador jugador;
 
    public Escenario() {//crea la matriz con las celdas
         this.jugador = new Jugador(this);
        c = new Celda[CANTIDAD_FILAS_ESCENARIO][CANTIDAD_COLUMNAS_ESCENARIO];
        for (int i = 0; i < CANTIDAD_FILAS_ESCENARIO; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_ESCENARIO; j++) {
                c[i][j] = new Celda(j * TAMANO_CELDA, i * TAMANO_CELDA);
            }
        }
        c[filaJugador][columnaJugador].cambiarTipo(TIPO_JUGADOR);//posicion del jugador
        c[5][5].cambiarTipo(TIPO_ENEMIGO);//posicion del enemigo
        for (int i = 0; i < CANTIDAD_FILAS_ESCENARIO; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_ESCENARIO; j++) {
                if (i == 0 || j == 0 || i + 1 == CANTIDAD_FILAS_ESCENARIO || j + 1 == CANTIDAD_COLUMNAS_ESCENARIO) {
                   c[i][j].tipo = TIPO_PARED;
                }
            }
        }

    } 

    @Override
    public void paintComponent(Graphics g) {//pinta todos los componentes de la matriz
        for (int i = 0; i < CANTIDAD_FILAS_ESCENARIO; i++) {
            for (int j = 0; j < CANTIDAD_COLUMNAS_ESCENARIO; j++) {
                c[i][j].paintComponent(g);
            }
        }
    }
//movilidad del cuadrado 

   public void moverJugador(KeyEvent e){
        switch(e.getKeyCode()){  //referencia numerica de la tecla presionada
            
            case KeyEvent.VK_RIGHT: jugador.moverJugadorDerecha(); break; //constantes de la clase, no del objeto
            case KeyEvent.VK_LEFT: jugador.moverJugadorIzquierda(); break;
            case KeyEvent.VK_UP: jugador.moverJugadorArriba(); break;
            case KeyEvent.VK_DOWN: jugador.moverJugadorAbajo(); break;
        
        
        }
    }

}