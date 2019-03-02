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
      
        int [][] aiMatriz = new int [3][]; //10 arreglos de tipo entero //length representa la primera, osea 10. Si no podemoss la segunda, tenemos que especificar uno por uno
        aiMatriz[0] = new int[15]; //La primer posición tiene tamaño de 15
        aiMatriz[1] = new int[3]; //La segunda posición tiene tamaño de 3
        aiMatriz[2] = new int[100]; //La tercera posición tiene tamaño de 100
        System.out.println(aiMatriz); //Se imprime la matriz 
        System.out.println(aiMatriz[0]); //Se imprime la matriz de primera posición
        System.out.println(aiMatriz[1]); //Se imprime la matriz de segunda posición
        System.out.println(aiMatriz[2]); //Se imprime la matriz de tercera posición
        System.out.println(aiMatriz[0][0]); //Se imprime la matriz de posición columna 0 y fila 0
        
        for (int i = 0; i < aiMatriz.length; i++){ //Ciclo for para la primer matriz
            for (int j = 0; j < aiMatriz[i].length; j++){ //Ciclo for anidado
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1); //Valores aleatorios del 1 al 100
            }
        }
        
        for (int[] aiMatriz1 : aiMatriz) { //Se recorrer los valores dentro de la matriz
            for(int b: aiMatriz1){ //Ciclo for anidado para los valores de la otra matriz
                System.out.print("[" + b + "]"); //Se imprimen los valores
            }
            System.out.println(""); //Mensaje vacío
        }
    
    }
    
}
