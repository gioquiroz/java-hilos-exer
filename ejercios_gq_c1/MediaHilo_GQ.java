/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercios_gq_c1;

/**
 *
 * @author GIOVANNY Q
 */
public class MediaHilo_GQ extends Thread {
    
    // Llamamos el array de numeros.
    private int[] numeros;
    private int inicio;
    private int fin;
    private double resultado;
    
    // Constructor

    public MediaHilo_GQ(int[] numeros, int inicio, int fin) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
        this.resultado = 0;
    }
    
    @Override
    public void run(){
        
        int suma = 0;
        // No vamos a recorrer desde 0 sino por zonas, solo desde x posición a otra de 250 en 250
        for (int i = inicio; i < fin; i++) {
            
            // Acumulador para suma de zonas recorridas
            suma += numeros[i];
        }
        
        // Se conoce el numero de elementos a recorrer
        this.resultado = (double)  suma /(this.fin - this.inicio);
        
    }

    public double getResultado() {
        return resultado;
    }
    
    
    
    
    
}
