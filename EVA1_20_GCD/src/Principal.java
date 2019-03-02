
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
        
        Scanner sCaptu = new Scanner(System.in); //Clase Scanner para introducir valores del teclado
        
        
        System.out.println("Ingrese dos valores"); //Mensaje para introducir dos valores 
        int iDividendo = sCaptu.nextInt(); //Se declara una variable de tipo int y es convertido a int, es el dividendo
        int iDivisor = sCaptu.nextInt(); //Se declara una variable de tipo int y es convertido a int, es el divisor
        
        System.out.println("Máximo común divisor: " + gcd(iDividendo, iDivisor)); //Mensaje que muestra el máximo común divisor del número solicitado
       
        
        
        
       
        
        
        }
    
    
    public static int gcd(int iDividendo, int iDivisor){ //Método recursivo con parámetros que son el dividendo y el divisor
        if(iDividendo%iDivisor == 0){ //Si el residuo de dividir los dos números es igual a 0
            return iDivisor;        //entonces regresa el valor del divisor
    } else{ //Si no
            return gcd(iDivisor, iDividendo%iDivisor); //Regresa el valor del divisor y se va dividiendo constantemente hasta obtener el gcd
        }
}
}