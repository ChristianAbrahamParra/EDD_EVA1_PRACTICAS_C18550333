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
        
        int impares = 0;
        for(int i=0; i<arreglo.length; i++){
            arreglo[i] = (int)(Math.random()*100+1);
            if((arreglo[i] %2) !=0){
                impares++;
            }
        }
        int[] impar = new int[impares];
        impares = 0;
        
        for(int i = 0; i<50; i++){
            if((arreglo[i] % 2) !=0){
                impar[impares] = arreglo[i];
                impares++;
            }
        }
    
        System.out.println("\nNúmeros impares del arreglo: ");
        for(int i = 0; i<impares; i++)
            System.out.println(impar[i]+ " - ");
        System.out.println("");
    }
    
}
