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
        // TODO code application logic here
    System.err.println("Inicio main"); //Mensaje de error
    A(); //parámetro del primer método
    //STACK -- LIFO
    //LIFO -- Last in first out
    }
   
    public static void A(){ //Método A que contiene el inicio A y el fin A
     System.out.println("Inicio A"); //Mensaje de salida "Inicio A"
     System.out.println("Fin A"); //Mensaje de salida "Fin A"
    }
    public static void B(){ //Método B que contiene el inicio B y el fin B
     System.out.println("Inicio B"); //Mensaje de salida "Inicio B"
     C(); // parámetro C del método 
     System.out.println("Fin B"); //Mensaje de salida "Fin B"
    }

    public static void C(){ //Método C quecontiene el inicio C y fin C
        System.out.println("Inicio C"); //Mensaje de salida "Inicio C"
        
        System.out.println("Fin C"); //Mensaje de salida "Fin C"
}
}