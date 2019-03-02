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

    public static void main(String[] args) {
        //LLENAR CON 100 ENTEROS ALEATORIOS
        //IMPRIMIR
        //DIRECCIÓN DE MEMORIA
        //ELEMENTOS EN UNA LÍNEA
        int[] aiDatos = new int[100]; //Arreglo de tamaño 100

        for (int i = 0; i < aiDatos.length; i++) { //Ciclo for para empezar a llenar el arreglo
            aiDatos[i] = (int) (Math.random() * 100 + 1); //Se crean valores aleatorios del 1 al 100
        }
        System.out.println(aiDatos); //Mensaje de salida con el arreglo

        for (int aiDato : aiDatos) { // Se comenzarán a recorrer los elementos del arreglo
            System.out.print("[" + aiDato + "]"); //Mensaje de salida que imprimirá cada valor del arreglo
        }

        //Necesitamos un arreglo de tamaño 50
        /*aiDatos = new int[50];
        System.out.println("");
        System.out.println(aiDatos);
        for (int aiDato : aiDatos){
            System.out.print("[" + aiDato + "]");*/
        
        int[] aiCopia = aiDatos; //Se crea una copia del arreglo
        System.out.println(""); //Mensaje de salida vacío
        System.out.println("aiDatos = " + aiDatos); //Mensaje de salida con el arreglo original
        System.out.println("aiCopia = " + aiCopia); //Mensaje de salida con el arreglo copia

        aiDatos = new int[50]; //Nuevo arreglo de 50 elementos
        System.out.println(""); //Mensaje de salida vacío
        System.out.println(aiDatos); //Se imprimen los valores del arreglo
        System.out.println("\nIMPRIMIENDO DATOS"); //Mensaje de salida que dice "Imprimiendo datos"
        for (int aiDato : aiDatos) { //Se empiezan a recorrer los elementos de cada arreglo
            System.out.print("[" + aiDato + "]"); //Mensaje de salida para imprimir los datos
        }

        System.out.println("\nIMPRIMIENDO COPIA"); //Mensaje de salida "Imprimiendo copia"
        for (int i : aiCopia) { //Se empiezan a recorrer los elementos del arreglo
            System.out.print("[" + i + "]"); //Mensaje de salida para imprimir los elementos de la copia
        }

    }

}
