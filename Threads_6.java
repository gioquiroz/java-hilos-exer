package com.mycompany.threads_6;

public class Threads_6 {
    
    private boolean Threads_6; // Variable que no parece estar siendo utilizada correctamente, parece ser un error
    
    public Threads_6(boolean Threads_6){
        this.Threads_6 = Threads_6; // Inicializa la variable Threads_6
    }

    public boolean isSincronizado() {
        return Threads_6; // Devuelve el valor de Threads_6
    }
    
    // Método sincronizado para mostrar números en la consola
    public synchronized void mostrarNumerosSincronizado(int id, int n){
        System.out.println("Inicio hilo "+ id); // Imprime el inicio del hilo
        for (int i = 0; i <= n; i++) {
            System.out.println(i); // Imprime los números del 0 al n
        }
        System.out.println("Fin hilo "+ id); // Imprime el fin del hilo
    }
        
    // Método no sincronizado para mostrar números en la consola
    public void mostrarNumerosNoSincronizado(int id, int n){
        System.out.println("Inicio hilo "+ id); // Imprime el inicio del hilo
        for (int i = 0; i <= n; i++) {
            System.out.println(i); // Imprime los números del 0 al n
        }
        System.out.println("Fin hilo "+ id); // Imprime el fin del hilo
    }
}
