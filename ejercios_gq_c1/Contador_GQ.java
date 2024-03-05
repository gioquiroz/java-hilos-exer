
package com.mycompany.ejercios_gq_c1;

public class Contador_GQ implements Runnable {

    private int contador;
    private String nombre;
    private int limite;

    //Constructor.
    public Contador_GQ(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    //Metodo para ejecución de hilos.
    public void run() {
        //Ciclo con un condicional de parado declarado en la variable limite.
        while(contador <= limite) {
            System.out.println("Hilo " + nombre + ": " + contador);
            //Incremental
            contador++;
        }
        System.out.println("Hilo " + nombre + " ya ha acabado");
    }
    
    
}
