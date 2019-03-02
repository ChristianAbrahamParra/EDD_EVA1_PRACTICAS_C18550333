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
        
        int[] arreglo = new int [50];
        int pares = 0;
        for(int i = 0; i<arreglo.length; i++){
            arreglo[i] = (int)(Math.random() *100 + 1);
        if(arreglo[i] % 2 == 0){
            pares++;
        }
        }
    int[] par = new int[pares];
    
    pares = 0;
    
    for(int i = 0; i<50; i++){
        if(arreglo[i] % 2 == 0){
            par[pares] = arreglo[i];
            pares++;
        }
    }
    
        System.out.println("\nNúmeros pares del arreglo: ");
        for(int i = 0; i<pares;i++){
            System.out.println(par[i]+" - ");
        }
        System.out.println("");
        
       
    }
    
}
