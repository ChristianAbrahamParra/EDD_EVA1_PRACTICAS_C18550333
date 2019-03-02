
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
        
        Scanner sCaptu = new Scanner(System.in); //Entrada de datos
        System.out.println("Introduce un número"); //Mensaje para que el usuario introduzca el número
        int Num = sCaptu.nextInt(); //Se convierte el nùmero ingresadoo a int
        sCaptu.nextLine(); //salto de linea
        
        System.out.println("Resultado: " + sumaDigitos(Num)); //Mensaje para mostrar la suma del dígito introducido
        
        
    }
    
    public static int sumaDigitos(int numero){ //Método recursivo con el parámetro número
       
        if(numero < 10){ //Si el número es menor a 10
            return numero; //regresa el mismo número, pues no tiene otro dígito
        }
        else{ //Si no
            return (numero % 10) + sumaDigitos(numero/10); //Regresa la operación para obtener la suma de todos los dígitos 
        }
    }
}