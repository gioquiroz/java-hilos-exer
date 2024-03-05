 
package com.mycompany.ejercios_gq_c1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercios_GQ_C1 {

    public static void main(String[] args) {
        
            /* 1.  
            Aqui se escribe los metodos para iniciar el *Ejercicio 1*
            <<<<<<<<<<  >>>>>>>
            
            //Instanciamos 2 nuevos objetos a partir de la super clase HiloNumerosLetras_GQ.
            HiloNumerosLetras_GQ h1 = new HiloNumerosLetras_GQ(1);
            HiloNumerosLetras_GQ h2 = new HiloNumerosLetras_GQ(2);
            
            //Creamos 2 hilos con la objeto de la clase Thread, que nos va permitir
            Thread t1 = new Thread(h1);
            Thread t2 = new Thread(h2);
            
            //Iniciar los 2 hilos, llamando al metodo run().
            // Cada uno ejecuta su metodo, cada uno tiene su propia ejecución.
            // Lo que quiere decir que inicial al tiempo y se imprime el que primero ingrese.
            // Se recomienda el uso del metodo start ya que se puede manipular tambien para que pare el hilo.
            t1.start();
            t2.start();
            
            <<<<<<<<<<<<  >>>>>>> */
            
            
            
            /* 2.
            Aqui se escribe metodos de ejecución *Ejercicio 2*
            <<<<<<<<<<<<< >>>>>>>>>>>>
            
            //Instanciamos 4 nuevos objetos a partir de la super clase Contador_GQ,
            Contador_GQ c1 = new Contador_GQ("Contador 1", 40);
            Contador_GQ c2 = new Contador_GQ("Contador 2", 50);
            Contador_GQ c3 = new Contador_GQ("Contador 3", 20);
            Contador_GQ c4 = new Contador_GQ("Contador 4", 70);
            
            //Declaramos la clase Thread que nos permite manipular el Hilo.
            Thread t1 = new Thread(c1);
            Thread t2 = new Thread(c2);
            Thread t3 = new Thread(c3);
            Thread t4 = new Thread(c4);
            
            // Iniciador de hilo
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            
        try { 
            // Metodo join(), espera a que el hilo termine para poder continuar con el flujo del programa, sin necesidad de que sea vayan en orden.
            // Lo que significa es que cada uno se seguira ejecutando hasta su limite, y allí si termina.
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercios_GQ_C1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fin del prgrama");
            
            <<<<<<<<<<< >>>>>>>>>>>>>>
        */
            
            
            
        /* 5.*/
        int[] numeros = new int[1000];
        
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = i;
            
        }
        MediaHilo_GQ mh1 = new MediaHilo_GQ(numeros, 0, 250);
        MediaHilo_GQ mh2 = new MediaHilo_GQ(numeros, 250, 500);
        MediaHilo_GQ mh3 = new MediaHilo_GQ(numeros, 500, 750);
        MediaHilo_GQ mh4 = new MediaHilo_GQ(numeros, 750, 1000);
        
        mh1.start();
        mh2.start();
        mh3.start();
        mh4.start();
        
        
        try {
            
            // Se declara el metodo JOIN para poder esperar a que cada hilio termine y se pueda hacer la medaia.
            mh1.join();
            mh2.join();
            mh3.join();
            mh4.join();
            
            double r1 = mh1.getResultado();
            double r2 = mh2.getResultado();
            double r3 = mh3.getResultado();
            double r4 = mh4.getResultado();
            
            double media = (r1 + r2 + r3 + r4) / 4;
            System.out.println("Media: " + media);
            
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
