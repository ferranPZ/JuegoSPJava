package ejemplojuego;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Lienzo extends Canvas implements KeyListener, Runnable{
    
    public Escenario escenario;
    public boolean corriendo;
    public Thread hilo;
    
    
    
    public Lienzo(){
        this.setFocusable(true); 
        escenario = new Escenario();
        this.setBackground(Color.ORANGE);
        this.addKeyListener(this);
        hilo = new Thread(this);
        start(); 
    }

    
    private synchronized void start() {
        corriendo = true;
        hilo.start();
    }
    
    public synchronized void stop(){
        corriendo = false;
        try{
            hilo.join();
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void paint(Graphics g){
        escenario.paintComponent(g);
    }
    
    @Override
    public void update(Graphics g){
        escenario.paintComponent(g);
    }

    
    @Override
    public void keyTyped(KeyEvent e) { //SOLO funciona con letras no con flechas
    }

    @Override
    public void keyPressed(KeyEvent e) {
        escenario.moverJugador(e); //referencia al objeto no a la clase
        repaint(); //cambiar por update
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void run() {                
        long ultimaVez = System.nanoTime();
        final double fps = 1000000000.0 / 2; 
        double delta = 0;
        requestFocus();
        while(corriendo){
            long ahora = System.nanoTime();
            delta = delta + ((ahora-ultimaVez) /fps);
            ultimaVez = ahora;
            while (delta>=1){
                repaint();
                delta--;
            
            }
            
        }
        
        
        
    }
}