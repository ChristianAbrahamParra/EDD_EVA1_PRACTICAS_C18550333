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
        System.out.println("Inicia Main");     //Mensaje Inicio Main
    String sCade = "Hola " + cadena();  //esto queda suspendido y queda almacenado en el stack.
        System.out.println(sCade); //Mensaje que imprime la variable sCade
        System.out.println("Termina Main"); //Mensaje para "Termina Main"
    }
    
    public static String cadena(){ //Método cadena
        System.out.println("Inicia cadena"); //Mensaje "Inicia cadena"
        System.out.println("Termina cadena"); //Mensaje "Termina cadena"
        return "Mundo"; //Regresa el mensaje "Mundo"
    }
}
