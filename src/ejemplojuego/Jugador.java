/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojuego;


public class Jugador implements Constantes {
    
    public int filaJugador = 0;
    public int columnaJugador = 0;
    
    public Escenario escenario;
    
    public Jugador(Escenario escenario){
        this.filaJugador=1;
        this.columnaJugador = 1;
        this.escenario = escenario;
    }
    
    
         public void moverJugadorDerecha(){
        
        //cuando el enemigo esta a la derecha del jugador, no avanza
            if (columnaJugador!=CANTIDAD_COLUMNAS_ESCENARIO-1){  //cuando esta en la última columna no avanza
          if(escenario.c[filaJugador][columnaJugador+1].obtenerTipo()!=TIPO_ENEMIGO && escenario.c[filaJugador][columnaJugador+1].obtenerTipo()!=TIPO_PARED){
           String tipo = escenario.c[filaJugador][columnaJugador+1].obtenerTipo();
           escenario.c[filaJugador][columnaJugador].cambiarTipo(tipo);
           escenario.c[filaJugador][columnaJugador+1].cambiarTipo(TIPO_JUGADOR);
           columnaJugador++;
            }
      
            }
        }
    
     public void moverJugadorIzquierda(){
     
        //cuando el enemigo esta a la izquierda del jugador, no avanza
             
             
             if (columnaJugador!=0){     //cuando esta en la primera columna no avanza
                  if(escenario.c[filaJugador][columnaJugador-1].obtenerTipo()!=TIPO_ENEMIGO && escenario.c[filaJugador][columnaJugador-1].obtenerTipo()!=TIPO_PARED){
             String tipo = escenario.c[filaJugador][columnaJugador-1].obtenerTipo();
             escenario.c[filaJugador][columnaJugador].cambiarTipo(tipo);
             escenario.c[filaJugador][columnaJugador-1].cambiarTipo(TIPO_JUGADOR);
             columnaJugador--;
            }
        }
    }
     
     public void moverJugadorArriba(){
         
          
         
            if (filaJugador!=0){ 
                if(escenario.c[filaJugador-1][columnaJugador].obtenerTipo()!=TIPO_ENEMIGO && escenario.c[filaJugador-1][columnaJugador].obtenerTipo()!=TIPO_PARED){
            String tipo = escenario.c[filaJugador-1][columnaJugador].obtenerTipo();
            escenario.c[filaJugador][columnaJugador].cambiarTipo(tipo);
            escenario.c[filaJugador-1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
            filaJugador--;
             }
          }   
    }
     
    public void moverJugadorAbajo(){
    
            if (filaJugador!=CANTIDAD_FILAS_ESCENARIO-1){
                 if(escenario.c[filaJugador+1][columnaJugador].obtenerTipo()!=TIPO_ENEMIGO && escenario.c[filaJugador+1][columnaJugador].obtenerTipo()!=TIPO_PARED){
               String tipo = escenario.c[filaJugador+1][columnaJugador].obtenerTipo();
               escenario.c[filaJugador][columnaJugador].cambiarTipo(tipo);
               escenario.c[filaJugador+1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
               filaJugador++;
               }
         }
        
    } 
        
    
}