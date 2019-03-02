
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
        
        Scanner sCaptu = new Scanner(System.in); //Clase scanner para introducir valores del teclado
        System.out.println("Introduce un número"); //Mensaje de introducir un número
        int iNum = sCaptu.nextInt(); //Variable de tipo int llamada iNum 
        sCaptu.nextLine(); //Salto de línea
        //for( int i = iNum; i>= 1; i--){
        //System.out.print(i + " - ");
    //}
    recursiveDown(iNum); //Se manda a llamar el método recursivo Down
    
    recursiveUp(iNum, 1); //Se manda a llamar el método recursivo Up
    }
    public static void recursiveDown(int iVal){ //Método recursivo para ir de ascendiente a decreciente
        /*DOS CARACTERÍSTICAS:
        1.- LLAMADA RECURSIVA: El método debe llamarse a sí mismo
        2.- DETENERSE: El método debe proporcionar maneras para detener la recursión
        */
        System.out.print(iVal); //Mensaje que imprime el parámetro iVal
        
        if(iVal > 1){ //Si iVal es mayor que 1
            System.out.print(" - "); //Se imprime un guión después del número
           recursiveDown(iVal - 1); //Decrece continuamente hasta que se rompa la condición
        }
        
         //se hace una llamada. Para detenerlo hay que evitar hacer la llamada recursiva
        //y una alternativa para no hacerlo
        
        
    }

    public static void recursiveUp(int iVal, int iCont){ //Método recursivo para ir de decreciente a ascendiente
        
        System.out.print(iCont); //Se imprime el parámetro iCont
        if(iCont < iVal){ //Si iCont es menor que iVal
            System.out.print(" - "); //Se imprime un guión después del valor
            recursiveUp(iVal, iCont + 1); //Aumenta continuamente hasta que se rompe la condición
        }
    }
}
