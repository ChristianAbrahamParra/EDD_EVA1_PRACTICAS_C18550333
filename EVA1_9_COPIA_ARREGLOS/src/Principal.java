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
       
       int[] aiArreglo = new int[100]; //Se crea arreglo con 100 valores
       llenar(aiArreglo); //Método para llenar el arreglo
       imprimir(aiArreglo); //Método para imprimir el arreglo
       System.out.println(""); //Mensaje de salida vacío
       //CREAR UNA COPIA
       //int[] aiCopia = aiArreglo; //NO FUNCIONA
       int [] aiCopia = new int[100]; //Se crea una copia del arreglo de tamaño 100
       //leer elemento por elemento y copiar
       for (int i=0; i<aiArreglo.length; i++){ //Ciclo for para empezar a rellenar el arreglo
           aiCopia[i] = aiArreglo[i]; //Se iguala la copia del arreglo al arreglo original
    }
       imprimir(aiCopia); //Método para imprimir la copia
       
    }
    public static void llenar(int[] aiArre) { //Aquí se recibe la dirección de un arreglo (enteros), no como tal el arreglo
        for (int i = 0; i < aiArre.length; i++) { //Ciclo for para recibir los enteros
            aiArre[i] = (int) (Math.random() * 100 + 1); //Valores aleatorios del 1 al 100
        }

    }

    public static void imprimir(int[] aiArre) { //Se imprimen los valores del arreglo con este método
        for (int i = 0; i < aiArre.length; i++) { //    Ciclo for para llenar el arreglo con valores
            System.out.print("[" + aiArre[i] + "]"); //Mensaje de salida el cual es enviado al método imprimir
        }
    }
}
