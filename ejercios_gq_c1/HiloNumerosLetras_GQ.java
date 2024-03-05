package com.mycompany.ejercios_gq_c1;
public class HiloNumerosLetras_GQ implements Runnable {

   private int tipo;
   
   // Constructor, usada para inicializar un objeto.
    public HiloNumerosLetras_GQ(int tipo) {
        this.tipo = tipo;
    }
   
    
    @Override
    //Metodo run, es el metodo que ejecuta el codigo cuando inicia el hilo.
    public void run() {
        while (true) {
            switch (tipo) {
                case 1:
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char c = 'a'; c <= 'z'; c++) {
                        System.out.println(c);
                    }
                    break;
            }
        }

    }
    
}
