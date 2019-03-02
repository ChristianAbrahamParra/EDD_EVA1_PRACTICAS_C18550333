/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Littl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arreglo = new int[50];
        int menor, mayor;
        int posicion1 = 0, posicion2 = 0 ;
        
        for (int i= 0; i<arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100 +1);
        }
    
    menor=mayor=arreglo[0];
    for(int i = 0; i<50; i++){
        if(arreglo[i]>50){
             mayor = arreglo[i];   
                posicion1 = i;
        }
    if(arreglo[i]<menor){
        arreglo[i] = menor;
        posicion2 = i;
    }
    }
        System.out.println("Valor más grande: " + mayor + "\nPosición: " + posicion1);
        System.out.println("Valor más pequeño: " + menor + "\nPosición: " + posicion2);
    
    }
    
}
