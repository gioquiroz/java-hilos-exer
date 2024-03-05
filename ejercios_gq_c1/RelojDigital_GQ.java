
package com.mycompany.ejercios_gq_c1;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RelojDigital_GQ extends Observable implements Runnable{
    
    // Atributos
    private int horas, minutos, segundos;
    
    // Constructor
    public RelojDigital_GQ(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public void run() {
        
        String tiempo;
        
        // Try Cath se usa para notificar errores.
        try {
            // Bucle sin validador solo para que permita ingresar de una vez a los condicionales
            while(true){
                tiempo = "";

                // Se agrega un string "0", para las horas del 1 al 9 para que el reloj conserve el mismo formato de 2 digitos.
                if(horas < 10){
                    tiempo += "0" + horas;
                }else {
                    tiempo += horas;
                }

                tiempo+= ":";

                // Se agrega un string "0", para las horas del 1 al 9 para que el reloj conserve el mismo formato de 2 digitos.
                if(minutos < 10){
                    tiempo += "0" + minutos;
                }else {
                    tiempo += minutos;
                }

                // Separador entre cada tiempo del reloj
                tiempo += ":";

                // Se agrega un string "0", para las horas del 1 al 9 para que el reloj conserve el mismo formato de 2 digitos.
                if(segundos < 10){
                    tiempo += "0" + segundos;
                }else {
                    tiempo += segundos;
                }

                // Notificadores de cambio que se muestra a todos los Observers que hayan dentro.
                this.setChanged();
                
                //Este evento notifica que algo cambio al Observer
                this.notifyObservers(tiempo);
                this.clearChanged();
                
                // Velocidad de recorrido en el hilo
                Thread.sleep(1000);

                segundos++;
                   
                // Condicional Ciclico para determinar el incremento del tiempo y simular el reloj.
                if(segundos == 60){
                    minutos++;
                    segundos = 0;
                    if(minutos == 60){
                        minutos = 0;
                        horas++;
                        if(horas == 24){
                            horas = 0;
                        }
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RelojDigital_GQ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
