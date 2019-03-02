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
        //System.out.println(Integer.MAX_VALUE);
        int[] aiDatos = new int[21]; // Arreglo de tipo entero con un número elevado de elementos para mostrar la eficiencia
        
        for(int i = 0; i < aiDatos.length; i++){ //Ciclo for para empezar a llenar el arreglo
            for(int j= 0; j < aiDatos.length; j++) //Ciclo for anidado para guardar los valores del arreglo
                
            
            aiDatos[j] = (int)(Math.random() * 100 + 1); //Valores aleatorios se guardan en la variable aiDatos[j], del 1 al 100
        }
        
    }
    
}

//Recursividad: Propiedad de un método de llamarse a sí mismo
