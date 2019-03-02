/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Abraham Parra Pérez
 *  # control:  C18550333
 */
public class Principal {

    
    public static void main(String[] args) {
     
        Principal pObj = new Principal(); //La variable almacena la dirección, new es por un objeto
        Principal pObj2 = new Principal(); //Segundo objeto
        System.out.println(pObj); //Mensaje de salida con el primer objeto
        System.out.println(pObj2); //Mensaje de salida con el segundo objeto
        
        Principal pCopia = pObj; // De la clase Principal se iguala el objeto a una copia
        System.out.println(pCopia); //Mensaje de salida de la copia
        
        pObj = null; //Se iguala el primer objeto con valor nulo
        pObj2 = null; //Se iguala el segundo objeto con valor nulo
        System.out.println(pObj); //Mensaje de salida con el primer objeto
        System.out.println(pObj2); //Mensaje de salida con el segundo objeto
        System.out.println(pCopia); //Mensaje de salida con la copia
        
    }
    
}
//Si hay una variable apuntando el objeto, ese objeto sobrevive
//GARBAGE COLLECTOR -- SE ENCARGA DE LIBERAR LA MEMORIA DE OBJETOS NO REFERENCIADOS