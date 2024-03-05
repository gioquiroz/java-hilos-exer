package com.mycompany.threads_6;

public class hiloContador extends Thread {
    
    private int id; // Identificador del hilo
    private Threads_6 counter; // Objeto Threads_6 para contar
    private int n; // Número hasta el que contar

    public hiloContador(int id, int n, Threads_6 counter) {
        this.id = id; // Inicializa el identificador del hilo
        this.counter = counter; // Inicializa el objeto Threads_6
        this.n = n; // Inicializa el número hasta el que contar
    }
    
    @Override
    public void run() {
        // Verifica si el objeto Threads_6 está sincronizado
        if (this.counter.isSincronizado()) {
            this.counter.mostrarNumerosSincronizado(id, n); // Llama al método sincronizado para mostrar números
        } else {
            this.counter.mostrarNumerosNoSincronizado(id, n); // Llama al método no sincronizado para mostrar números
        }
    }   
}

