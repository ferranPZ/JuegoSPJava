package ejemplojuego;


import java.awt.Container;
import javax.swing.JFrame;

public class Ventana extends JFrame implements Constantes{
    public Ventana(){
        super(TITULO_APP);
        this.setSize(ANCHO_VENTANA, ALTO_VENTANA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lienzo l = new Lienzo();
     
        Container cp = this.getContentPane();
        cp.add(l);
    }
}
















