/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Abraham Parra Pérez
 * # Control: C18550333
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] aiMatriz = new int [3][3]; //matriz con 3x3 elementos --> 9 elementos
        //[FILAS][COLUMNAS]
        /*
        0Fila [][][]
        1Fila [][][]
        2Fila [][][]
        
        */
        
        for( int i=0; i< aiMatriz.length; i++){ //FOR --> Filas
            for(int j=0; j< aiMatriz[i].length; j++){ //FOR ANIDADO --> Columnas
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1); //Se llena con valores aleatorios del 1 al 100
            }
        }
    
        for( int i=0; i< aiMatriz.length; i++){ //FOR --> Filas
            for(int j=0; j< aiMatriz[i].length; j++){ //FOR ANIDADO --> Columnas
                System.out.print("[" + aiMatriz[i][j] + "]"); //Mensaje que imprime la matriz
    }
    System.out.println(""); //Mensaje vacío
}
    }
}
//En un arreglo bidimensional no está almacenado un entero, si no una direcció