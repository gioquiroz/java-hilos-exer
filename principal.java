package com.mycompany.threads_6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class principal {

    public static void main(String[] args) {
        try {
            boolean sincronizado = true; // Variable para indicar si se debe usar el método sincronizado

            Threads_6 c = new Threads_6(sincronizado); // Crea una instancia de Threads_6

            hiloContador h1 = new hiloContador(1, 5, c); // Crea un hilo con id 1 y n=5
            hiloContador h2 = new hiloContador(2, 10, c); // Crea un hilo con id 2 y n=10

            h1.start(); // Inicia el hilo 1
            h2.start(); // Inicia el hilo 2

            h1.join(); // Espera a que termine el hilo 1
            h2.join(); // Espera a que termine el hilo 2

            System.out.println("Fin Programa"); // Imprime un mensaje de fin de programa
        } catch (InterruptedException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

    

