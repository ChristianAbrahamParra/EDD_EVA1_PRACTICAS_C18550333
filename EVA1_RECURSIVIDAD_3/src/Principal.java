
import java.util.Scanner;

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
        
        System.out.println("Ingrese una base"); //Mensaje para introducir la base
        Scanner sCaptu1 = new Scanner(System.in); //Se declara una variable para guardar la base del usuario
       
        System.out.println("Ingrese una potencia"); //Mensaje para introducir la potencia
        Scanner sCaptu2 = new Scanner(System.in); //Se declara una variable para guardar la potencia del usuario
        
        int base = sCaptu1.nextInt(); //La base se iguala a lo que introdujo el usuario
        int exponente = sCaptu2.nextInt(); //La potencia se iguala a lo que introdujo el usuario
        
        System.out.println("Resultado: " + potencia(base, exponente)); //Mensaje para mostrar el resultado de elevar el número deseado a la potencia deseada
    }
    
    public static double potencia(int base, int exponente){ //Método recursivo con parámetros base y exponente
        
        if(exponente == 0){ //Si el exponente es 0
            return 1; //Regresa un 1
        }
        else if (exponente == 1){ //Si el exponente es 1
            return base; //Regresa la misma base
        }
        else if (exponente < 0){ //Si el exponente es menor a 0
            return potencia(base, exponente+1)/base; //Regresa la operación para números negativos
            
        }
        else { //Si no
            return base*potencia(base, exponente-1); //Regresa la base multiplicada por la función recursiva
        }
    }
}
