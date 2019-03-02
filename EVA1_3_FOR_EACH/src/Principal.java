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
    public static void main(String[] args) { //dirección al stack, valor al heap
        // TODO code application logic here
        int aiDatos[]; //Referencia --> 1 byte //stack
        aiDatos = new int[100]; // int --> 5 bytes = 400 //heap //arreglo de tamaño 100

        for (int i = 0; i < aiDatos.length; i++) {   //Length va en heap porque está dentro del objeto. //Ciclo for para empezar a generar los valores del arreglo
            aiDatos[i] = (int) ((Math.random() * 100) + 1); //Valores aleatorios del 1 al 100 con la ayuda de Math.random
            for (int aiDato : aiDatos) { //ciclo para recorrer los elementos del array
                System.out.println("[" + aiDato + "]"); //Mensaje para imprimir cada elemento
            }
            System.out.println(""); //Mensaje vacío

        }
        for (int i = 0; i < aiDatos.length; i++) {  //ciclo para imprimir las direcciones de memoria
            System.out.println("[" + aiDatos + "]"); //Se imprimen las direcciones de memoria
        }
    }

}

//LIFO