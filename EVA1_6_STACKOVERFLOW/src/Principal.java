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
       
        System.out.println("Inicia Main"); //Mensaje de salida "Inicia Main"
        recursiva(); //Se manda llamar al método recursiva
        System.out.println("Fin main"); //Mensaje de salida "Fin Main"
    }
   
    public static void recursiva(){ //Método llamado recursiva
        recursiva(); // el método provocará el stackoverflow pues es infinito
    }
}
//El tamaño de stack es limitado