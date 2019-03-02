
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
        System.out.println("Introduce un valor: " ); //Mensaje para introducir un valor
        int iNum = sCaptu.nextInt(); //Se declara una variiable de tipo int
        sCaptu.nextLine(); //Salto de línea
        System.out.println("Factorial (" + iNum + ") - " + factorial(iNum)); //Se imprime el número que se colicitó y después el resultado
        
        System.out.println("Factorial (" + iNum + ") - " + factorialRecu(iNum)); //Se imprime el número que se solicitó y después el resultado
    }
    
    public static int factorial(int iVal){ //Método con for 
        int iResu = 1; //Se declara la variable y se iguala a 1
        for (int i = 1 ; i<= iVal; i++){ //Ciclo for si i es menor o igual al número introducido
            iResu = iResu * i; //El resultado se multiplica por la i
        }
    
            return iResu; //Regresa el resultado
    
    }
    public static int factorialRecu(int iVal){ //Método recursivo sin ciclos
        if(iVal == 0) //Si el valor es igual a 0
            return 1; //Regresa un 1
        else //Si no
        return iVal * factorialRecu(iVal - 1); //Se regresa el número multiplicado por el mismo número pero menos 1 y así sucesivamente
    }

}
