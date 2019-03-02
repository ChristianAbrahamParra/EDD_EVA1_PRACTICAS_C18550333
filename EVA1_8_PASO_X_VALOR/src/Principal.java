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

        int aiArreglo[] = new int[100]; //Se crea un arreglo de tamaño 100
        llenar(aiArreglo); //Método para llenar arreglo
        imprimir(aiArreglo); //Método para imprimir el arreglo
        int iVal = 10; //Se crea una variable de tipo int de valor 10
        System.out.println("\niVal = " + iVal); // Mensaje de salida que imprime el valor de iVal
        incrementa(iVal); //Método incrementa con el valor iVal
        System.out.println("iVal = " + iVal); //Mensaje de salida que imprime el valor de iVal
    }

    public static void llenar(int[] aiArre) { //Aquí se recibe la dirección de un arreglo (enteros), no como tal el arreglo
        for (int i = 0; i < aiArre.length; i++) { //Ciclo for para empezar a rellenar el arreglo
            aiArre[i] = (int) (Math.random() * 100 + 1); //Se llena el arreglo con valores aleatorios del 1 al 100
        }

    }

    public static void imprimir(int[] aiArre) { //Método para imprimir el arreglo
        for (int i = 0; i < aiArre.length; i++) { //Ciclo para llenar arreglo
            System.out.print("[" + aiArre[i] + "]"); //Se imprimen los valores del arreglo
        }
    }

    public static void incrementa(int i) { //Método para incrementar el entero i
        i++; //Incrementa el valor i
    }
}

//donde está almacenado la variable y se puede modificar. Se manda una dirección de memoria -- paso por REFERENCIA
//se manda una copia del valor y no se puede modificar -- paso por VALOR
//JAVA sólo usa PASO POR VALOR

//Sí podemos modificar objetos
